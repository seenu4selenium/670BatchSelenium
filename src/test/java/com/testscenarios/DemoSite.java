package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// open any browser
		driver = new ChromeDriver();
		// 1.Type URL
		driver.get("https://demo.automationtesting.in/Register.html");
		// Maximize the window
		driver.manage().window().maximize();
		// wait
		Thread.sleep(3000);
		// Type First name & email address editboxes
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("NagaLakshmi");
		// driver.findElement(By.tagName("input")).sendKeys("Yadla");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("nagalaxmitesting192@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
		
		//Click on all three checkboxes
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("(//*[@type='checkbox'])["+i+"]")).click();
			Thread.sleep(2000);
		}
		

	}
}
