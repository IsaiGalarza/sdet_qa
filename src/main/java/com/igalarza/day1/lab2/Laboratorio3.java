package com.igalarza.day1.lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laboratorio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drive;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.navigate().to("https://www.google.com");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//XPATH
		WebElement elementoweb = drive.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		elementoweb.sendKeys("Selenium");
		elementoweb.submit();
		
		//CSS Selector
		WebElement elementowebCSS = drive.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
		elementowebCSS.sendKeys("Selenium CSS Selector");
		elementowebCSS.submit();
				
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		drive.close(); //cerrar ventana
		drive.quit(); //finalizar webdrive
		
	}

}
