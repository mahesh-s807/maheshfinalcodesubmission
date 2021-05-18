package com.qa.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Timesheetpage {
	WebDriver driver;
	Elementutil eleutil;

	public Timesheetpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"w1\"]/li[1]/a")
	private WebElement DashboardModule;

	@FindBy(xpath = "//*[@id=\"w1\"]/li[6]/a")
	private WebElement TimesheetModule;
	@FindBy(xpath = "//button[@class='btn btn-warning btn-responsive playslip']")
	private WebElement Timesheetpayslipbutton;

	public void doTimesheetModuleClick() {
		eleutil.waitforVisibleWebElement(DashboardModule);
		eleutil.doClickAction(DashboardModule);
		eleutil.waitforVisibleWebElement(TimesheetModule);
		eleutil.doClickAction(TimesheetModule);
	}

	public Alert doTimesheetModulealerttest() {
		eleutil.waitforVisibleWebElement(Timesheetpayslipbutton);
		eleutil.doClickAction(Timesheetpayslipbutton);
		Alert alertbox = eleutil.doAlertCheck();
		return alertbox;
	}

	public String doTimesheetModuleGeneratePayslipalertacceptTest() throws Exception {
		eleutil.waitforVisibleWebElement(Timesheetpayslipbutton);
		eleutil.doClickAction(Timesheetpayslipbutton);
		String alertText = eleutil.doAlertCheckText();
		return alertText;
	}

	public String doTimesheetModuleGeneratePayslipalertaccept() throws Exception {

		String alertText = eleutil.doAlertacceptText();
		return alertText;
	}
}
