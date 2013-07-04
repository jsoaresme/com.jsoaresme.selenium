package com.jselenium.chorme;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeTest {
	
	@Test
	public static void openWebChrome(String url) {
		url = "https://www.google.com.br/";
		System.out.println("\n" + "- Open Chrome");
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Test funcionou");
		
	}

}
