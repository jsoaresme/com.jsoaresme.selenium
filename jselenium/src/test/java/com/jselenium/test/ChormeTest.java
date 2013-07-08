package com.jselenium.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChormeTest {

//	ChromeDriver driver = new ChromeDriver();
	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void openWebChrome() {
		String url;
		url = "https://www.google.com.br/";
		System.out.println("\n" + "- Open Chrome");
		//System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		
		driver.get(url);
		System.out.println("Test funcionou");
		
	}
}
