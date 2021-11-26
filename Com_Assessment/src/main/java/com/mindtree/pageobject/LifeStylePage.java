package com.mindtree.pageobject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.LifeStyleUI;

public class LifeStylePage extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void LifeStyle() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LifeStyleUI l = new LifeStyleUI(driver);

		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		log.info("<<<<<navigated to url>>>>>");
		Actions action = new Actions(driver);

		action.moveToElement(l.getLifeStyle()).perform();
		l.getClocks().click();
		//Thread.sleep(2000);
		Select s = new Select(l.getSort());
		s.selectByIndex(5);
		l.getItem().click();
		l.getPlus().click();
		l.getPincode().sendKeys("509102");
		//Thread.sleep(3000);
		l.getcheck().click();
		//Thread.sleep(5000);
		System.out.println(l.gettext().getText());
		log.info("Checking cash on delivery available or not");

	}

@AfterTest
	public void close() {

		driver.close();
	}
	

}