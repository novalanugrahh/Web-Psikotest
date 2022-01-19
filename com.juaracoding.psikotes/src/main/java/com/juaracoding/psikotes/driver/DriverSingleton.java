package com.juaracoding.psikotes.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.psikotes.driver.strategies.DriverStrategy;
import com.juaracoding.psikotes.driver.strategies.DriverStrategyImplementator;

public class DriverSingleton {
	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	public DriverSingleton(String driver) {
		intantiate(driver);
	}
	public WebDriver intantiate (String strategy) {
	
		DriverStrategy driverStrategy = DriverStrategyImplementator.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingleton getInstance(String driver) {
		if(instance == null) {
			instance = new DriverSingleton(driver);
		}
		return instance;
		
		
	}
	public static void closeObjectInstance() {
		instance = null;
		driver.quit();
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
}
