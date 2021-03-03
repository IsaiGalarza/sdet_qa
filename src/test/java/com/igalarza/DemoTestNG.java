package com.igalarza;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	WebDriver driver;
	String hubURL = "http://172.28.3.11:4446/wd/hub";
	
	@Test
	public void DemoTest() throws InterruptedException {
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);
		
		//Origen BANK
		WebElement From = driver.findElement(By.cssSelector("#credit2 > a"));
		
		//Destino BANK
		WebElement To = driver.findElement(By.cssSelector("#bank > li"));
		
		Actions MyAct = new Actions(driver);
		MyAct.dragAndDrop(From, To).build().perform();
		Thread.sleep(2000);
		
		//Origen 500  
		WebElement FromMountBank = driver.findElement(By.cssSelector("#fourth > a"));
		
		//Destino 500
		WebElement ToMountBank = driver.findElement(By.cssSelector("#amt7 > li"));
		MyAct.dragAndDrop(FromMountBank, ToMountBank).build().perform();		
		Thread.sleep(2000);
		
		//Origen SALES
		WebElement FromSales = driver.findElement(By.cssSelector("#credit1 > a"));
		
		//Destino SALES
		WebElement ToSales = driver.findElement(By.cssSelector("#loan > li"));
		MyAct.dragAndDrop(FromSales, ToSales).build().perform();
		Thread.sleep(2000);
		
		//Destino 500 Sales
		WebElement FromAmountSales = driver.findElement(By.cssSelector("#fourth > a"));
		
		//Destino 500 Sales
		WebElement ToAmountSales = driver.findElement(By.cssSelector("#amt8 > li"));
		MyAct.dragAndDrop(FromAmountSales, ToAmountSales).build().perform();
		MyAct.contextClick(); // Click Derecho **
		Thread.sleep(2000);
		
		//Verificacion de PERFECT
		WebElement Mensaje = driver.findElement(By.cssSelector("#equal > a"));
		String mensaje = Mensaje.getText();
		System.out.println("Mensaje: " + mensaje);
		
			
		assertTrue(mensaje.contentEquals("Perfect!"));
		
	}
	
	
	@BeforeTest
	public void PreparaTest() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capacitily = DesiredCapabilities.firefox();
		capacitily.setBrowserName("firefox");
		capacitily.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL(hubURL), capacitily);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
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
