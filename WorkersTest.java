package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Loginpage;
import com.qa.page.Workerspage;

public class WorkersTest extends BaseTest {
	@Test(priority = 1) // testno32
	public void verifyWorkersModuleScrollVerticaldowntest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Workerspage p2 = new Workerspage(driver);
		p2.doWorkersModuleClick();
		boolean WorkersModuleScrollVerticaltest = p2.doWorkersModuleScrollVerticaltest();
		Assert.assertEquals(true, WorkersModuleScrollVerticaltest);
		System.out.println("WorkersModuleScrollVerticaldowntestpassed and is Working fine – Assert passed");
	}

	@Test(priority = 2) // testno33
	public void verifyWorkersModuleScrollVerticaluptest() throws Throwable {

		Workerspage p2 = new Workerspage(driver);
		boolean WorkersModuleScrollVerticaltest = p2.doWorkersModuleScrollVerticaluptest();
		Assert.assertEquals(true, WorkersModuleScrollVerticaltest);
		System.out.println("WorkersModuleScrollVerticaluptest passed and is Working fine – Assert passed");
	}
}
