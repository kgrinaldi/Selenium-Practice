package Stuff;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import junit.framework.TestCase;


public class AppTest extends TestCase {
	
	public WebDriver chrome;
	
	public String [][] websites = { {"https://www.youtube.com", "YouTube"} };
	
	@BeforeMethod
	public void Before() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		 chrome = new ChromeDriver();
		 System.out.println("Your journey has begun");
	}
	
	@Test
	public void testOne() {
		chrome.get(websites[0][0]);
		String title = chrome.getTitle();
		Assert.assertEquals(title, websites[0][1]);
	}
	
	@AfterMethod
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
