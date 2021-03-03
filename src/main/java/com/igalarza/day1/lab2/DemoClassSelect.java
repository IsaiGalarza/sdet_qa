package com.igalarza.day1.lab2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoClassSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver drive;
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
				drive = new ChromeDriver();
				drive.manage().window().maximize();
				drive.navigate().to("https://developer.mozilla.org/es/docs/Web/HTML/Elemento/select");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement elementoWeb = drive.findElement(By.cssSelector("#select_language"));
				Select oSelect = new Select(elementoWeb);
				
				oSelect.selectByVisibleText("English (US)");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				oSelect.selectByVisibleText("Español");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				List<WebElement> listaHijos = oSelect.getOptions();
				System.out.println("Cantidad Elementos seleccionables: "  + listaHijos.size());
				
				for (WebElement webElement : listaHijos) {
					System.out.println("Elemento: " + webElement.getText());
				}
				
				
				drive.close(); //cerrar ventana
				drive.quit(); //finalizar webdrive
	}

}
