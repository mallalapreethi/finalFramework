package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadMoreUI {
	WebDriver driver;
	By readMore = By.xpath("//*[@id='more']");
	public ReadMoreUI(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getReadMore()
	{
		return driver.findElement(readMore);
	}
	

}
