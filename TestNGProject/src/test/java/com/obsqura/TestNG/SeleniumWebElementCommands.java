package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumWebElementCommands extends Base {
	@Test
	public void webElements()
	{
		//Selenium - Automation Practice Form
		driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("salu");
		WebElement secondName=driver.findElement(By.name("lastname"));
		secondName.sendKeys("Lekshman");
		WebElement button=driver.findElement(By.xpath("//button[@name='submit']"));
		button.submit();
	}

}
