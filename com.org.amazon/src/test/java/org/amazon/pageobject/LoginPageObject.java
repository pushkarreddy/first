package org.amazon.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.org.amazonbase.BaseClass;

public class LoginPageObject extends BaseClass {
	
	//username
	@FindBy(id="ap_email")
	public WebElement username;
	
	//continue
	@FindBy(id="continue")
	public WebElement continuebutton;
	
	//password
	@FindBy(name="password")
	public WebElement password;
	
	//Login submit
	@FindBy(id="signInSubmit")
	public WebElement submit;
	
	//list
	@FindBy(id="nav-link-accountList")
	public WebElement list;
		
	//signout
	@FindBy(id="nav-item-signout")
	public WebElement logout;
	

}
