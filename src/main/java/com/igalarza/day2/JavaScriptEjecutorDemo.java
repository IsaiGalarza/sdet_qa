package com.igalarza.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEjecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		drive = new ChromeDriver();

		drive.manage().window().maximize();
		drive.navigate().to("https://www.google.com");

		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) drive;
//		js.executeScript("alert('Hola Google');", "");
//		Thread.sleep(2000);
		
		//hacer busqueda
		WebElement InputBusqueda = drive.findElement(By.cssSelector("hhhbody > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
		InputBusqueda.sendKeys("Dev Alliance");
		InputBusqueda.submit();
		Thread.sleep(2000);
		
		//desplazamiento con js
		js.executeScript("window.scrollBy(0, 350)", "");
		Thread.sleep(2000);
		
		//clic action
		js.executeScript("arguments[0].click();", drive.findElement(By.cssSelector("#hdtb-msb > div:nth-child(1) > div > div:nth-child(2) > a")));
		Thread.sleep(2000);
		
		drive.close(); // cerrar ventana
		drive.quit(); // finalizar webdrive
	}

}
