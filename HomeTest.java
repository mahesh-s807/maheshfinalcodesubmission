package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Homepage;
import com.qa.page.Loginpage;

public class HomeTest extends BaseTest {
	@Test(priority = 1) // testno9
	public void verifyHomepagelogoTest() throws Exception {
		Homepage p1 = new Homepage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		boolean logoTest = p1.doHomepagelogoTest();
		Assert.assertEquals(true, logoTest);
		System.out.println("PAYROLL APPLICATION logo is displayed – Assert passed");
	}

	@Test(priority = 2) // testno10
	public void verifyHomepagelogoTestFooterTest() {
		Homepage p1 = new Homepage(driver);
		boolean footerTest = p1.doHomeFooterTest();
		Assert.assertEquals(true, footerTest);
		System.out.println("PAYROLL APPLICATION footerTest is displayed – Assert passed");
	}

	@Test(priority = 3) // testno11
	public void verifyDashboardModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doDashboardModuleClick();
		String ExpectedText = "PAYROLL APPLICATION";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("Payroll Application  text is a expected in DashboardModuleclick– Assert passed");
	}

	@Test(priority = 4) // testno12
	public void verifyClientsModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doClientsModuleClickTest();
		String ExpectedText = "CLIENTS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("CLIENTS  text is a expected in clientsModuleclick– Assert passed");
	}

	@Test(priority = 5) // testno13
	public void verifyWorkersModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doWorkersModuleClickTest();
		String ExpectedText = "WORKERS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("WORKERS  text is a expected in WORKERSModuleclick– Assert passed");
	}

	@Test(priority = 6) // testno14
	public void verifyDeductionModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doDeductionModuleClickTest();
		String ExpectedText = "DEDUCTIONS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("DEDUCTIONS  text is a expected in DeductionModuleClickTest– Assert passed");
	}

	@Test(priority = 7) // testno15
	public void verifyTimeSheetModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doTimeSheetModuleClickTest();
		String ExpectedText = "TIMESHEETS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("TimeSheet text is a expected in TimeSheetModuleClickTest– Assert passed");
	}

	@Test(priority = 8) // testno16
	public void verifyPayslipModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doPaySlipModuleClickTest();
		String ExpectedText = "PAYSLIPS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("PAYSLIPS text is a expected in PaySlipModuleClickTest– Assert passed");
	}

	@Test(priority = 9) // testno17
	public void verifyInvoiceModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doInvoiceModuleClickTest();
		String ExpectedText = "INVOICE";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("INVOICE text is a expected in InvoiceModuleClickTest– Assert passed");
	}

	@Test(priority = 10) // testno18
	public void verifyReportModuleClickTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doReportModuleClickTest();
		String ExpectedText = "PAYSLIPS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("PAYSLIPS text is a expected in ReportModuleClickTest– Assert passed");
	}

	@Test(priority = 11) // testno19
	public void verifyHomePageSettings() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doHomePageSettingsClickTest();
		String ExpectedText = "SETTINGS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("Forbidden (#403) text is a expected in HomePageSettingsClickTest– Assert passed");
	}

	@Test(priority = 12) // test20
	public void verifyHomePageTitle() throws Exception {
		String Title = "Payroll Application";
		System.out.println("HomePageTitle==" + Title);
		eleutil.waitforElementTitle(Title);
		String actualtitle = driver.getTitle();
		System.out.println("value HomePage===" + actualtitle);
		Assert.assertEquals(actualtitle, Constant.expectedtitle, "HomePageTitle matched ");
	}

	@Test(priority = 13) // testno21
	public void verifyLogoutfromHomepageTest() {
		Homepage p1 = new Homepage(driver);
		String ActualText = p1.doLogoutfromHomepageTest();
		String ExpectedText = "CAROL THOMAS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("CAROL THOMAS  text is a expected– Assert verifyLogoutfromHomepage passed");
	}
}
