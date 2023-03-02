package com.obsqura.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public  WebDriver driver;

	
	  @BeforeMethod
	  public void initialiseBrowser() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SHALU\\eclipse workspace\\TestNGProject\\src\\main\\java\\Resources\\chromedriver.exe"); 
		  driver=new ChromeDriver(); 
		  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php"); 
		  //driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();//to maximize the window screen of amazon
	
	  }
	 


	@AfterMethod
	public void driverQuit()
	{
		driver.quit();
	}

}
