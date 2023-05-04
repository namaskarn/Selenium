package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Search {
	
	WebDriver driver;
	JavascriptExecutor jse;

	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file//chrome.exe");		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		search();
		
		
		driver.get("http://www.amazon.com");
		 search();
		 
		
	}

	public void search() {
		
		driver.findElement(By.Id("www.amazon.com");
		Thread.sleep(3000);
		driver.findElement(By.id("")).click();
		jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll()0,800)");
		driver.findElement(By.xpath("")).click();
		
		
		
		
	}

	public static void main(String[] args) {
		try {
			Search myobj= search();
			myobj.invokeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
