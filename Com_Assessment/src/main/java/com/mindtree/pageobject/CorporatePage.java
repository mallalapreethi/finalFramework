package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.CorporateUI;

public class CorporatePage extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void CorporateGifts() throws InterruptedException {

		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("<<navigated  to  url>>");
		CorporateUI c = new CorporateUI(driver);
		c.getCorporate().click();
		c.getFullName().sendKeys("mallala preethi");
		c.getEmail().sendKeys("mallalapreethi@gmail.com");
		c.getPhone().sendKeys("9032215885");
		c.getDesc().sendKeys("this is description");
		c.getSubmit().click();
		log.info("Submitted successfully");

	}

	@AfterTest
	public void close() {

		driver.quit();

	}

}
