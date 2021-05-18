package com.qa.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constant.Constant;

public class Elementutil {
	WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;
	}

//login method
	public void doSendkey(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

//login test method	
	public void doSendkeyTest(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

//click methods
	public void doClick(WebElement element) {
		element.click();
	}

//Action class method 
	public void doClickAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

	}

//WebElement wait methods
	public void waitforVisibleElement(String path) {
		WebDriverWait wait = new WebDriverWait(driver, Constant.timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));

	}

//drop down Text methods
	public void selectDropdownByText(WebElement checkboxElement, String string) {

		Select b = new Select(checkboxElement);
		b.selectByVisibleText(string);

	}

//drop down Value method 
	public void selectDropdownByValue(WebElement element, String string) {
		Select d = new Select(element);
		d.selectByValue(string);

	}

//drop down by index
	public void selectDropdownByIndex(WebElement element, int value) {
		Select f = new Select(element);
		f.selectByIndex(value);

	}

	public void waitforElementTitle(String check) {
		WebDriverWait wait = new WebDriverWait(driver, Constant.timeout);
		wait.until(ExpectedConditions.titleIs(check));
	}

	public void waitforVisibleWebElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Constant.timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void doScollVertical() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void doScollByText(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public Alert doAlertCheck() {
		Alert alertboxvalue = driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		return alertboxvalue;
	}

	public String doAlertCheckText() throws Exception {
		String alertText = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		return alertText;
	}

	public String doDownloadAction(WebElement downloadButton) throws Exception {
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P D:\\downloadfile --no-check-certificate " + sourceLocation;
		Runtime.getRuntime().exec(wget_command);
		String actualtitle = driver.getTitle();
		return actualtitle;
	}
	
	public String doInvoiceDownloadAction(WebElement downloadButton) throws Exception {
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P D:\\downloadfile --no-check-certificate " + sourceLocation;
		Runtime.getRuntime().exec(wget_command);
		String actualtitle = driver.getTitle();
		return actualtitle;
	}

	public String doAlertacceptText() throws Exception {
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		String alertText = driver.switchTo().alert().getText();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		return alertText;
	}

}
