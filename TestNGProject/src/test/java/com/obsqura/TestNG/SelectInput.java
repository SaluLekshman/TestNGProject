package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectInput extends Base {
	
	@Test
	public void selectInputDemo()
	{
		String input="Select Input";
		SelectCategory selectcategory=new SelectCategory (driver);
		selectcategory.selectCategory(input);
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		select.selectByIndex(1);
	}

}
