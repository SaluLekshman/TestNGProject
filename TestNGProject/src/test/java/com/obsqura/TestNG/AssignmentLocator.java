package com.obsqura.TestNG;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

	public class AssignmentLocator extends Base {
		@Test
		public void locatingById()
		{
			driver.findElement(By.id("twotabsearchtextbox"));
			driver.findElement(By.id("nav-global-location-popover-link"));
			driver.findElement(By.id("nav-logo-sprites"));//amazon.in
			driver.findElement(By.id("glow-ingress-block"));//hello SELECT YOUR ADDRESS
			driver.findElement(By.id("nav-orders"));//return &orders
			driver.findElement(By.id("nav-cart"));//add to cart
			driver.findElement(By.id("nav-link-amazonprime"));//prime
			driver.findElement(By.id("skiplink"));
			driver.navigate().to("https://www.flipkart.com/");
			String currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
			//driver.findElement(By.id(""))
		}
		@Test
		public void locatingByClassName()
		{
			driver.findElement(By.className("hm-icon-label"));
			driver.findElement(By.className("icp-nav-link-inner"));//EN
			driver.navigate().to("https://www.flipkart.com/");
			String currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
			driver.findElement(By.className("_3704LK"));//search grocery products
			driver.findElement(By.className("exehdJ"));//login
			driver.findElement(By.className("_3SkBxJ"));//cart
			
		}
		//@Test
		public void locatingByName()
		{
			driver.findElement(By.name("google-site-verification"));
			driver.findElement(By.name("dropdown-selection-ubb"));
			driver.findElement(By.name("google"));
			driver.findElement(By.name("glow-validation-token"));
			driver.findElement(By.name("site-search"));
		}
		@Test
		public void locatingBylinkText()
		{
			  driver.findElement(By.linkText("Mobiles"));
			  driver.findElement(By.linkText(""));
			  driver.navigate().to("https://www.flipkart.com/");
			  String currentUrl=driver.getCurrentUrl();
			  driver.findElement(By.linkText("Become a Seller"));
			  driver.findElement(By.linkText("Appliances"));
		}
		@Test
		public void locatingByPartiallinkText()
		{
			driver.findElement(By.partialLinkText("Become"));
			
		}
		@Test
		public void locatingByCssId()
		{
			driver.findElement(By.cssSelector("input#unifiedLocation1ClickAddress"));
		
			
		}
		@Test
		public void locatingByCssName()
		{
			driver.findElement(By.cssSelector("div.a-cardui gw-sign-in sign-in-v2"));
		
			
	
			
		}
		@Test
		public void locatingByCssLabel()
		{
			driver.findElement(By.cssSelector("a.skip-link[id=skiplink]"));//tag.class[attribute=value]
			
			
			
		}
		@Test
		public void locatingByXpath()
		{
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			driver.findElement(By.xpath("//a[@id='skiplink']"));
			driver.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress']"));
			driver.findElement(By.xpath("//div[@id='nav-global-location-slot']"));
			driver.findElement(By.xpath("//div[@class='a-cardui gw-sign-in sign-in-v2']"));
			driver.findElement(By.xpath("//div[@id='desktop-grid-4']"));
			driver.findElement(By.xpath("//div[@id='desktop-grid-3']"));
			driver.findElement(By.xpath("//div[@id='desktop-grid-2']"));
			driver.findElement(By.xpath("//div[@id='desktop-grid-1']"));
			driver.findElement(By.xpath("//meta[@name='keywords']"));
			driver.findElement(By.xpath("//meta[@name='description']"));
			driver.findElement(By.xpath("//meta[@name='twitter:card']"));
			
	}
	}



