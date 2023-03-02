package com.obsqura.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base {
	@Test
	/*public void sendKeys()
	{
		WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("iphone");//to enter text in search 
		searchBar.clear();
		searchBar.sendKeys("iphone");//to enter text in search 
		WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();//to click
	}*/
	public void verifySingleInputField()
	{
		String inputMessage="Hello";
		String ExpectedMessage="Your Message : "+inputMessage;
		
		WebElement enterMessage=driver.findElement(By.id("single-input-field"));
		boolean isEnterMessageDisplayed=enterMessage.isDisplayed();
		assertTrue(isEnterMessageDisplayed,"Enter message field is not displayed");
		enterMessage.sendKeys(inputMessage);
		int entermessageX=enterMessage.getLocation().getX();
		int entermessageY=enterMessage.getLocation().getY();
		
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		boolean isShowMessageButtonEnabled=showMessageButton.isEnabled();
		String showMessageText=showMessageButton.getText();
		assertTrue(isShowMessageButtonEnabled,"show message button is not enabled");
		showMessageButton.click();
		String showMessageButtonBackgroundcolor= showMessageButton.getCssValue("background-color");
		Dimension sizeshowMessageButton=showMessageButton.getSize();
		int height=showMessageButton.getSize().getHeight();		
		int width=showMessageButton.getSize().getWidth();
		Point location=showMessageButton.getLocation();
		int showMessageButtonX=location.getX();
		int showMessageButtonY=location.getY();
		
		WebElement yourMessage=driver.findElement(By.cssSelector("div#message-one"));
		String yourMessageText=yourMessage.getText();
		assertEquals( ExpectedMessage, yourMessageText,"Entered and Your Messages are not equal");//assignment
		
		String  tagNameEnterMessage=enterMessage.getTagName();
		String tagNameShowMessage=showMessageButton.getTagName();
		
		String  getAttributeClass=enterMessage.getAttribute("class");
		String  getAttributeId=enterMessage.getAttribute("id");
		String  getAttributePlaceholder=enterMessage.getAttribute("placeholder");
		
		
		
	}
}
