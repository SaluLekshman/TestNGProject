package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test
	public void locatingById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-global-location-popover-link"));
		
	}
	@Test
	public void locatingByClassName()
	{
		driver.findElement(By.className("hm-icon-label"));
		driver.findElement(By.className("icp-nav-link-inner"));//EN
		
	}
	@Test
	public void locatingByName()
	{
		driver.findElement(By.name("description"));
		driver.findElement(By.name("keywords"));
		driver.findElement(By.name("dropdown-selection"));
	}
	@Test
	public void locatingBylinkText()
	{
		driver.findElement(By.linkText("Mobiles"));
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText("Today's Deals"));
	}
	@Test
	public void locatingByPartiallinkText()
	{
		driver.findElement(By.partialLinkText("Today's"));
		driver.findElement(By.partialLinkText("Digital"));
		//synatx driver.findElement(By.tagName("img"));
		
		
	}
	@Test
	public void locatingByCssId()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
	}
	@Test
	public void locatingByCssName()
	{
		driver.findElement(By.cssSelector("a.skip-link"));
		
		
	}
	@Test
	public void locatingByCssLabel()
	{
		driver.findElement(By.cssSelector("label[for=twotabsearchtextbox]"));
		driver.findElement(By.cssSelector("a.skip-link[id=skiplink]"));//tag.class[attribute=value]
		
		
		
	}
	@Test
	public void locatingByXpath()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
	}
	
	
}
