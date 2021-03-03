package com.igalarza.day1.lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver drive;
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
				drive = new ChromeDriver();
				drive.manage().window().maximize();
				drive.navigate().to("https://demos.telerik.com/aspnet-ajax/button/examples/radiosandcheckboxes/defaultcs.aspx");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Elemento Radio
				WebElement elementoweb = drive.findElement(By.cssSelector("#ctl00_ContentPlaceholder1_RadButton22 > span.rbIcon.p-icon.p-i-radio.rbToggleRadio"));
				elementoweb.click();
						
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
