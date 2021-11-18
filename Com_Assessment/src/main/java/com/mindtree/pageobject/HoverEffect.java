package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.HoverEffectUI;

public class HoverEffect extends ReadPropertyFile{
public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void HoverEffect() throws InterruptedException {	
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		log.info("<<<<navigated to url>>>>");
		HoverEffectUI h=new HoverEffectUI(driver);
		
		h.getAllOfIt().click();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(h.getImageMovment()).perform();
		log.info("Successfully performed actions");
		Thread.sleep(10000);
		
		
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();

}
}