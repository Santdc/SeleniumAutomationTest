package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OurPassionHome {
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
	
	public void Verified_OurFashion_Title(){
		String ExpectedTitle="Our Passion";
		String ActualTitle=driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("The Expected title of our ashion is matching with "+ActualTitle);
			
		} else {
			System.out.println("The Expected title Is mismatching with actual Title");

		}
	}
	@Test
	
	public void Verify_Header_Content(){
		
		driver.findElement(By.xpath(".//h1"));
		System.out.println("The Headercontent is: Our Passion");
		
		driver.findElement(By.xpath(".//h2"));
		
		System.out.println("The second header is :The Experts");
	}
	@Test 
	public void Verify_OrganicImage(){
		
		driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000450914876']/div"));
		

	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	

}
