package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pqe.io/go-signup/");
		Thread.sleep(6000);

		Select abc = new Select(driver.findElement(By.id("country")));
		abc.selectByVisibleText("ALBANIA");

		Thread.sleep(1000);

		new Select(driver.findElement(By.id("country"))).selectByVisibleText("CANADA");

		// Click on Hyperlink 'try this page'
		// driver.findElement(By.linkText("try this page")).click();
		driver.findElement(By.partialLinkText("this page")).click();

	}

}
