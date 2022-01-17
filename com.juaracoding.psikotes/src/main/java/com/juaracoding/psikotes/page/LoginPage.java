package com.juaracoding.psikotes.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.psikotes.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#root > div > div > form > div.MuiCardActions-root.MuiCardActions-spacing > button > span")
	private WebElement btnLoginPage;
	
	@FindBy(id = "username")
	private WebElement txtUsername;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(css = "#root > div > div > form > div.MuiCardActions-root.MuiCardActions-spacing > button > span")
	private WebElement btnLogin;
	
	@FindBy(css = "#react-admin-title > span")
	private WebElement txtDisplayName;
	
	public void goToLoginPage() {
		btnLoginPage.click();
	}
	
	public void goToLoggedIn(String username, String password) {		
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getDisplayName() {
		return txtDisplayName.getText();
	}
}
