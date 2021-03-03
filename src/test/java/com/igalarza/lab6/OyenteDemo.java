package com.igalarza.lab6;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class OyenteDemo implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("La prueba ha iniciado..." +context.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("La prueba ha finalizado..." +context.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Un test ha iniciado..." + result.getTestName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Un test ha fallado" + result.getTestName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test ejecutado correctamente!...." + result.getTestName());
	}
	
	
}
