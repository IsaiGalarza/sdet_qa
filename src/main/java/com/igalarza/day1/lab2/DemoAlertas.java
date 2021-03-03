package com.igalarza.day1.lab2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlertas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		drive = new ChromeDriver();

		drive.manage().window().maximize();
		drive.navigate().to("https://demoqa.com/alerts");

		Thread.sleep(2000);
		
		
		//1. Alerta Simple
		WebElement BtnAlertaSimple = drive.findElement(By.id("alertButton"));
		BtnAlertaSimple.click();
		Thread.sleep(2000);
		
		Alert alert = drive.switchTo().alert();
		System.out.println("Alerta Simple: " + alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		
		//2. Alerta Confirmacion
		WebElement BtnAlertaConfirmacion = drive.findElement(By.id("confirmButton"));
		BtnAlertaConfirmacion.click();
		
		Alert alerConfirm = drive.switchTo().alert();
		System.out.println("Alerta Confirmacion: " + alerConfirm.getText());
		Thread.sleep(2000);
		alerConfirm.dismiss();
		
		//3. Alerta Pront
		WebElement BtnAlertPront = drive.findElement(By.id("promtButton"));
		BtnAlertPront.click();
		
		Alert alertPront = drive.switchTo().alert();
		System.out.println("Alerta Pront: " + alertPront.getText());
		Thread.sleep(2000);
		//alertPront.wait(3000, 10);
		drive.switchTo().alert().sendKeys("HOLA");
		Thread.sleep(2000);
		alertPront.sendKeys("VALOR");
		Thread.sleep(2000);
		alertPront.accept();

		drive.close(); // cerrar ventana
		drive.quit(); // finalizar webdrive

	}

}
