package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Runner.RunnerCucumberTestNG;
import Runner.TestRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginDemoSetps extends TestRunner{

	WebDriver driver = null;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Abrimos el navegador e ingresamos a la plataforma")
	public void abrimos_el_navegador_e_ingresamos_a_la_plataforma() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("driver.getTitle()" + driver.getTitle());
		Thread.sleep(2000);
	}

	@And("ingresamos a la pagina de Login")
	public void ingresamos_a_la_pagina_de_login() throws InterruptedException {
		System.out.println("ingresamos a login");
	}

	@When("ingresamos usuario y contrasena")
	public void ingresamos_usuario_y_contrase_a() throws InterruptedException {
		
		WebElement fieldUsername = driver.findElement(By.cssSelector("#txtUsername"));
		fieldUsername.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement fieldPassword = driver.findElement(By.cssSelector("#txtPassword"));
		fieldPassword.sendKeys("admin123");
		Thread.sleep(2000);
	}

	@And("pulsamos clic en el boton login")
	public void pulsamos_clic_en_el_boton_login() throws InterruptedException {
		// botton login
		WebElement buttonLogin = driver.findElement(By.cssSelector("#btnLogin"));
		buttonLogin.click();
		Thread.sleep(2000);
	}

	@Then("ingresamos a la pagina de Inicio de la plataforma RRHH Orange")
	public void ingresamos_a_la_pagina_de_inicio_de_la_plataforma_rrhh_orange() {
		System.out.println("driver.getTitle()" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contentEquals("OrangeHRM"));
	}

	@And("verificamos que este disponible el Dashboard")
	public void verificamos_que_este_disponible_el_dashboard() {
		WebElement dashboard = driver.findElement(By.cssSelector("#content > div > div.head > h1"));
		System.out.println("dashboard.isEnabled(): " + dashboard.isEnabled());
		Assert.assertTrue(dashboard.isEnabled());
		//Assert.assertTrue(false);
	}

	@After
	public void afterScenario() {
		try {
			driver.close(); // cerrar ventana
			//driver.quit(); // finalizar webdrive
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
