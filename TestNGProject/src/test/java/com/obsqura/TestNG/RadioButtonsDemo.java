package com.obsqura.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonsDemo extends Base {
	
	@Test
	public void femaleRadioButtonDemo()
	{
		String expectedSelectedValue="Radio button 'Female' is checked";
		SelectCategory selectcategory=new SelectCategory (driver);//object
		selectcategory.selectCategory("Radio Buttons Demo");//calling method selectCategory()
		WebElement femaleButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleButtonNotselected=femaleButton.isSelected();
		assertFalse(femaleButtonNotselected,"The female button is selected");
		femaleButton.click();
		boolean femaleButtonIsselected=femaleButton.isSelected();
		assertTrue(femaleButtonIsselected,"The female button is not Selected");
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.isEnabled();
		showSelectedValue.click();
		WebElement radioButtonFemaleIsChecked=driver.findElement(By.id("message-one"));
		String actualSelectedvalue= radioButtonFemaleIsChecked.getText();
		assertEquals(expectedSelectedValue,actualSelectedvalue,"The selected value is not female");
	}
	@Test
	public void maleRadioButtonDemo()
	{
		String expectedSelectedValue="Radio button 'Male' is checked";
		SelectCategory selectcategory=new SelectCategory (driver);//object
	    selectcategory.selectCategory("Radio Buttons Demo");
	    WebElement maleButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	    boolean maleButtonNotSelected=maleButton.isSelected();
	    assertFalse(maleButtonNotSelected,"The male button is selected");
	    maleButton.click();
	    boolean maleButtonIsSelected=maleButton.isSelected();
	    assertTrue(maleButtonIsSelected,"The male button is not selected");
	    WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.isEnabled();
		showSelectedValue.click();
		WebElement radioButtonmaleIsChecked =driver.findElement(By.id("message-one"));
		String actualSelectedvalue=radioButtonmaleIsChecked.getText();
		assertEquals(expectedSelectedValue,actualSelectedvalue,"The selected value is not male");
	  
		
	}
	@Test
	public void groupRadioButtonDemo()
	{
		String expectedGenderAgeGroup="Gender : Male"+"\n"+"Age group: 45 to 60";
		SelectCategory selectcategory=new SelectCategory (driver);//object
	    selectcategory.selectCategory("Radio Buttons Demo");
	    WebElement malePatientGender=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
	    malePatientGender.click();
	    malePatientGender.isSelected();
	    WebElement PatientsAgeGroup45To60=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
	    PatientsAgeGroup45To60.click();
	    PatientsAgeGroup45To60.isSelected();
	    WebElement getResult=driver.findElement(By.xpath("//button[@id='button-two']"));
	    getResult.click();
	    getResult.isEnabled();
	    WebElement GenderAgeGroup=driver.findElement(By.cssSelector("div.my-2[id=message-two]"));
	    String actualGenderAgeGroup=GenderAgeGroup.getText();
	    assertEquals(expectedGenderAgeGroup,actualGenderAgeGroup,"The selected Gender and Agegroups are not equal ");
	    
	    
	    
		
	}

}
