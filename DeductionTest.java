package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Deductionpage;
import com.qa.page.Loginpage;
import com.qa.page.Workerspage;

public class DeductionTest extends BaseTest {
	@Test(priority = 1) // testno34
	public void verifyDeductionModuleScrollVerticaldowntest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Deductionpage p2 = new Deductionpage(driver);
		p2.doDeductionModuleClick();
		boolean DeductionModuleScrollVerticaltest = p2.doWorkersModuleScrollVerticaltest();
		Assert.assertEquals(true, DeductionModuleScrollVerticaltest);
		System.out.println("DeductionModuleScrollVerticaldowntestpassed and is Working fine – Assert passed");
	}
}
