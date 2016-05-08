package com.tr.pompages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tr.pompages.HomePage;
import com.tr.pompages.SearchResultPage;

public class HomePageTest {

	WebDriver driver;
	HomePage homePage = null;
	SearchResultPage searchResultPage = null;
	
	@BeforeTest
	
	public void setUp(){
		
		driver= new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyHomePage() throws Exception{
		
		homePage = new HomePage(driver);
		boolean flag = homePage.isSiteLogoDisplayed();
		Assert.assertTrue(flag, "Site logo is not displayed");
		homePage.enterJobTitle("Selenium");
		searchResultPage = homePage.clickOnFindBetter();
				
	}
}
