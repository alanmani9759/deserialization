package irg.logintest;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbLoginTest extends BaseClass {

	@BeforeClass
	public void test1() {
		browserLaunch("https://www.facebook.com/");
		System.out.println("fb login test test1");
	}

	@BeforeMethod
	public void test2() {
		System.out.println("test2 before method");
	}

	@AfterMethod
	public void test3() {
		System.out.println("test3 after method");
	}

	@Test
	public void test4() {
		WebElement element = findElementId("email");
		element.sendKeys("alanlloydz11@gmail.com");
		findElementId("pass").sendKeys("passwordnana");
		driver.findElement(By.name("login")).click();
		System.out.println("test5 test");

	}
}
