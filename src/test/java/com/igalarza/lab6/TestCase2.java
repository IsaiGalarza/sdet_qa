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

public class TestCase2 {

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
	public void validarBusqueda() throws InterruptedException {
		String username = "Aaliyah.Haq";
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login();
		WebElement admin = driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b"));
		admin.click();
		
		//Ingresar Busqueda
		WebElement inputSearch = driver.findElement(By.cssSelector("#searchSystemUser_userName"));
		inputSearch.sendKeys(username);
		Thread.sleep(2000);
		
		//Click en Boton de Busqueda
		WebElement buttonSearch = driver.findElement(By.cssSelector("#searchBtn"));
		buttonSearch.click();
		Thread.sleep(2000);
		
		//verificar resultado de la Busqueda 1 registro
		WebElement fila = driver.findElement(By.cssSelector("#resultTable > tbody > tr > td:nth-child(2) > a"));
		System.out.println("fila.getText(): " + fila.getText());
		Assert.assertTrue(fila.getText().contentEquals(username));
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
