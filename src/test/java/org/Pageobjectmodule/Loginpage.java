package org.Pageobjectmodule;

import org.belt.allclasses.HooksClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage() {
		PageFactory.initElements(HooksClass.driver, this);}
	

@FindBy(xpath = "(//input[@id='email'])[1]")
private WebElement Uemail;

@FindBy(xpath ="//input[@id='pass']")
private WebElement upassword;

@FindBy(xpath  = "/html/body/div[1]/header/div/div[1]/div[1]/ul/li/a")
private WebElement loginbuttonclick;

@FindBy(xpath="(//button[@class='action-close'])[1]")
private WebElement popup;

@FindBy(xpath = "(//button[@id='send2'])[1]")
private WebElement signin;

public WebElement getSignin() {
	return signin;
}
public WebElement getPopup() {
	return popup;
}

public WebElement getUemail() {
	return Uemail;
}
public WebElement getUpassword() {
	return upassword;
}
public WebElement getLoginbuttonclick() {
	return loginbuttonclick;
}





}
