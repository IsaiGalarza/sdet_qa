package com.igalarza.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		drive = new ChromeDriver();

		drive.manage().window().maximize();
		drive.navigate().to("http://demo.guru99.com/test/guru99home/");

		Thread.sleep(2000);
		
		
		int size = drive.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		System.out.println(drive.getCurrentUrl());
		System.out.println(drive.getTitle()); //title doc principal
		
		drive.switchTo().frame("a077aa5e"); 
		System.out.println(drive.getCurrentUrl());
		System.out.println(drive.getTitle()); //title frame
		
		
		
		drive.findElement(By.xpath("html/body/a/img")).click();
		
		
		
		drive.switchTo().parentFrame(); //sube un nivel frame //navegacion
		drive.switchTo().defaultContent(); //default frame
		
		
		drive.close(); // cerrar ventana
		drive.quit(); // finalizar webdrive
	}

}
