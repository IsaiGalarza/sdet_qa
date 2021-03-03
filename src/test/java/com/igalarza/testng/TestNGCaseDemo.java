package com.igalarza.testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGCaseDemo {
	
	@Test(priority = 1, retryAnalyzer = com.igalarza.testng.RetryAnalyzer.class)
	@Parameters("username")
	public void miPrueba(@Optional("alliance") String username) {
		System.out.println("miPrueba.... username: " + username);
		Assert.assertTrue(false);
	}
	

	@Test(priority = 5)
	@Parameters("username")
	public void a_miPrueba() {
		System.out.println("a_miPrueba....");
		Assert.assertTrue(true);
	}
	
	
	@Test(priority = 6)
	public void x_miPrueba() {
		System.out.println("x_miPrueba....");
		Assert.assertTrue(true);
	}

	@Test(priority = 4)
	public void b_miPrueba() {
		System.out.println("b_miPrueba....");
		Assert.assertTrue(true);
	}
	

	@Test(priority = 2)
	public void d_miPrueba() {
		System.out.println("d_miPrueba....");
		Assert.assertTrue(true);
	}
	

	@Test(priority = 3)
	public void c_miPrueba() {
		System.out.println("c_miPrueba....");
		Assert.assertTrue(true);
	}
	
	@BeforeTest //antes de correr los test
	public void setupTest() {
		//webdrive
		//capabilities
		//windows maximice
	}
	
	@AfterTest  //despues de correr los test
	public void finallyTest() {
		//cerrar la ventana
		//finalziar el drive
	}
	
}
