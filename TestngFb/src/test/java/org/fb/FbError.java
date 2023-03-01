package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbError {

	WebDriver driver;

	@Test
	public void test1() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("pass")).sendKeys("hello");
		driver.findElement(By.name("login")).click();
		WebElement element = driver.findElement(By.xpath(
				"//div[text()=\"The email address or mobile number you entered isn't connected to an account. \"]"));
		String text = element.getText();
		System.out.println(text);
		Assert.assertEquals(
				"The email address or mobile number you entered isn't connected to an account. Find your account and log in.",
				text);
	}
}
