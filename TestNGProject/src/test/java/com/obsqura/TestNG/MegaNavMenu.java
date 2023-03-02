package com.obsqura.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MegaNavMenu extends Base{
	
	@Test
	public void navigateTomegaNavMenu(String input)
	{
		
		List<WebElement> mainMenuList=driver.findElements(By.xpath("//li[@class='nav-item']//a"));
		for(WebElement menus:mainMenuList)
		{
			String menuName= menus.getText();
			if(menuName.equalsIgnoreCase(input))
			{
				 menus.click();
				 break;
				
			}
		}
	}

}
