package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Loginpage;
import com.qa.page.Reportpage;

public class ReportTest extends BaseTest {
	@Test(priority = 1) // testno39
	public void verifyReportModuleDownloadpaysliptest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Reportpage p2 = new Reportpage(driver);
		p2.doReportModuleClick();
		boolean ReportModuleScrollVerticaltest = p2.doReportModuleScrollVerticaltest();
		Assert.assertEquals(true, ReportModuleScrollVerticaltest);
		System.out.println("ReportModuleScrollVerticaltest passed and is Working fine – Assert passed");
	}
}