package com.mindtree.pageobject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.ReadMoreUI;

public class ReadMorePage extends ReadPropertyFile {

	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	 @AfterTest
	 public void close() {
	  
	  driver.close(); driver = null;
	  
	  }
	@Test
	public void Scrolling() throws InterruptedException {
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");

		
		System.out.println("Running Read More Page");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		ReadMoreUI r = new ReadMoreUI(driver);
		js.executeScript("arguments[0].scrollIntoView();", r.getReadMore());
		r.getReadMore().click();
		Thread.sleep(3000);
		System.out.println("Clicked on Read More");
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-350)", "");
		
		
	}

}
