package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PODfoods {

	public static void main(String[] args) throws Exception {
		// Create an Object for Webdriver interface
		WebDriver driver;
		// Open Any browser(Chrome)
		driver = new ChromeDriver();
		// Window maximize
		driver.manage().window().maximize();
		// Type URL : https://podfoods.co/login
		driver.get("https://podfoods.co/login");
		// Type any email & Password
		driver.findElement(By.name("email")).sendKeys("HimaJansi@teaet.sdfsdg");
		driver.findElement(By.name("password")).sendKeys("sdgdsgdsgdsgds");
		
		// Click on Login button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/div/div[5]/div/button")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/div/div[4]/div/div/label[2]/span")).click();
	}

}
