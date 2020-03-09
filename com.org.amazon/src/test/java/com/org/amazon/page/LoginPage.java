package com.org.amazon.page;

import java.util.concurrent.TimeUnit;

import org.amazon.pageobject.LoginPageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.org.amazonbase.BaseClass;

import utility.PropertiesClass;



public class LoginPage extends BaseClass{
	public void login() throws Exception {
	
	LoginPageObject lpo =PageFactory.initElements(driver, LoginPageObject.class);
	lpo.username.sendKeys(PropertiesClass.properties("username"));
	lpo.continuebutton.click();
	lpo.password.sendKeys(PropertiesClass.properties("password"));
	lpo.submit.click();
	String actualmsg ="Your password is incorrect";
	Assert.assertEquals(actualmsg, "Your password is incorrect");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions act = new Actions(driver);
	act.moveToElement(lpo.list);
	lpo.logout.click();

}
}
