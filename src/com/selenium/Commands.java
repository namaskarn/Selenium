package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Commands {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file\\chrome.exe");		

				
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
// get current url as tect
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://the-internet.herokuapp.com/login");
		
//get the title
		
		String title=driver.getCurrentUrl();
		System.out.println(title);
		
// get window handle
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("#content >div > a")).click();
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);

	}

}
