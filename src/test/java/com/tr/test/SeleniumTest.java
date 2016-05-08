package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

	WebDriver driver;
	@BeforeTest
    public void setuo(){
		driver=new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test(enabled=true)
	public void Verify_ourfashin_link(){
		driver.findElement(By.linkText("Our Passion")).click();
		System.out.println("Our Pashion Link is present");
	}
}
