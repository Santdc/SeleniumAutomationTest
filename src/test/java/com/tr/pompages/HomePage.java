package com.tr.pompages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	boolean flag = false;
	String txt = null;
	WebElement element = null;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By imgSiteLogo = By.xpath(".//*[@id='header']//a[contains(@class,'logo')]");
	By txtJobTitle = By.id("fts_id");
	By btnFindBetter = By.xpath("//input[@value='Find Better']");
	
	/**
	 * This method help us to verify Site logo
	 * @param No params
	 * @return boolean
	 * @throws Exception
	 */
	public boolean isSiteLogoDisplayed() throws Exception{
		try {
			flag = driver.findElement(imgSiteLogo).isDisplayed();
			if (flag) {
				System.out.println("Site logo is displayed");
			}else {
				System.out.println("Site logo is displayed");
			}
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING SITE LOGO::"+"isSiteLogoDisplayed"+e.getLocalizedMessage());
		}
		return flag;
	}
	
	public HomePage enterJobTitle(String jobtitle){
		try {
			element = driver.findElement(txtJobTitle); 
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "Jobtitle field is not displayed");
			element.sendKeys(jobtitle);
		} catch (Exception e) {
			
					}
		
		return this;
	}
	
	public SearchResultPage clickOnFindBetter(){
		try {
			element = driver.findElement(btnFindBetter);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "Find better button is not displayed");
			element.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			
					}
		 
		return new SearchResultPage(driver);
	}
}
