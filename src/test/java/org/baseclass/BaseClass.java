package org.baseclass;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;

import org.Pageobjectmodule.Loginpage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.belt.allclasses.HooksClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static void xp(WebElement e,String s) {
		e.findElement(By.xpath(s));}


	public static void btn(WebElement e) {
		e.click();
}
	public static void launch(String s) {
		HooksClass.driver.get(s);}
	
	public static void send (WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void waits(String s) {
		WebDriverWait w=new WebDriverWait(HooksClass.driver, 30);
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(s)));
	}
	public static java.util.List<HashMap<String,String>> readvalue() {
		java.util.List <HashMap<String, String>> ref=new ArrayList<HashMap<String, String>>();
		try {
			File locationofBBC1=new File("C:\\Users\\Rajasekar\\Desktop\\the british belt factory\\Functional\\driver materials\\BBC1.xlsx");
			FileInputStream io= new FileInputStream(locationofBBC1);
			Workbook w= new XSSFWorkbook(io);
			Sheet s=w.getSheet("British Belt Company");
			Row headerrow=s.getRow(0);
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
				HashMap<String, String> mpdata= new HashMap<String, String>();
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						mpdata.put(headerrow.getCell(j).getStringCellValue(), cell.getStringCellValue());
						break;

				case Cell.CELL_TYPE_NUMERIC:
					mpdata.put(headerrow.getCell(j).getStringCellValue(), String.valueOf(cell.getNumericCellValue()));
					break;
					
					}
				}
				ref.add(mpdata);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ref;
		
		
		
	}
	public static void Acc(WebElement e) {
		Actions acc= new Actions(driver);
		acc.moveToElement(e).click();
		
		}
}
