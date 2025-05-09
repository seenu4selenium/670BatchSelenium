package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pqe.io/go-signup/");
		Thread.sleep(6000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
//		String firstnameErrMsg  = driver.findElement(By.id("firstNameError")).getText();
//		System.out.println(firstnameErrMsg);
//		
//		System.out.println("***************************************");
//		
//		//_9ay7
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(1000);
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.className("_9ay7")).getText());
//		
		

	}

}
