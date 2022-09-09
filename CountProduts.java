package org.amz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountProduts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver ds=new ChromeDriver();
		ds.get("https://www.amazon.in/s?k=iphone&crid=3QZVY0RN10V99&sprefix=iphone%2Caps%2C325&ref=nb_sb_noss_1");
		
		List <WebElement> price=ds.findElements(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
		System.out.println("Total no of Produts:"+price.size());
	}

}
