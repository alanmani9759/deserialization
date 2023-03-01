package org.junit;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;

public class Adactin extends BaseClass {
	@BeforeClass
	public static void test1() {
		browserLaunch("https://adactinhotelapp.com/");
		System.out.println("fb login test test1");
	}

	@AfterClass
	public static void test2() {
		System.out.println("afterclass test2");
	}

	@Before
	public void test3() throws IOException {
		screenshot("C:\\Users\\alanl\\eclipse-workspace2\\JunitFb\\target\\shot3.png");
		System.out.println("test3 before");
	}

	@After
	public void test4() throws IOException, InterruptedException {
		Thread.sleep(2000);
		screenshot("C:\\Users\\alanl\\eclipse-workspace2\\JunitFb\\target\\shot4.png");
		System.out.println("test4 after");
	}

	@Test
	public void test5() {
		findElementId("username").sendKeys("alanlloydz11@gmail.com");
		findElementId("password").sendKeys("passwordnana");
		findElementId("login").click();
		System.out.println("test5 test");
	}
}
