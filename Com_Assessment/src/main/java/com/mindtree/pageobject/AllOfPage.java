package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.AllOfUI;

public class AllOfPage extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());
//driver initialization
	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void AllOfItM() throws InterruptedException {
		AllOfUI a = new AllOfUI(driver);
		
       //get url from config.properties file 
		driver.get(p.getProperty("url"));
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		log.info("<navigated to given url>");
		a.getAllOfIt().click();
		a.getItem().click();
		Thread.sleep(2000);
		a.getAddToCart().click();
		log.info("successfully added to cart");
		Thread.sleep(2000);
		a.getGiftWrap().click();
		a.getGiftNote().click();
		Thread.sleep(2000);
		a.getFromDetails().sendKeys("preethi");
		a.getToDetails().sendKeys("Mindtree");
		a.getMessage().sendKeys("Christmas Gift");
		Thread.sleep(2000);
		System.out.println(a.getTotal().getText());
//popup
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		Thread.sleep(2000);

		a.getContinueShopping().click();
		Thread.sleep(2000);
		a.getAllOfIt().click();

	}

	@AfterTest
	public void close() {

		driver.close();

	}
}
