package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Workerspage {

	WebDriver driver;
	Elementutil eleutil;

	public Workerspage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-6 page-title']/h1") // ScrollTextWorkers;
	private WebElement ScrollTextWorkers;
	@FindBy(xpath = "//ul[@id=\"w1\"]/li[1]/a")
	private WebElement DashboardModule;
	@FindBy(xpath = "//ul[@id=\"w1\"]/li[4]/a")
	private WebElement WorkersModule;

	public boolean doWorkersModuleScrollVerticaltest() {
		eleutil.doScollVertical();
		return true;
	}

	public boolean doWorkersModuleScrollVerticaluptest() {
		eleutil.waitforVisibleWebElement(ScrollTextWorkers);
		eleutil.doScollByText(ScrollTextWorkers);
		return true;
	}

	public void doWorkersModuleClick() {
		eleutil.waitforVisibleWebElement(DashboardModule);
		eleutil.doClickAction(DashboardModule);
		eleutil.waitforVisibleWebElement(WorkersModule);
		eleutil.doClickAction(WorkersModule);
	}
}
