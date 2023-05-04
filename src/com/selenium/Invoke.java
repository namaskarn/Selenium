package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke {
	
	WebDriver driver;

	public void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file//chrome.exe");		
			
			driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			navigateCommands();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public void navigateCommands() {
		
		try {
			driver.navigate().to("http://www.facebook.com");
			driver.findElement(By.xpath("")).click();
			driver.findElement(By.xpath("")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public static void main(String[] args) {
		
		Invoke myobj=new Invoke();
		myobj.invokeBrowser();

	}

}
