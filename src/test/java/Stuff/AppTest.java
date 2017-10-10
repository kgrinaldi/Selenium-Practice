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
	
	public String [][] websites = { {"https://www.youtube.com", "YouTube"}, 
	                              {"https://www.reddit.com","reddit: the front page of the internet"}};
	
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
	
	@Test
	public void testTwo() {
		chrome.get(websites[1][0]);
		String title = chrome.getTitle();
		Assert.assertEquals(title, websites [1][1]);
		
		WebElement username = chrome.findElement(By.name("user"));
	    WebElement password = chrome.findElement(By.name("passwd"));
	    WebElement login = chrome.findElement(By.className("btn"));
	    
	    username.sendKeys("ridleysamus");
		password.sendKeys("G");
		login.click();
	}
	
	@AfterMethod
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
