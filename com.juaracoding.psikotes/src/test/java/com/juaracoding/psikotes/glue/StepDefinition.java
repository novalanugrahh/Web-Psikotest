package com.juaracoding.psikotes.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.juaracoding.psikotes.Config.AutomationFrameworkConfiguration;
import com.juaracoding.psikotes.driver.DriverSingleton;
import com.juaracoding.psikotes.utils.ConfigurationProperties;
import com.juaracoding.psikotes.utils.Constants;
import com.juaracoding.psikotes.utils.Log;
import com.juaracoding.psikotes.utils.TestCases;
import com.juaracoding.psikotes.utils.Utils;

import com.juaracoding.psikotes.page.DashboardPage;
import com.juaracoding.psikotes.page.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;


@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(tests[Utils.testCount].getTestName()); //log4j
		Utils.testCount++;
	}
	
	// Scenario Login
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		Log.info("INFO: Navigating to " + Constants.URL); //log4j
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User click login page button")
	public void user_click_login_page_button() {
		loginPage.goToLoginPage();
		extentTest.log(LogStatus.PASS, "User click login page button");
	}
	
	@When("^User input username password and click Login")
	public void user_input_username_password_and_click_Login() {
		loginPage.goToLoggedIn(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username password and click Login");
	}
	
	@Then("^User can login to the Website")
	public void user_can_login_to_the_Website() {
		 assertEquals(loginPage.getDisplayName(), loginPage.getDisplayName());
		 extentTest.log(LogStatus.PASS, "User can login to the Website");
	}
	
	// Scenario Dashboard
	@When("^User click menu Dashboard")
	public void user_click_menu_Dashboard()  {
		dashboardPage.goToDashboardPage();
		extentTest.log(LogStatus.PASS, "User click menu Dashboard");
	}
	
	@Then("^User click button checkbox")
	public void user_click_button_checkbox()  {
		dashboardPage.goToCheckBox();
		extentTest.log(LogStatus.PASS, "User click button checkbox");
	}

	@When("^User click button cancel")
	public void user_click_button_cancel()  {
		dashboardPage.goToCancel();
		extentTest.log(LogStatus.PASS, "User click button checkbox");
	
	}
	@Then("^User click button next")
	public void user_click_button_next()  {
		dashboardPage.goToNext();
		extentTest.log(LogStatus.PASS, "User click button next");
	}
	@When("^User click button previous")
	public void user_click_button_previous()  {
		dashboardPage.goToPrevious();
		extentTest.log(LogStatus.PASS, "User click button previous");
	}
	@Then("^User click row perpage")
	public void User_click_row_perpage()  {
		dashboardPage.goToRowPerpage();
		extentTest.log(LogStatus.PASS, "User click row perpage");
	}
	@When("^User click page 5")
	public void User_click_page_5()  {
		dashboardPage.goToPage5();
		extentTest.log(LogStatus.PASS, "User click page 5");
	}
	@Then("^User click row per page")
	public void User_click_row_per_page()  {
		dashboardPage.goToPerpage();
		extentTest.log(LogStatus.PASS, "User click row per page");
	}
	@When("^User click page 25")
	public void User_click_page_25()  {
		dashboardPage.goToPage25();
		extentTest.log(LogStatus.PASS, "User click page 25");
	}
	@Then("^User can go to export")
	public void User_can_go_to_export()  {
		dashboardPage.goToExport();
		extentTest.log(LogStatus.PASS, "User can go to export");
	}
	@Then("^User can go to add filter")
	public void User_can_go_to_add_filter()  {
		dashboardPage.goToAddFilter();
		extentTest.log(LogStatus.PASS, "User can go to add filter");
	}
	@When("^User can go to click name")
	public void User_can_go_to_click_name()  {
		dashboardPage.goToName();
		extentTest.log(LogStatus.PASS, "User can go to click nama");
	
	}
	
	@Then("^User input email name")
	public void User_input_email_name() {
		dashboardPage.goToEmail(configurationProperties.getTxtEmail(), configurationProperties.getTxtName());
		extentTest.log(LogStatus.PASS, "User input email name");
		
	}
	@When("^User click button edit")
	public void User_click_button_edit()  {
		dashboardPage.goToEdit();
		extentTest.log(LogStatus.PASS, "User click edit");
		
}
	@Then("^User click button activasi")
	public void User_click_button_activasi()  {
		dashboardPage.goToActivasi();
		extentTest.log(LogStatus.PASS, "User click button activasi");
	}
	@When("^User click button save")
	public void User_click_button_save()  {
		dashboardPage.goToSave();
		extentTest.log(LogStatus.PASS, "User click button save");
	}
	@Then("^User click button show")
	public void User_click_button_show()  {
		dashboardPage.goToShow();
		extentTest.log(LogStatus.PASS, "User click button show");
	}
	
	@When("^User click close menu")
	public void user_click_close_menu()  {
		dashboardPage.goToCloseMenu();
		extentTest.log(LogStatus.PASS, "User click close menu");
		
	}
	
	@Then("^User click close")
	public void user_click_close()  {
		dashboardPage.goToClose();
		extentTest.log(LogStatus.PASS, "User click close");
	}
	@When("^User click button delete")
	public void user_click_button_delete()  {
		dashboardPage.goToDelete();
		extentTest.log(LogStatus.PASS, "User click button delete");
	}
	@Then("^User click button refresh")
	public void User_click_button_refresh()  {
		dashboardPage.goToRefresh();
		extentTest.log(LogStatus.PASS, "User click button refresh");	
	
		}
	
	@When("^User click button profile")
	public void User_click_button_profile()  {
		dashboardPage.goToProfile();
		extentTest.log(LogStatus.PASS, "User click button profile");
		}
	@Then("^User click button logout")
	public void User_click_button_logout()  {
		dashboardPage.goToLogout();
		extentTest.log(LogStatus.PASS, "User click button logout");
	}
	
	// Posts
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}
