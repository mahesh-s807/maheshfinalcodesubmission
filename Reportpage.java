package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Reportpage {
	WebDriver driver;
	Elementutil eleutil;

	public Reportpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"w1\"]/li[1]/a")
	private WebElement DashboardModule;
	@FindBy(xpath = "//*[@id=\"w1\"]/li[9]/a")
	private WebElement ReportModule;

	public void doReportModuleClick() {
		eleutil.waitforVisibleWebElement(DashboardModule);
		eleutil.doClickAction(DashboardModule);
		eleutil.waitforVisibleWebElement(ReportModule);
		eleutil.doClickAction(ReportModule);
	}

	public boolean doReportModuleScrollVerticaltest() {
		eleutil.doScollVertical();
		return true;
	}
}
