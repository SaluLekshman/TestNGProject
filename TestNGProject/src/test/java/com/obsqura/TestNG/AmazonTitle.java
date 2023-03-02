package com.obsqura.TestNG;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonTitle extends Base {
	@Test
	public void LocatorId()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		
	}
	@Test
	public void locatorName()
	{
		
		driver.findElement(By.name("field-keywords"));
	}
	@Test
	public void locatorByCss()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	}
	@Test
	public void locatorByXpath()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
	}

}
