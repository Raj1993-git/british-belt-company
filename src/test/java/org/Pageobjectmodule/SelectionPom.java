package org.Pageobjectmodule;

import org.belt.allclasses.HooksClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class SelectionPom {
	public SelectionPom() {
	PageFactory.initElements(HooksClass.driver, this);}

	@FindBy(xpath = "//*[@id=\"ui-id-7\"]")
	private WebElement BeltMouseover;

	public WebElement getBeltMouseover() {
		return BeltMouseover;
	}
@FindBy(xpath = "//*[@id=\"amasty-shopby-product-list\"]/div[4]/ol/li[2]/div/a/span/span")
private WebElement beltselect;

public WebElement getbeltselect() {
	return beltselect;
}




}	
