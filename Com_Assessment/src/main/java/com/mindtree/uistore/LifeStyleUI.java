package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LifeStyleUI {

	WebDriver driver;
	By lifestyle = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/a");
	By clocks = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/ul/li[8]/a");
	By sort = By.xpath("//*[@id='sortBy']");
	By item = By.xpath("//*[@id='CollectionAjaxContent']/div/div[14]/div/a/div[1]");
	By plus = By.xpath("//*[@id='AddToCartForm-2105178030168']/div[2]/div/span[1]");

	By pincode = By.xpath("//*[@id='PostalCode']");
	By check = By.xpath("//*[@id='cod-cheker']/button");
	By text = By.xpath("//*[@id='PostalCodeCheckerAvailability']");

	public LifeStyleUI(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLifeStyle() {
		return driver.findElement(lifestyle);
	}

	public WebElement getClocks() {
		return driver.findElement(clocks);
	}

	public WebElement getSort() {
		return driver.findElement(sort);
	}

	public WebElement getItem() {
		return driver.findElement(item);
	}

	public WebElement getPlus() {
		return driver.findElement(plus);
	}

	public WebElement getPincode() {
		return driver.findElement(pincode);
	}

	public WebElement getcheck() {
		return driver.findElement(check);
	}

	public WebElement gettext() {
		return driver.findElement(text);
	}

}