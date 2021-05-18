package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Homepage {
	WebDriver driver;
	Elementutil eleutil;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "loginform-username")
	private WebElement usernamefld;
	@FindBy(id = "loginform-password")
	private WebElement passwordfld;
	@FindBy(name = "login-button")
	private WebElement submitbtn;
	@FindBy(xpath = "//img[@alt='logo']")
	private WebElement logo;
	@FindBy(xpath = "//footer[@class='footer-bg']//p")
	private WebElement footer;
	@FindBy(xpath = "//div[@class='col-sm-6 page-title']//h1")
	private WebElement dashboard;
	@FindBy(xpath = "//ul[@class='navbar-nav nav']//li[3]//a")
	private WebElement clientmodule;
	@FindBy(xpath = "//div[@class='col-sm-6 page-title']//h1")
	private WebElement clientboard;
	@FindBy(xpath = "//div[@class='col-sm-6 page-title']//h1")
	private WebElement workermoduletext;
	@FindBy(xpath = "//*[@id=\"w3\"]/li[4]/a")
	private WebElement workermodule;
	@FindBy(xpath = "//ul[@id=\"w3\"]/li[5]/a")
	private WebElement DeductionModule;
	@FindBy(xpath = "//*[@id=\"w2\"]/li[6]/a")
	private WebElement TimesheetModule;
	@FindBy(xpath = "//*[@id=\"w1\"]/li[7]")
	private WebElement payslipModule;
	@FindBy(xpath = "//*[@id=\"w2\"]/li[8]/a")
	private WebElement invoiceModule;
	@FindBy(xpath = "//*[@id=\"w2\"]/li[9]/a")
	private WebElement reportModule;
	@FindBy(xpath = "//div[@class='col-sm-6 breadcrumb-navigation']/ul/li/a")
	private WebElement homeModule;
	@FindBy(xpath = "//a[@href='#']")
	private WebElement profile;
	@FindBy(xpath = "//a[@class='logout-btn']")
	private WebElement signout;
	@FindBy(xpath = "//div[@class='col-lg-12 col-sm-10 panel-nav no-padding']/ul/li/a")
	private WebElement settings;
	@FindBy(xpath = "//*[@id=\"w1\"]/li[1]/a")
	private WebElement dashboardreturn;

	public void doLoginHomePage(String username, String password) throws Exception

	{

		eleutil.doSendkey(usernamefld, username);
		eleutil.doSendkey(passwordfld, password);
		eleutil.doClick(submitbtn);

	}

	public boolean doHomepagelogoTest() {
		eleutil.waitforVisibleWebElement(logo);

		boolean logo1 = logo.isDisplayed();
		return logo1;
	}

	public boolean doHomeFooterTest() {
		eleutil.waitforVisibleWebElement(footer);

		boolean footer1 = footer.isDisplayed();
		return footer1;
	}

	public String doDashboardModuleClick() {
		eleutil.waitforVisibleWebElement(dashboard);

		eleutil.doClickAction(dashboard);
		String actualText = dashboard.getText();
		eleutil.doClick(dashboard);
		return actualText;
	}

	public String doClientsModuleClickTest() {
		eleutil.waitforVisibleWebElement(clientmodule);

		eleutil.doClickAction(clientmodule);
		String actualText = clientboard.getText();
		eleutil.doClick(clientmodule);
		return actualText;
	}

	public String doWorkersModuleClickTest() {
		eleutil.waitforVisibleWebElement(workermodule);
		eleutil.doClickAction(workermodule);
		String actualText = workermoduletext.getText();
		eleutil.doClickAction(workermodule);
		return actualText;
	}

	public String doDeductionModuleClickTest() {
		eleutil.waitforVisibleWebElement(DeductionModule);

		eleutil.doClickAction(DeductionModule);
		String actualText = workermoduletext.getText();
		return actualText;
	}

	public String doTimeSheetModuleClickTest() {
		eleutil.waitforVisibleWebElement(TimesheetModule);
		eleutil.doClickAction(TimesheetModule);
		String actualText = workermoduletext.getText();
		return actualText;
	}

	public String doPaySlipModuleClickTest() {
		eleutil.waitforVisibleWebElement(payslipModule);

		eleutil.doClickAction(payslipModule);
		String actualText = workermoduletext.getText();
		return actualText;
	}

	public String doInvoiceModuleClickTest() {
		eleutil.waitforVisibleWebElement(invoiceModule);
		eleutil.doClickAction(invoiceModule);
		String actualText = workermoduletext.getText();
		return actualText;
	}

	public String doReportModuleClickTest() {
		eleutil.waitforVisibleWebElement(reportModule);
		eleutil.doClickAction(reportModule);
		String actualText = workermoduletext.getText();
		eleutil.waitforVisibleWebElement(homeModule);
		eleutil.doClickAction(homeModule);
		return actualText;
	}

	public String doLogoutfromHomepageTest() {
		eleutil.waitforVisibleWebElement(profile);
		eleutil.doClickAction(profile);
		String actualtext = profile.getText();
		eleutil.doClick(signout);
		return actualtext;
	}

	public String doHomePageSettingsClickTest() {
		eleutil.waitforVisibleWebElement(settings);
		eleutil.doClickAction(settings);
		String actualtext = settings.getText();
		eleutil.waitforVisibleWebElement(dashboardreturn);
		eleutil.doClickAction(dashboardreturn);
		return actualtext;

	}

}
