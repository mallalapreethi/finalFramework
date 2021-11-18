package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

public class HoverEffectUI {
	WebDriver driver;
	
	By allofit = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[12]/a");
	By imagemovment = By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[7]/div/a/div[1]");


	public HoverEffectUI(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	public WebElement getAllOfIt() {
		return driver.findElement(allofit);
	}


	public WebElement getImageMovment() {
		return driver.findElement(imagemovment);
	}

	
}