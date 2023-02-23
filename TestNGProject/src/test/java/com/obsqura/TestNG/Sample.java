package com.obsqura.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
@Test
     public class Sample extends Base {
	
			/*
			 * public void display() {
			 * 
			 * String pagesource=driver.getPageSource(); //String string="amazon"; // String
			 * pagesource1=driver.getPageSource(); // System.out.println(pagesource1);
			 * driver.navigate().to("https://www.flipkart.com/"); boolean
			 * actualurl=driver.getCurrentUrl().contains(pagesource);
			 * System.out.println("The url not contain the word amazon  "+actualurl);
			 * assertFalse(actualurl); }
			 */
	 
	@Test
	
	  public void navigateTo() { 
	  String pagesource=driver.getPageSource();
	  //System.out.println( pagesource);
	  driver.navigate().to("https://www.flipkart.com/");
	  boolean actualurl=driver.getCurrentUrl().contains(pagesource);
	  assertNotNull(actualurl,"amazon site is not");
	  
	  
	   }
	 

}
