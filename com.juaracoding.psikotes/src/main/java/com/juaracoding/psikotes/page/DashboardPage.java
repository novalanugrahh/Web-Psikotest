package com.juaracoding.psikotes.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.psikotes.driver.DriverSingleton;
import com.juaracoding.psikotes.utils.Constants;
import com.juaracoding.psikotes.utils.Utils;

public class DashboardPage {

private WebDriver driver;
	
	public DashboardPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#root > div > div > div > header > div > button.MuiButtonBase-root.MuiIconButton-root.RaAppBar-menuButton-27.MuiIconButton-colorInherit > span > svg > path")
	private WebElement btnDashboardPage;
	
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[2]/div/div[1]/form/div[1]/div[1]/div/input")
	private WebElement txtEmail;
	
	@FindBy(css = "#main-content > div > div.MuiToolbar-root.MuiToolbar-regular.RaListToolbar-toolbar-69.MuiToolbar-gutters > div > div > button > span > span")
	private WebElement btnAddFilter;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li/span")
	private WebElement btnNama;
	
	public void goToDashboardPage() {
		btnDashboardPage.click();
	}
	
	public void goToAddFilter() {
		btnAddFilter.click();
	}
	public void goToNama() {
		btnNama.click();
	}
	
	public void goToEmail(String email) {		
		txtEmail.sendKeys(email);
		
	}

	public Object[] getTxtEmail() {
		// TODO Auto-generated method stub
		return null;
	}
		
}


