package org.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkart extends BaseClass {

	public static void main(String[] args) {
		browserLaunch("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"_37M3Pb\"]//div"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();
			if (text.equals("Mobiles")) {
				webElement.click();
			}
		}
	}
}
