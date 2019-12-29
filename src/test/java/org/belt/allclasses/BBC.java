package org.belt.allclasses;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.Pageobjectmodule.Loginpage;
import org.Pageobjectmodule.SelectionPom;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BBC extends BaseClass  {
	public static WebDriver driver;
	
	Loginpage l=new Loginpage();
	@Given("launch the browser, get the url & login with valid login details, search for product")
	
	
	public void launch_the_browser_get_the_url_login_with_valid_login_details_search_for_product() throws InterruptedException {
	   launch("https://www.thebritishbeltcompany.co.uk/");
	   
	   btn(l.getPopup());
	  //wait2();
	 //  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   Thread.sleep(4000);
	  btn(l.getLoginbuttonclick());
send(l.getUemail(),readvalue().get(1).get("value"));
	 // send(l.getUemail(), readvalue().get(1).get("Username"));
		/*
		 * try { send(l.getUemail(), readvalue().get(1).get("Username"));
		 * 
		 * } catch (Exception e) { //send(l.getUemail(), "rajasekarj8@gmail.com"); }
		 */

	   
	   send(l.getUpassword(), "Raj@1993");
	   btn(l.getSignin());
	   
	  
	}



	@Given("select the product as desired")
	public void select_the_product_as_desired() throws InterruptedException {
		   Thread.sleep(2000);

			 SelectionPom s=new SelectionPom();
			btn(s.getBeltMouseover());
			
	 List<WebElement> beltproducts = HooksClass.driver.findElements(By.xpath("//li[@class='item product product-item']"));
	for (int i = 0; i <beltproducts.size(); i++) {
		WebElement val = beltproducts.get(i);
		String text = val.getText();
		System.out.println(text);
if (beltproducts.size()==1)
	beltproducts.get(1).click();
	}
	if (beltproducts.size()==2) {
		beltproducts.get(2).click();
	}
	btn(s.getbeltselect());	 
			
		}
	

@Given("launch the browser, for the search  of bag")
public void launch_the_browser_for_the_search_of_bag() {
   
	launch("https://www.facebook.com/");
	System.out.println("xo");
	
   
}}