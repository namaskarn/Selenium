package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPractice {
	
WebDriver driver;

public void invokeBrowser(){
	
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file//chrome.exe");		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		getCommands();
		
		driver.get("http://www.amazon.com");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
}


public void getCommands() {
	
	driver.get("http://www.facebook.com");
	
	String titleOfThePage=driver.getTitle();
	
	System.out.println("Title of the page is :"+titleOfThePage);
	driver.findElement(By.linkText("Todays Deals")).click();
	String CurrentUrl=driver.getCurrentUrl();
	
	System.out.println("The Current url is :"+CurrentUrl);
	
}

public static void main(String[] args) {

	SeleniumPractice myobj=new SeleniumPractice();
	myobj.invokeBrowser();

















	}

}
