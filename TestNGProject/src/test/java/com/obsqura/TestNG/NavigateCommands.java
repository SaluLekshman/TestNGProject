package com.obsqura.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NavigateCommands extends Base{
	@Test
	public void navigateTo()
	{
	String expectedUrl="https://www.flipkart.com/";
	driver.navigate().to("https://www.flipkart.com/");
    String actualurl=driver.getCurrentUrl();//flipkart
    assertEquals(expectedUrl,actualurl,"url is not same");
	}
	@Test
	public void navigateBack()
	{
	String expectedpage="https://www.amazon.in/";
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
    String actualpage=driver.getCurrentUrl();
    assertEquals(expectedpage,actualpage,"pages are  not same");
	}
	@Test
	public void navigateForward()
	{
		String expectedpage="https://www.flipkart.com/";
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
	    String actualpage=driver.getCurrentUrl();
	    assertEquals(expectedpage,actualpage,"pages are  not same");
		
	}
	@Test
	public void navigateRefresh()
	{
		String expectedpage="https://www.flipkart.com/";
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String actualpage=driver.getCurrentUrl();
		assertEquals(expectedpage,actualpage,"Refresh url are  not same");
	}
		
			
	

}
