package com.juaracoding.psikotes.mobile.scenario;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WebPsikotes {
		
		static AppiumDriver<MobileElement> driver;
	
public void gotoLogin() {
		
		
		MobileElement satu = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		satu.click();
		MobileElement tambah = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		tambah.click();
		MobileElement dua = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		dua.click();
		MobileElement samadengan = driver.findElement(By.id("com.android.calculator2:id/eq"));
		samadengan.click();
		MobileElement txtResult2 = driver.findElement(By.id("com.android.calculator2:id/result"));
		txtResult2.getText();
		assertEquals(txtResult2.getText(), "3");
		}
	
}
