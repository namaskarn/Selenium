package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	
	WebDriver driver;

	public void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file//chrome.exe");		
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.yatra.com");
			

			
			
			driver.get("http://www.amazon.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}

public void closeBrowser() {
	
	driver.close();
	
}
	
	

	public static void main(String[] args) {
		Close obj = new Close();
		obj.closeBrowser();

	}

}
