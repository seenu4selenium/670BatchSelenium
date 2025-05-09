package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPtrvls {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(3000);
		//Scroll to the element
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("About Us")));
		
		Thread.sleep(3000);
		//driver.findElement(By.linkText("About Us")).click();
		
		//JavascriptClick: Advance click operation		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.linkText("About Us")));

	}

}
