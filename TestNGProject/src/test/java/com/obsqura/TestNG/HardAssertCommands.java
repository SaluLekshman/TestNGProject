package com.obsqura.TestNG;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class HardAssertCommands extends Base {
	@Test
	public void hardAssert()
	{

		String expectedurl="https://www.amazon.inmm/";
		String expectedPagesource="<!-- sp:end-feature:head-start999 -->";
		driver.navigate().to("https://www.flipkart.com/");
		String actualurl=driver.getCurrentUrl();
		assertNotEquals(expectedurl,actualurl," Not navigated to flipkart");
		String pagesource=driver.getPageSource();
		assertFalse(pagesource.contains(expectedPagesource));
	    
	}
	

}
