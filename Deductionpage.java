package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Deductionpage {
	WebDriver driver;
	Elementutil eleutil;

	public Deductionpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"w1\"]/li[1]/a")
	private WebElement DashboardModule;

	@FindBy(xpath = "//*[@id=\"w1\"]/li[5]/a")
	private WebElement deductionModule;

	public void doDeductionModuleClick() {
		eleutil.waitforVisibleWebElement(DashboardModule);
		eleutil.doClickAction(DashboardModule);
		eleutil.waitforVisibleWebElement(deductionModule);

		eleutil.doClickAction(deductionModule);

	}

	public boolean doWorkersModuleScrollVerticaltest() {
		eleutil.doScollVertical();
		return true;
	}

}
