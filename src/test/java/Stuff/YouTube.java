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


public class YouTube extends TestCase {
	
	public WebDriver chrome;
	
	public String [][] websites = Stuff.Data.websites();
	
	@BeforeClass
	public void Before() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		 chrome = new ChromeDriver();
		 System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "YouTube"})
	public void testOne() {
		chrome.get(websites[0][0]);
		String title = chrome.getTitle();
		Assert.assertEquals(title, websites[0][1]);
	}
	
	
	@Test(groups = {"p3", "Gamasutra"})
	public void testThree() {
		chrome.get(websites[2][0]);
		String title = chrome.getTitle();
		Assert.assertEquals(title, websites[2][1]);
		
		WebElement articleOne = chrome.findElement(By.linkText("Divinity: Original Sin 2 dev explores how open game dev can help (and hurt) progress"));
		articleOne.click();
		
		WebElement articleTwo = chrome.findElement(By.linkText(" full PC Gamer interview"));
		articleTwo.click();
	}
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
