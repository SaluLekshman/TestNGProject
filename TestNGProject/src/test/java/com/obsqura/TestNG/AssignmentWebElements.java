package com.obsqura.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssignmentWebElements extends Base{
	@Test
	public void verifyInputFields()
	{
		int inputA=10;
		int inputB=20;
		int totalValue=inputA+inputB;
		String expectedTotal="Total A + B : "+totalValue;
		
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		boolean isenterValueADisplayed= enterValueA.isDisplayed();
		assertTrue(isenterValueADisplayed,"The enter value A is not displayed");
		enterValueA.sendKeys(String.valueOf(inputA));
		
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		boolean isenterValueBDisplayed= enterValueB.isDisplayed();
		assertTrue(isenterValueBDisplayed,"The enter value B is not displayed");
		enterValueB.sendKeys(String.valueOf(inputB));
		
		WebElement getTotal=driver.findElement(By.cssSelector("button#button-two"));
		boolean isGetTotalButtonEnabled=getTotal.isEnabled();
		assertTrue(isGetTotalButtonEnabled,"The Get Total button is not displayed");
		getTotal.click();
		
		WebElement total=driver.findElement(By.id("message-two"));
		String actualTotal=total.getText();
		assertEquals(expectedTotal,actualTotal,"The total are not correct");
		
	}
	@Test
	public void showMessageButtonColor()
	{  String expectedshowMessageButtoncolor="rgba(255, 255, 255, 1)";
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		boolean isShowMessageButtonEnabled=showMessageButton.isEnabled();
		String showMessageButtoncolor= showMessageButton.getCssValue("color");
		assertEquals(expectedshowMessageButtoncolor,showMessageButtoncolor,"The show message button text color is not white");
		
	}
	@Test
	public void ShowMessageTextAlignment()
	{
		String expectedshowMessageButtonAlignment="center";
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		String showMessageButtonAlignment= showMessageButton.getCssValue("text-align");
		assertEquals( expectedshowMessageButtonAlignment,showMessageButtonAlignment,"The alignment of show message button is not at centre");	
	}
	@Test
	public void showMessageButtonShape()
	{
		String expectedshowMessageButtonShape="4px";
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		String showMessageButtonShape= showMessageButton.getCssValue("border-radius");
		assertEquals(expectedshowMessageButtonShape,showMessageButtonShape,"The shape of show message button is not oval");
	}
	@Test
	public void showMessagebuttonHeight() 
	{
		String expectedshowMessageButtonHeight="24px";
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		String showMessageButtonHeight= showMessageButton.getCssValue("line-height");
		assertEquals(expectedshowMessageButtonHeight,showMessageButtonHeight,"The line height is not"+expectedshowMessageButtonHeight);
		
	}
	@Test
	public void showMessageButtonPosition()
	{
		
		WebElement messageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		int messageFieldY=messageField.getLocation().getY();
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		int showMessageButtonY=showMessageButton.getLocation().getY();
		assertTrue(showMessageButtonY> messageFieldY,"The show message button is not comes under message field");
	}
	
	
	@Test
	public  void getTotalButtonPosition()
	{
		
		WebElement enterValueBButton=driver.findElement(By.id("value-b"));
		int enterValueBButtonY =enterValueBButton.getLocation().getY();
		WebElement getTotalButton=driver.findElement(By.id("button-two"));
		int GetTotalButtonY=getTotalButton.getLocation().getY();
		assertTrue(GetTotalButtonY>enterValueBButtonY,"The  GetTotal button not comes under  Enter Value B Button");
		
	}
	@Test
	public void getTotalButtonSize()
	{
		int expectedgetTotalButtonHeight=38;
		int expectedgetTotalButtonWidth=93;
		WebElement getTotalButton=driver.findElement(By.id("button-two"));
	    int  getTotalButtonHeight= getTotalButton.getSize().getHeight();
	    assertEquals(expectedgetTotalButtonHeight,getTotalButtonHeight,"The GetTotal button height is not equal to"+expectedgetTotalButtonHeight);
		int  getTotalButtonWidth= getTotalButton.getSize().getWidth();
		assertEquals(expectedgetTotalButtonWidth,getTotalButtonWidth,"The Get Total button width is not equal to"+expectedgetTotalButtonWidth);
		
	}
	

}
