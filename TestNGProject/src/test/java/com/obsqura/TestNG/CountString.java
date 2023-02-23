package com.obsqura.TestNG;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class CountString extends Base {
	@Test
	public void countString()
	{
	    String actualurl=driver.getCurrentUrl();
	    //String actualurl="flipkart";
		driver.navigate().to("https://www.flipkart.com/");
		String myStringispagesource=driver.getPageSource();
		int count=0,index=0;
		ArrayList<Integer> indices=new ArrayList<Integer>();
		while((index= myStringispagesource.indexOf(actualurl,index))!=-1)
		{
			count++;
			indices.add(index);
			index++;
			
		}
		System.out.println("Total occurences of a substring in the given string :"+count);
		System.out.println("indices of substring are  "+indices);
		assertNotNull(count, "actualurl is present in myStringispagesource");
	}
	}


