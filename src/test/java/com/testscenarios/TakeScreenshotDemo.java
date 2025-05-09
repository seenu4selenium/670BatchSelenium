package com.testscenarios;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotDemo {

	public static void main(String[] args) throws Exception {
		// Get the system date&time
		Date d = new Date();
		System.out.println( d );//Sat May 03 20:10:58 MDT 2025
		//
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
				
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pqe.io/go-signup/");
		Thread.sleep(6000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//
		FileHandler.copy(abc, new File(".\\screenshots\\pqeTest_"+timeStamp+".png"));

	}

}
