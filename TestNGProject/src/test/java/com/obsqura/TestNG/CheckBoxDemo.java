package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base {
	
	@Test
	public void checkBoxDemo()
	{
		SelectCategory selectcategory=new SelectCategory (driver);
		selectcategory.selectCategory("Checkbox Demo");
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	    checkBox.click();
		
	}

}
