package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PQE_Combobox {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.pqe.io/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(6000);

		Select iAMa = new Select(driver.findElement(By.name("attendeeType")));
		iAMa.selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(2000);

		// Click on multiselect object
		driver.findElement(By.className("multiselect")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("questions[q_19][2]")).click();
		driver.findElement(By.name("questions[q_19][4]")).click();
		driver.findElement(By.name("questions[q_19][16]")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("multiselect")).click();
	}
}
