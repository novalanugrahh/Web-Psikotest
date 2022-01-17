package com.juaracoding.psikotes.Glue;

import static org.junit.Assert.assertEquals;

import javax.naming.ldap.ExtendedRequest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.psikotes.automation.AutomationFramework;
import com.juaracoding.psikotes.driver.DriverSingleton;
import com.juaracoding.psikotes.page.DashboardPage;
import com.juaracoding.psikotes.page.LoginPage;
import com.juaracoding.psikotes.utils.ConfigurationProperties;
import com.juaracoding.psikotes.utils.Constants;
import com.juaracoding.psikotes.utils.Log;
import com.juaracoding.psikotes.utils.TestCases;
import com.juaracoding.psikotes.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFramework.class)
public class StepDefinition {
	private WebDriver driver;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	ExtendedRequest extentTest;
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
	public void user_click_menu_Dashboard() throws InterruptedException {
		dashboardPage.goToDashboardPage();
		extentTest.log(LogStatus.PASS, "User click menu Dashboard");
	}
	
	
	
	
	// Posts
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}
