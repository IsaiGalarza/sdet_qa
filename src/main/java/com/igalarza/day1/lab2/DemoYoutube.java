package com.igalarza.day1.lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drive;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.navigate().to("https://www.youtube.com/");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Icon Music
		WebElement ButtonMusic = drive.findElement(By.xpath("/html/body/ytd-app/div/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[1]/a/paper-item/yt-formatted-string"));
		ButtonMusic.click();
		
		// Icon Sports
		WebElement ButtonSports = drive.findElement(By.xpath("/html/body/ytd-app/div/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[2]/a/paper-item/yt-formatted-string"));
		ButtonSports.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Icon Gaming
		/*WebElement ButtonGaming = drive.findElement(By.cssSelector("#endpoint > paper-item > yt-formatted-string"));

		// Icon News
		WebElement ButtonNews = drive.findElement(By.cssSelector("#endpoint > paper-item > yt-formatted-string"));*/

		drive.close(); // cerrar ventana
		drive.quit(); // finalizar webdrive
	}

}
