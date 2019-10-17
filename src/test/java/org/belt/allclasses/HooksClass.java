package org.belt.allclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	public static WebDriver driver;
	@Before
	public static WebDriver browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar\\Desktop\\the british belt factory\\Functional\\driver materials\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
return driver;
	}
	@After
	private void quit() {
		driver.quit();

	}

}
