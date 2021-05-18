package com.qa.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Clientpage;
//import com.qa.page.CreateClientpage1;
import com.qa.page.Homepage;
import com.qa.page.Loginpage;

public class ClientTest extends BaseTest {
	@Test(priority = 1) // testno22
	public void verifyClientPageTitle() throws Exception {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Homepage p2 = new Homepage(driver);
		p2.doClientsModuleClickTest();
		String ExpectedTitle = "Clients";
		String actualtitle = driver.getTitle();
		System.out.println("clientPageTitle=" + actualtitle);
		Assert.assertEquals(actualtitle, ExpectedTitle, "clientPageTitle matched ");

	}

	@Test(priority = 2) // testno23
	public void verifyClientModuleElementBox() {
		Clientpage p1 = new Clientpage(driver);
		boolean ClientElementTest = p1.doClientModuleElementBoxTest();
		Assert.assertEquals(true, ClientElementTest);
		System.out.println("ClientModule Client Name and id ElementBox is displayed – Assert passed");
	}

	@Test(priority = 3) // testno24
	public void verifyClientModuleSearchAndResetButtonTest() {
		Clientpage p1 = new Clientpage(driver);
		boolean ClientButtonTest = p1.doClientModuleSearchAndResetButtonTest();
		Assert.assertEquals(true, ClientButtonTest);
		System.out.println("ClientModuleSearchAndResetButtonClickTest passed and is Working fine – Assert passed");
	}

	@Test(priority = 4) // testno25
	public void verifyClientModuleMenuButtonTest() {
		Clientpage p1 = new Clientpage(driver);
		boolean ClientButtonTest = p1.doClientModuleMenuButtonTest();
		Assert.assertEquals(true, ClientButtonTest);
		System.out.println("ClientModuleSearchAndResetButtonClickTest passed and is Working fine – Assert passed");
	}

	@Test(priority = 5) // testno26
	public void verifyClientModuleToHomeLinktest() {
		Clientpage p1 = new Clientpage(driver);
		boolean ClientModuleToHomeLink = p1.doClientModuleToHomeLinktest();
		Assert.assertEquals(true, ClientModuleToHomeLink);
		System.out.println("ClientModuleSearchAndResetButtonClickTest passed and is Working fine – Assert passed");
	}

	@Test(priority = 6) // testno27
	public void verifyClientModuleScrollBarVerticaltest() {
		Clientpage p1 = new Clientpage(driver);
		boolean ClientModuleScrollVerticaltest = p1.doClientModuleScrollVerticaltest();
		Assert.assertEquals(true, ClientModuleScrollVerticaltest);
		System.out.println("ClientModuleScrollVerticaltest passed and is Working fine – Assert passed");
	}
}
