package com.jselenium.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeTest {

	@Test
	public void openWebChrome() {
		String url;
		url = "https://www.google.com.br/";
		System.out.println("\n" + "- Open Chrome... ");
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Test funcionou");
		
	}
}
