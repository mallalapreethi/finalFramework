package com.mindtree.pageobject;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.GiftCardUI;

public class GiftCard extends ReadPropertyFile{
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void giftCard() throws InterruptedException {

		GiftCardUI gc = new GiftCardUI(driver);
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		
		Thread.sleep(3000);
		gc.getGifCard().click();
		Thread.sleep(3000);
		gc.getCard().click();
		Thread.sleep(2000);
		gc.getCardCost().click();
		Thread.sleep(3000);
		gc.getNailPolish().click();
		Thread.sleep(3000);
		gc.getMagicDecal().click();
		Thread.sleep(3000);
		// popup
				System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");

		gc.getAddToCart().click();
		System.out.println("successfully added to cart");
		Thread.sleep(3000);
		System.out.println("The Total Bill in Cart is "+gc.getTotalBill().getText());
		gc.getHome().click();

	}
/*
	 @AfterTest public void close() {
	  
	 driver.close(); driver = null; }
	 
*/
}
