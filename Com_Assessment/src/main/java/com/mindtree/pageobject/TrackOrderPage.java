package com.mindtree.pageobject;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.*;

public class TrackOrderPage extends ReadPropertyFile {

public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void TrackOrder() throws InterruptedException {
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		log.info("<<<<-navigated to url->>>>");	
		
		TrackOrderUI t = new TrackOrderUI(driver);
		t.getTrackOrder().sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
	    
		Set<String> ab = driver.getWindowHandles();
		Iterator<String> it = ab.iterator();
		String parentId = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		
	    t.getEmail().sendKeys("polojusaikrishna@gmail.com");
	    t.getOrderId().sendKeys("1074257");
	    t.getFind().click();
		driver.switchTo().window(parentId);

	}
	
	
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}
	
	
	 

}