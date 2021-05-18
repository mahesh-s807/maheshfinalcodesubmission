package com.qa.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Deductionpage;
import com.qa.page.Loginpage;
import com.qa.page.Timesheetpage;

public class TimesheetTest extends BaseTest {
	@Test(priority = 1) // testno35
	public void verifyTimesheetModulealertispresentTest() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		p1.doLoginHomePage(Constant.username, Constant.password);
		Timesheetpage p2 = new Timesheetpage(driver);
		p2.doTimesheetModuleClick();
		Alert alertbox = p2.doTimesheetModulealerttest();
		Assert.assertNotNull(alertbox);
		System.out.println("Timesheet module GeneratePayslipalert testpassed and is Working fine – Assert passed");
	}

	@Test(priority = 2) // testno36
	public void verifyGeneratePayslipalertacceptTest() throws Throwable {
		Timesheetpage p2 = new Timesheetpage(driver);
		String alertText = p2.doTimesheetModuleGeneratePayslipalertacceptTest();
		String ExpectedText1 = "Are you sure you want to generate payslip?";
		String alertText2 = p2.doTimesheetModuleGeneratePayslipalertaccept();
		String ExpectedText2 = "Payslip generated!!!";
		Assert.assertEquals(alertText, ExpectedText1);
		Assert.assertEquals(alertText2, ExpectedText2);
		System.out.println("Timesheet module GeneratePayslipalert testpassed and is Working fine – Assert passed");
	}
}
