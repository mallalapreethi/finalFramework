package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchUI {
	public WebDriver driver;
	
	
	By search=By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	
	
	public SearchUI(WebDriver driver) {

 this.driver=driver;
 
}


public WebElement getSearch() {
// TODO Auto-generated method stub
return driver.findElement(search);

}
/*public WebElement getHarry() {
	// TODO Auto-generated method stub
	return driver.findElement(harry);

	}
public WebElement getImage() {
	// TODO Auto-generated method stub
	return driver.findElement(image);

	}*/

}
