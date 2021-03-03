package com.igalarza.day1.lab2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver drive;
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
				drive = new ChromeDriver();
				
				//tiempo de espera  implicito
				drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
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
				
				
				//Video Sports + Tiempo espera explicito
				WebDriverWait wait = new WebDriverWait(drive, 5);
				WebElement video1 = drive.findElement(By.cssSelector("img[src='https://i.ytimg.com/vi/3FcXBAC6-KI/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDJF43a_rIC4s_-PA8FY0_n80gtTw']"));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='https://i.ytimg.com/vi/3FcXBAC6-KI/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDJF43a_rIC4s_-PA8FY0_n80gtTw']")));
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				video1.click();

				drive.close(); // cerrar ventana
				drive.quit(); // finalizar webdrive
	}

}
