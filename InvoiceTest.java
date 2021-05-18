package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Invoicepage;
import com.qa.page.Loginpage;


public class InvoiceTest extends BaseTest {
	@Test(priority = 1)//testno38
  public void verifyReportModuleDownloadpaysliptest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Invoicepage p2=new Invoicepage(driver);
	p2.doInvoiceModuletModuleClick();

	String actualtitle = p2.doInvoiceModuleDownloadinvoicetest();
	String expectedtitle="Invoice";
	System.out.println("valuePayslipPage===" + actualtitle);
	Assert.assertEquals(actualtitle, expectedtitle, "InvoiceModuleDownloaded ");
	System.out.println("InvoiceModuleDownloadinvoicetestpassed and is Working fine – Assert passed");
}
}