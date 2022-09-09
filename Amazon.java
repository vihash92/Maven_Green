package org.amz;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=iphone&crid=3QZVY0RN10V99&sprefix=iphone%2Caps%2C325&ref=nb_sb_noss_1");
		
		List <WebElement> resultList=driver.findElements(By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]"));
		
		for(WebElement result:resultList) {
			System.out.println(result.getText());
		}
		
		System.out.println("..prince in ascending order..");
		
		List <WebElement>resultPrice=driver.findElements(By.xpath("//span[@class=\"a-price\"]"));
		
		for(int i=0;i<resultPrice.size();i++) {
			System.out.println(resultPrice.get(i).getText());
		}
		
	}

}
