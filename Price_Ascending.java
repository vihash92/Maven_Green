package org.amz;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Price_Ascending {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver da=new ChromeDriver();
		da.get("https://www.amazon.in/s?k=iphone&crid=3QZVY0RN10V99&sprefix=iphone%2Caps%2C325&ref=nb_sb_noss_1");                         ////span[@class="a-price"]
		
		List <WebElement> PriceASC=da.findElements(By.xpath("//span[@class=\"a-price\"]"));
	System.out.println(PriceASC);
	Collections.sort(PriceASC, null);
	System.out.println(PriceASC);
	}

}
