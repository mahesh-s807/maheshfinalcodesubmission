package com.qa.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Loginpage {

	WebDriver driver;
	Elementutil eleutil;
	@FindBy(id = "loginform-username")
	private WebElement usernamefld;
	@FindBy(id = "loginform-password")
	private WebElement passwordfld;
	@FindBy(name = "login-button")
	private WebElement submitbtn;

	@FindBy(id = "passwordresetrequestform-email")
	private WebElement emailbox;

	@FindBy(xpath = "	//*[@id=\"login-form\"]/div[4]/a")
	private WebElement reset;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement emailsendButton;

	@FindBy(xpath = "//*[@id=\"request-password-reset-form\"]/div[2]/a")
	private WebElement emailcancelButton;

	@FindBy(xpath = "//*[@id=\"loginform-rememberme\"]")
	private WebElement rcheckbox;
	@FindBy(xpath = "//a[@href='#']")
	private WebElement profile;
	@FindBy(xpath = "//a[@class='logout-btn']")
	private WebElement signout;
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
	//
	@FindBy(xpath = "//*[@id=\"w2\"]/li[8]/a")
	private WebElement invoiceModule;
	@FindBy(xpath = "//*[@id=\"w2\"]/li[9]/a")
	private WebElement reportModule;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/p")
	private WebElement invaliduserform;
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);

	}

	public String doLogin(String username, String password) throws Exception

	{

		eleutil.doSendkey(usernamefld, username);
		eleutil.doSendkey(passwordfld, password);
		eleutil.doClick(submitbtn);
		eleutil.waitforVisibleWebElement(profile);

		eleutil.doClickAction(profile);
		String actualtext = profile.getText();
		eleutil.doClick(signout);

		return actualtext;
	}

	public String doLoginHomePage(String wrongusername, String wrongpassword) throws Exception

	{

		eleutil.doSendkey(usernamefld, wrongusername);
		eleutil.doSendkey(passwordfld, wrongpassword);
		eleutil.doClick(submitbtn);
		String actualtext = invaliduserform.getText();
		return actualtext;
	}

	public boolean doLoginRemembermeCheckboxDefaultStateTest() {

		eleutil.waitforVisibleWebElement(rcheckbox);
		boolean rcheckbox1 = rcheckbox.isDisplayed();

		return rcheckbox1;

	}

	public boolean doLoginResetElementClickTest() {
		eleutil.waitforVisibleWebElement(rcheckbox);
		boolean reset1 = reset.isDisplayed();
		reset.click();
		return reset1;

	}

	public boolean doLoginPasswordResetEmailtextboxElementEditableTest() {
		eleutil.waitforVisibleWebElement(emailbox);

		boolean emailbox1 = emailbox.isDisplayed();
		return emailbox1;

	}

	public boolean doLoginPasswordResetSendButtonTest() {
		eleutil.waitforVisibleWebElement(emailsendButton);

		boolean emailsendButton1 = emailsendButton.isDisplayed();
		return emailsendButton1;

	}

	public boolean doLoginPasswordResetCancelButtonTest() {
		eleutil.waitforVisibleWebElement(emailcancelButton);

		boolean emailcancelButton1 = emailcancelButton.isDisplayed();
		emailcancelButton.click();
		return emailcancelButton1;

	}

}
