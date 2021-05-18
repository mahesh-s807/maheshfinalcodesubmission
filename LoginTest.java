package com.qa.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.constant.Constant;
import com.qa.page.Loginpage;
import com.qa.utility.ExcelRead;

public class LoginTest extends BaseTest {
	Loginpage p1;

	@Test(dataProvider = "loginData") // testno1
	public void verifyLoginPageLogin(String username, String password) throws Exception {
		p1 = new Loginpage(driver);
		String ActualText = p1.doLogin(username, password);
		String ExpectedText = "CAROL THOMAS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("CAROL THOMAS  text is a expected in login page– Assert passed");
	}

	@DataProvider
	public Object[][] loginData() throws InvalidFormatException, IOException {

		Object[][] data = ExcelRead.getDataFromExcel("D:\\excel\\payrolllogindata.xlsx", "Sheet1");
		return data;

	}

	@Test(priority = 2) // testno2
	public void verifyLoginPageRemembermeCheckboxDefaultState() {
		Loginpage p1 = new Loginpage(driver);
		boolean RemembermeStatus = p1.doLoginRemembermeCheckboxDefaultStateTest();
		Assert.assertEquals(true, RemembermeStatus);
		System.out.println("Rememberme Element checkbox is enbaled – Assert passed");

	}

	@Test(priority = 3) // testno3
	public void verifyLoginPageResetLinkClickTest() {
		Loginpage p1 = new Loginpage(driver);
		boolean resetlinkStatus = p1.doLoginResetElementClickTest();
		Assert.assertEquals(true, resetlinkStatus);
		System.out.println("Element is enabled – Assert passed – Assert passed");

	}

	@Test(priority = 4) // testno4
	public void verifyLoginPageForgetPasswordTest() {
		Loginpage p1 = new Loginpage(driver);
		boolean EmailtextboxElementStatus = p1.doLoginPasswordResetEmailtextboxElementEditableTest();
		Assert.assertEquals(true, EmailtextboxElementStatus);
		System.out.println("  EmailtextboxElement is enabled – Assert passed – Assert passed");

	}

	@Test(priority = 5) // testno5
	public void verifyLLoginPageForgetPasswordButtonTest() {
		Loginpage p1 = new Loginpage(driver);
		boolean SendButtonTestStatus = p1.doLoginPasswordResetSendButtonTest();
		Assert.assertEquals(true, SendButtonTestStatus);
		System.out.println(" SendButtonTest is enabled – Assert passed – Assert passed");

	}

	@Test(priority = 6) // testno6
	public void verifyLoginPageForgetPasswordTResetCancelButtonTest() {
		Loginpage p1 = new Loginpage(driver);
		boolean CancelButtonTest = p1.doLoginPasswordResetCancelButtonTest();
		Assert.assertEquals(true, CancelButtonTest);
		System.out.println(" CancelButtonTest is enabled – Assert passed – Assert passed");

	}

	@Test(priority = 7) // testno7
	public void verifyLoginPageWithUsernameCaseSensitiveTest() throws Throwable {

		Loginpage p1 = new Loginpage(driver);
		String ActualText = p1.doLogin(Constant.usernamecapitalletter, Constant.password);
		String ExpectedText = "CAROL THOMAS";
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println(
				" Verified usenamefield is not casesensitive– Assert passed With usenamefield is not casesensitive");

	}

	@Test(priority = 8) // testno8
	public void verifyLoginPageusingWrongCredentials() throws Throwable {
		Loginpage p1 = new Loginpage(driver);
		String actualtext = p1.doLoginHomePage(Constant.wrongusername, Constant.wrongpassword);
		String ExpectedText = "";

		SoftAssert s = new SoftAssert();
		s.assertEquals(actualtext, ExpectedText,
				"Invalid username and password  entered in login page– Assert Failed reason");
		System.out.println("Invalid username and password  entered in login page– Assert Failed reason");
		s.assertAll();
	}
}
