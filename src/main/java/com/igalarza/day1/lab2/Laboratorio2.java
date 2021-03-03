package com.igalarza.day1.lab2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laboratorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
															  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println("Titulo es: " + driver.getTitle());   //obtenemos el titulo de pagina
		System.out.println("URL Actual: " + driver.getCurrentUrl()); //obtenemos la direccion url de la pagina
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println(driver.getPageSource()); //obtenemos el codigo fuente de la pagina
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit(); //cerrar el navegador
		
	}

}
