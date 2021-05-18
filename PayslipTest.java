package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;

import com.qa.page.Loginpage;
import com.qa.page.Payslippage;

public class PayslipTest extends BaseTest {
	@Test(priority = 1) // testno37
	public void verifyPayslipsModuleDownloadpaysliptest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Payslippage p2 = new Payslippage(driver);
		p2.doPaySliptModuleClick();

		String actualtitle = p2.doPayslipsModuleDownloadpaysliptest();
		String expectedtitle = "Payslips";
		System.out.println("valuePayslipPage=" + actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle, "HomePageTitle matched ");
		System.out.println("PayslipsModuleDownloadpaysliptestpassed and is Working fine – Assert passed");
	}
}
