package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edureka {
	
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			
System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file\\chrome.exe");		

WebDriver driver;			
driver=new ChromeDriver();
driver.get("http://www.facebook.com");// it will open facebook
driver.manage().window().maximize();// it will maximize window
WebElement day1 = driver.findElement(By.id("day"));//it will find where is day box
Select oselect = new Select(day1);// it will create the object of day
Thread.sleep(3000);// it will wait for loading
oselect.selectByIndex(30);//it will choose the day which i want
WebElement months = (WebElement) driver.findElements(By.id("month"));//it will find where is month box
Select month_m1 =new Select(months);//it will create the object of month
Thread.sleep(3000);//it will wait till load
month_m1.selectByVisibleText("Sept");//it will choose month which i want
WebElement year_y = driver.findElement(By.id("year"));//it will find where is year
Select year_y1 = new Select(year_y);//it will create object for year
Thread.sleep(3000);//it will wait for page load
year_y1.deselectByValue("1977");//it will choose the year which i need
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
