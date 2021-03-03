package com.igalarza.lab6;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(OyenteDemo.class)
public class TestCase1 {

	WebDriver driver = null;
	String hubURL = "http://172.28.3.11:4446/wd/hub";

	// https://opensource-demo.orangehrmlive.com/

	@BeforeTest
	public void setupTestCase() throws MalformedURLException {
		DesiredCapabilities capacitily = DesiredCapabilities.firefox();
		capacitily.setBrowserName("firefox");
		capacitily.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL(hubURL), capacitily);
		driver.manage().window().maximize();
	}

	public void login() throws InterruptedException {
		// username
		WebElement fieldUsername = driver.findElement(By.cssSelector("#txtUsername"));
		fieldUsername.sendKeys("Admin");
		// password
		WebElement fieldPassword = driver.findElement(By.cssSelector("#txtPassword"));
		fieldPassword.sendKeys("admin123");
		// botton login

		WebElement buttonLogin = driver.findElement(By.cssSelector("#btnLogin"));
		buttonLogin.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void verificarTitulo() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("driver.getTitle()" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contentEquals("OrangeHRM"));
	}
	
	@Test(priority = 2)
	public void validarDashboard() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login();
		WebElement dashboard = driver.findElement(By.cssSelector("#content > div > div.head > h1"));
		System.out.println("dashboard.isEnabled(): " + dashboard.isEnabled());
		Assert.assertTrue(dashboard.isEnabled());
	}
	
	
	
	@AfterTest
	public void FinalizarPrueba() {
		try {
			driver.close(); // cerrar ventana
			//driver.quit(); // finalizar webdrive
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
