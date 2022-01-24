package com.juaracoding.psikotes.page;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > table > thead > tr > th.MuiTableCell-root.MuiTableCell-head.RaDatagrid-headerCell-94.MuiTableCell-paddingCheckbox.MuiTableCell-sizeSmall > span > span")
	private WebElement btnCheckBox;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/span/div/div[3]/button[2]")
	private WebElement btnNext;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > div > div.RaBulkActionsToolbar-title-87 > button > span")
	private WebElement btnCancel;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > span > div > div.MuiInputBase-root.MuiTablePagination-input.MuiTablePagination-selectRoot")
	private WebElement btnRow;
	
	@FindBy(css = "#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(1)")
	private WebElement btnPage5;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > span > div > div.MuiInputBase-root.MuiTablePagination-input.MuiTablePagination-selectRoot")
	private WebElement btnRoww;
	
	@FindBy(css = "#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(3)")
	private WebElement btnPage25;
	
	@FindBy(css = "#main-content > div > div.MuiToolbar-root.MuiToolbar-regular.RaListToolbar-toolbar-69.MuiToolbar-gutters > div > button > span")
	private WebElement btnExport;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[1]/div/div/button")
	private WebElement btnAddFilter;
	
	@FindBy(css = "body > div.MuiPopover-root > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li > span")
	private WebElement btnName;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[2]/div/div[1]/form/div[1]/div[1]/div/input")
	private WebElement txtEmail;
	
	@FindBy(id = "nama")
	private WebElement txtname;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > table > tbody > tr > td:nth-child(9) > a > span > svg")
	private WebElement btnEdit;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > span > div > div.RaPaginationActions-actions-114 > button.MuiButtonBase-root.MuiButton-root.MuiButton-text.previous-page.MuiButton-textPrimary.MuiButton-textSizeSmall.MuiButton-sizeSmall")
	private WebElement btnPrev;
	
	@FindBy(css = "#status > label > span.MuiSwitch-root > span.MuiButtonBase-root.MuiIconButton-root.PrivateSwitchBase-root-105.MuiSwitch-switchBase.MuiSwitch-colorPrimary")
	private WebElement btnActivasi;
	
	@FindBy(css = "#main-content > div > div.RaEdit-main-119 > div > form > div.MuiToolbar-root.MuiToolbar-regular.RaToolbar-toolbar-126.RaToolbar-desktopToolbar-127.MuiToolbar-gutters > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.RaSaveButton-button-131.MuiButton-containedPrimary")
	private WebElement btnSave;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > table > tbody > tr > td:nth-child(8) > a > span > svg")
	private WebElement btnShow;
	
	@FindBy(css = "#main-content > div > div.RaList-main-64 > div > table > tbody > tr > td:nth-child(10) > button > span > svg")
	private WebElement btnDelete;
	
	@FindBy(css = "#menu-appbar > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li")
	private WebElement btnLogout;

	@FindBy(css = "#root > div > div > div > main > div.MuiDrawer-root.RaSidebar-root-36.MuiDrawer-docked.RaSidebar-docked-37 > div > div > a > div")
	private WebElement btnCloseMenu;
	
	@FindBy(css = "#main-content > div > div.MuiToolbar-root.MuiToolbar-regular.RaListToolbar-toolbar-69.MuiToolbar-gutters > form > div:nth-child(2) > button")
	private WebElement btnClose;
	
	@FindBy(css = "#root > div > div > div > header > div > button.MuiButtonBase-root.MuiIconButton-root.RaLoadingIndicator-loadedIcon-32.MuiIconButton-colorInherit")
	private WebElement btnRefresh;
	
	@FindBy(css = "#root > div > div > div > header > div > div > button")
	private WebElement btnProfile;
	
	
	public void goToDashboardPage() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnDashboardPage.click();
	}
	public void goToCloseMenu() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnCloseMenu.click();
	}
	public void goToCheckBox() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnCheckBox.click();
	}
	
	public void goToCancel() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnCancel.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	public void goToNext() {
		try {
			Thread.sleep(4000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnNext.click();
	}
	public void goToPrevious() {
		try {
			Thread.sleep(5000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnPrev.click();
	}
	public void goToRowPerpage() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnRow.click();
	}
	public void goToPerpage() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnRoww.click();
	}
	public void goToPage5() {
		try {
			Thread.sleep(4000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnPage5.click();
	}
	public void goToPage25() {
		try {
			Thread.sleep(4000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnPage25.click();
	}
	public void goToExport() {
		try {
			Thread.sleep(4000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnExport.click();
	}
	
	public void goToSave() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnSave.click();
	}
	public void goToShow() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnShow.click();
	}
	public void goToRefresh() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnRefresh.click();
	}
	public void goToProfile() {
		try {
			Thread.sleep(5000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnProfile.click();
	}
	public void goToDelete() {
		try {
			Thread.sleep(5000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnDelete.click();
	}
	public void goToAddFilter() {
		try {
			Thread.sleep(4000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnAddFilter.click();
	}
	public void goToName() {
		try {
		Thread.sleep(2000);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnName.click();
		
	}
	
	public void goToEdit() {
		btnEdit.click();
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	public void goToActivasi() {
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnActivasi.click();
	}
	public void goToLogout() {
		btnLogout.click();
		try {
			Thread.sleep(4000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	public void goToClose() {
		btnClose.click();
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	
	public void goToEmail(String email, String name) {		
		txtEmail.sendKeys(email);
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		txtname.sendKeys(name);
		try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
	}

	public Object[] getTxtEmail() {
		// TODO Auto-generated method stub
		return null;
	}
		
}


