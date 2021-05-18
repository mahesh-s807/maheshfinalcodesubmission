package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Clientpage;
import com.qa.page.CreateClientpage;
import com.qa.page.Homepage;
import com.qa.page.Loginpage;
import com.qa.utility.Elementutil;

public class CreateclientTest extends BaseTest {

	@Test(priority = 1) // test28
	public void verifyCreateclientMandatoryfieldfillformEntrytest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Homepage p2 = new Homepage(driver);
		p2.doClientsModuleClickTest();
		CreateClientpage cp = new CreateClientpage(driver);
		boolean ClientmandatoryTest = cp.doCreateclientMandatoryfieldfillformEntrytest();
		Assert.assertEquals(true, ClientmandatoryTest);
		System.out.println("CreateclientMandatoryfieldfillform test is passed – Assert passed");
	}

	@Test(priority = 2) // test29
	public void verifyCreateclientAllfieldfillformEntrytest() throws Throwable {

		CreateClientpage cp = new CreateClientpage(driver);
		String Expectedtext = "Clients";
		String ClientElementTest = cp.doCreateclientAllfieldfillformEntrytest();
		Assert.assertEquals(Expectedtext, ClientElementTest);
		System.out.println("Createclientallfieldfillform test is passed – Assert passed");
	}

	@Test(priority = 3) // test30
	public void verifyClientView() throws Exception {
		Clientpage cp = new Clientpage(driver);
		String actualtitle = cp.doViewField();
		System.out.println("value ViewField ===" + actualtitle);
		String expectedtitle = "dq2";
		Assert.assertEquals(actualtitle, expectedtitle, "Title matched ");
		System.out.println("I am inClientTestt" + Thread.currentThread().getId());
	}
}
