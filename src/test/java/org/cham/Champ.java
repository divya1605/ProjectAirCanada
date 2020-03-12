package org.cham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Champ {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\eclipse-workspace\\Champion\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("div123");
}
}
