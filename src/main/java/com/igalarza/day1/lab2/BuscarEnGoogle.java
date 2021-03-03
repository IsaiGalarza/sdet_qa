package com.igalarza.day1.lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarEnGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(exePath);
		driver.get("https://www.google.com");
		
		//escrito
		driver.findElement(By.name("q")).sendKeys("DevLabsalliance.com");
		//borrar
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).clear();
		//escribir
		driver.findElement(By.name("q")).sendKeys("DevLabsalliance.com");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.name("q")).submit();
		
		//buscar el boton
		WebElement boton = driver.findElement(By.name("btnK"));
		
		System.out.println("Displayed: " + boton.isDisplayed());
		System.out.println("Enabled: " + boton.isEnabled());
		
		boton.submit();
		
//		if(boton.isDisplayed() && boton.isEnabled()) {
//			boton.submit();
//		}
		
		//driver.findElement(By.name("btnK")).submit();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//terminar
		driver.close();
		driver.quit();
		
	}

}
