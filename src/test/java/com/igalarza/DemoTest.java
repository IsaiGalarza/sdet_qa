package com.igalarza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DemoTest extends TestCase {

	public DemoTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(DemoTest.class);
	}

	public void test() throws InterruptedException {
		
		WebDriver drive;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		drive = new ChromeDriver();

		drive.manage().window().maximize();
		drive.navigate().to("http://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);
		
		//Origen BANK
		WebElement From = drive.findElement(By.cssSelector("#credit2 > a"));
		
		//Destino BANK
		WebElement To = drive.findElement(By.cssSelector("#bank > li"));
		
		Actions MyAct = new Actions(drive);
		MyAct.dragAndDrop(From, To).build().perform();
		Thread.sleep(2000);
		
		//Origen 500  
		WebElement FromMountBank = drive.findElement(By.cssSelector("#fourth > a"));
		
		//Destino 500
		WebElement ToMountBank = drive.findElement(By.cssSelector("#amt7 > li"));
		MyAct.dragAndDrop(FromMountBank, ToMountBank).build().perform();		
		Thread.sleep(2000);
		
		//Origen SALES
		WebElement FromSales = drive.findElement(By.cssSelector("#credit1 > a"));
		
		//Destino SALES
		WebElement ToSales = drive.findElement(By.cssSelector("#loan > li"));
		MyAct.dragAndDrop(FromSales, ToSales).build().perform();
		Thread.sleep(2000);
		
		//Destino 500 Sales
		WebElement FromAmountSales = drive.findElement(By.cssSelector("#fourth > a"));
		
		//Destino 500 Sales
		WebElement ToAmountSales = drive.findElement(By.cssSelector("#amt8 > li"));
		MyAct.dragAndDrop(FromAmountSales, ToAmountSales).build().perform();
		MyAct.contextClick(); // Click Derecho **
		Thread.sleep(2000);
		
		//Verificacion de PERFECT
		WebElement Mensaje = drive.findElement(By.cssSelector("#equal > a"));
		String mensaje = Mensaje.getText();
		System.out.println("Mensaje: " + mensaje);
		
		drive.close(); // cerrar ventana
		drive.quit(); // finalizar webdrive
		
		assertTrue(mensaje.contentEquals("Perfect!"));
		
	}
	
	
}
