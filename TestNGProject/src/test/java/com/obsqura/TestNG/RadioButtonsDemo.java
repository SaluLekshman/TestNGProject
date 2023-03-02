package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonsDemo extends Base {
	
	@Test
	public void radioButtonDemo()
	{
		SelectCategory selectcategory=new SelectCategory (driver);
		selectcategory.selectCategory("Radio Buttons Demo");
		WebElement femaleButton=driver.findElement(By.cssSelector("input#inlineRadio2"));
		femaleButton.click();
		
	}

}
