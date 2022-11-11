package com.flipkart.stepdefinition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.s;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchase {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		//System.out.println("before class");
		
}
	@AfterClass
	public static void afterclass() {
		System.out.println("After class");
	}
	@Before
	public void beforeTest() {
		System.out.println("before test");
	}
	@After
	public void aftertest() {
		System.out.println("After test");

	}
	@Test
	public void Test1() {
		driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])")).click();
		//System.out.println("login");
		
}
	@Test
	public void Test2() {
		driver.findElement(By.xpath("(//input[@type='text'][1])")).sendKeys("samsung mobiles");
		driver.findElement(By.xpath("(//button[@type='submit'][1])")).click();
		
			//System.out.println("search");
		
}
	@Test
	public void Test3() throws IOException {
		
		File f=new File("C:\\Users\\Windows\\workspace\\Junit\\target\\New Microsoft Excel Worksheet.xlsx");
		FileOutputStream d= new FileOutputStream(f);
		Workbook w1= new XSSFWorkbook();
		Sheet s=w1.createSheet("SEKAR");
		
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_4rR01T']")));
	List<WebElement>samsung	=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for (int i = 0; i<samsung.size(); i++) {
		WebElement name = samsung.get(i);
		String text = name.getText();
		Row ro=s.createRow(i);
		Cell c= ro.createCell(0);
		c.setCellValue(text);
	}	
		w1.write(d);
		
		//System.out.println("mobile");
		
}
	@Test
	public void Test4() throws IOException {
		 FileWriter f1 = new FileWriter("C:\\Users\\Windows\\workspace\\Junit\\target\\sekar.txt");
			driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).click();
		    Set<String> child = driver.getWindowHandles();
		    List <String> child1 = new ArrayList(child);
			driver.switchTo().window(child1.get(1));
			String text1=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
			f1.write(text1);
			f1.close();
		
		//System.out.println("window");
		
}
	@Test
	public void Test5() throws IOException {
		File f=new File("C:\\Users\\Windows\\workspace\\Junit\\target\\New Microsoft Excel Worksheet.xlsx");
		FileOutputStream d= new FileOutputStream(f);
		Workbook w1= new XSSFWorkbook();
		Sheet s=w1.createSheet("SEKAR");
	    
	   Row ro = s.getRow(3);
	   Cell ce = ro.getCell(0);
	   
	   String getval= ce.getStringCellValue();
	   System.out.println(getval);
	   
	   FileReader f1 = new FileReader("C:\\Users\\Windows\\workspace\\Junit\\target\\sekar.txt");
	   BufferedReader buf = new  BufferedReader (f1);
	   String get;
	   while ((get =buf.readLine()) != null){
	   System.out.println(get);
		
	//	System.out.println("addTocart");
}}
	}
