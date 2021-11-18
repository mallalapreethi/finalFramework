package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.SearchUI;

public class SearchPage  extends ReadPropertyFile {
	
	
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	@Test
	public void SearchBar() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("<<-navigated to url->>");	
	
		
		SearchUI s=new SearchUI(driver);
		s.getSearch().sendKeys("harry potter gifts");
		s.getHarry().click();
		log.info("Serching successfull");
		
		Assert.assertEquals(s.getImage().getText(), "Harry Potter Plush Soft Toy");
		log.info("Assertion success");
		
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}
}
