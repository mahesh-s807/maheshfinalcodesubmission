package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Payslippage {
	WebDriver driver;
	Elementutil eleutil;

	public Payslippage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"w1\"]/li[1]/a")
	private WebElement DashboardModule;
	@FindBy(xpath = "//*[@id=\"w1\"]/li[7]/a")
	private WebElement PayslipModule;
	@FindBy(xpath = "//*[@id=\"w0\"]/table/tbody/tr[1]/td[7]/a")
	private WebElement downloadButton;

	public void doPaySliptModuleClick() {
		eleutil.waitforVisibleWebElement(DashboardModule);
		eleutil.doClickAction(DashboardModule);
		eleutil.waitforVisibleWebElement(PayslipModule);
		eleutil.doClickAction(PayslipModule);
	}

	public String doPayslipsModuleDownloadpaysliptest() throws Exception {
		eleutil.doClickAction(downloadButton);
		String actualtitle = eleutil.doDownloadAction(downloadButton);
		return actualtitle;
	}
}
