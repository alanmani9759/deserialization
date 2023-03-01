package org.junit;

import java.io.IOException;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipKart extends BaseClass {

	@BeforeClass
	public static void test1() {
		browserLaunch("https://www.flipkart.com/");
		System.out.println("fb login test test1");
	}

	@AfterClass
	public static void test2() {
		System.out.println("afterclass test2");
	}

	@Before
	public void test3() throws IOException {
		screenshot("C:\\Users\\alanl\\eclipse-workspace2\\JunitFb\\target\\flip.png");
		System.out.println("test3 before");
	}

	@After
	public void test4() throws IOException, InterruptedException {
		Thread.sleep(2000);
		screenshot("C:\\Users\\alanl\\eclipse-workspace2\\JunitFb\\target\\flip2.png");
		System.out.println("test4 after");
	}

	@Test
	public void test5() {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"_37M3Pb\"]"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();
			if (text.equals("Mobiles")) {
				WebElement button = driver
						.findElement(By.xpath("//div[@class='_2QfC02']//button[@class='_2KpZ6l _2doB4z']"));
				button.click();
				webElement.click();
			}
		}
	}
}
