package Stuff;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import junit.framework.TestCase;


public class reddit extends TestCase {
	
	public WebDriver chrome;
	
	public String [][] websites = Stuff.Data.websites();

	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "reddit"})
	public void testLoad() {
		chrome.get(websites[1][0]);
		String title = chrome.getTitle();
		Assert.assertEquals(title, websites [1][1]);
	}
	
	@Test(groups = {"p2", "reddit"})
	public void testLogin() {
		WebElement username = chrome.findElement(By.name("user"));
	    WebElement password = chrome.findElement(By.name("passwd"));
	    WebElement login = chrome.findElement(By.className("btn"));
	    
	    username.sendKeys("ridleysamus");
		password.sendKeys("G");
		login.click();
	}
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}

}
