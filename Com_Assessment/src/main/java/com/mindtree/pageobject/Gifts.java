package com.mindtree.pageobject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.GiftsUI;

public class Gifts extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	@Test
	public void GiftHover() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		log.info("<<<navigated to url>>>");	
		
		
		GiftsUI g=new GiftsUI(driver);
		Actions action = new Actions(driver);

		action.moveToElement(g.getGifts()).perform();
		g.getBaby().click();	
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}
	}

