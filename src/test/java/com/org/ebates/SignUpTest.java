package com.org.ebates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SignUpTest {
	@Test
	public void SignUpTest() throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebates.com/");
		driver.findElement(By.xpath("//*[@id=\"header-main\"]/div[1]/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-tab7\"]/a")).click();
		Assert.assertTrue(driver.getPageSource().contains("Luxury Deals"));
		System.out.println("Sleep");
		driver.close();
	}

}


