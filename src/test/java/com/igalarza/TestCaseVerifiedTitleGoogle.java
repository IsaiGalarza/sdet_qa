package com.igalarza;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseVerifiedTitleGoogle {
	
	WebDriver driver;
	String hubURL = "http://localhost:4446/wd/hub";
	
	@Test
	public void Prueba1() throws InterruptedException {
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("holaaaaaaaaaaa");
		assertTrue(driver.getTitle().contentEquals("Google"));
	}
	
	
	@BeforeTest
	public void PreparaTest() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capacitily = DesiredCapabilities.internetExplorer();
		capacitily.setBrowserName("internet explorer");
		capacitily.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(hubURL), capacitily);	
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	public void FinalizarPrueba() {
		driver.close(); // cerrar ventana
		driver.quit(); // finalizar webdrive
	}
	
}
