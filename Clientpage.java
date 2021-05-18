package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.constant.Constant;
import com.qa.utility.Elementutil;

public class Clientpage {

	WebDriver driver;
	Elementutil eleutil;
	@FindBy(xpath = "//div[@class='row']//li//a[text()='Clients'] ") // client path
	private WebElement client1;
	@FindBy(xpath = "//input[@id=\"clientsearch-client_name\"]") // clientsearch-client_name
	private WebElement clientSearch;

	@FindBy(xpath = "//input[@id=\"clientsearch-id\"]") // clientsearch-clientid
	private WebElement clientid;

	@FindBy(xpath = " //form[@id=\"w0\"]/div[3]/button[1]") // sb button
	private WebElement submitButton;
	@FindBy(xpath = "//table[@class='table table-striped table-bordered' ]/tbody/tr/td[6]/a[2]") // elementPathu
	private WebElement elementPathu;
	@FindBy(xpath = "//input[@id='client-client_name'] ") // client-client_name
	private WebElement titleClear;
	@FindBy(id = "//input[@id='client-client_name']") // clientName
	private WebElement clientName;
	@FindBy(xpath = "//textarea[@id='client-client_address']") // client-client_address
	private WebElement clearAddress;
	@FindBy(xpath = "//textarea[@id='client-client_address'] ") // client-client_address
	private WebElement clientAddress;
	@FindBy(xpath = "//input[@id='client-your_ref'] ") // client-your_ref
	private WebElement clientR;
	@FindBy(xpath = "//input[@id='client-your_ref']") // client-your_ref
	private WebElement clientE;
	@FindBy(xpath = "//button[@class='btn btn-success']") // submitButton1
	private WebElement submitButton1;
	@FindBy(xpath = "//ul[@id=\"w2\"]/li[3]/a") // client111
	private WebElement client111;
	@FindBy(xpath = "//*[@id=\"clientsearch-client_name\"]") // client-your_ref
	private WebElement clientN;
	@FindBy(xpath = "//table[@class='table table-striped table-bordered' ]/tbody/tr/td[6]/a[1]") // view
	private WebElement view;

	////
	@FindBy(xpath = "//input[@id='clientsearch-client_name']") // clientModule-client_name
	private WebElement clientname;
	@FindBy(xpath = "//input[@id='clientsearch-id']") // clientModuleclient_id
	private WebElement clientid1;
	@FindBy(xpath = "//button[@class='btn btn-primary']") // clientModuleclientsearchbutton;
	private WebElement clientsearchbutton;
	@FindBy(xpath = "//button[@class='btn btn-default']") // clientModuleclientresetbutton;
	private WebElement clientresetbutton;
	@FindBy(xpath = "//div[@class='col-lg-2 col-sm-4 left-menu no-padding']/ul/li/a") // clientModuleclientsearchbutton;
	private WebElement clientmenubutton;
	@FindBy(xpath = "//div[@class='col-lg-2 col-sm-4 left-menu no-padding']/ul/li[2]/a") // clientModuleclientresetbutton;
	private WebElement createclientmenubutton;
	@FindBy(xpath = "//div[@class='col-sm-6 breadcrumb-navigation']/ul/li[1]/a  ") // clientTohomelink;
	private WebElement clientTohomelink;

	@FindBy(xpath = "	//div[@class='col-sm-6 page-title']") // ScrollTextClient;
	private WebElement ScrollTextClient;

	public Clientpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	public boolean doClientModuleElementBoxTest() {
		if (clientname.isEnabled() && clientid1.isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean doClientModuleSearchAndResetButtonTest() {
		if (clientsearchbutton.isEnabled() && clientresetbutton.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean doClientModuleMenuButtonTest() {
		if (clientmenubutton.isEnabled() && createclientmenubutton.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean doClientModuleToHomeLinktest() {
		if (clientTohomelink.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean doClientModuleScrollVerticaltest() {

		eleutil.doScollVertical();
		eleutil.doScollByText(ScrollTextClient);
		return true;
	}

	public void doClientTest() throws Exception {

		String elementPath = "//div[@class='row']//li//a[text()='Clients']";
		eleutil.waitforVisibleElement(elementPath);
		eleutil.doClickAction(client1);// client method//client click
		System.out.println("exit client method");
	}

	public String doSearchName() {
		//// search method
		String clientSearch1 = "dq2";
		eleutil.doSendkey(clientSearch, clientSearch1);
		submitButton.submit();
		String actualtitle = driver.getTitle();
		return actualtitle;
	}

	public String doUpdateField() throws Exception {
		/// update check method
		eleutil.waitforVisibleWebElement(elementPathu);
		eleutil.doClickAction(elementPathu);// client update method
		titleClear.clear();
		String clientName1 = "dq2";
		eleutil.doSendkey(titleClear, clientName1);
		clearAddress.clear();
		String clientAddress1 = "allapey";
		eleutil.doSendkey(clientAddress, clientAddress1);
		clientR.clear();
		String clientE1 = "sasi";
		eleutil.doSendkey(clientE, clientE1);
		submitButton1.submit();
		
		eleutil.doClick(client111);// client click
		String clientN1 = "dq2";
		eleutil.waitforVisibleWebElement(clientN);
		eleutil.doSendkey(clientN, clientN1);
		submitButton.submit();
		System.out.println("exit updatemethod");
		System.out.println("exit update search method");
		String actualtitle = driver.getTitle();
		System.out.println(" exit doUpdateField method");
		return actualtitle;

	}

	public String doViewField() throws Exception {

		//eleutil.waitforVisibleWebElement(view);
		boolean view1 = view.isDisplayed();
		if (view1 == true) {
			System.out.println("view displayed");

		}
		eleutil.waitforVisibleWebElement(view);
		eleutil.doClickAction(view);// client update method
		//eleutil.waitforVisibleWebElement(view);
		System.out.println("exit view method");
		System.out.println("client updated view verified");
		String actualtitle = driver.getTitle();
		System.out.println(" exit doViewField method");
		return actualtitle;

	}

	public void doClientFunctionalTest() {
		boolean clientSearch11 = clientSearch.isDisplayed();
		if (clientSearch11 == true) {
			System.out.println("client name Searchbox displayed");

		}
		String clientSearch1 = "dq2";
		eleutil.doSendkey(clientSearch, clientSearch1);

		boolean clientid1 = clientid.isDisplayed();
		if (clientid1 == true) {
			System.out.println("clientid Searchbox displayed");

		}
		boolean submitButton1 = submitButton.isDisplayed();
		if (submitButton1 == true) {
			System.out.println("client name Searchbox displayed");

		}

		submitButton.submit();

	}

}
