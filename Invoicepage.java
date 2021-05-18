package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Invoicepage {
	WebDriver driver;
	Elementutil eleutil;
	public Invoicepage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//*[@id=\"w1\"]/li[1]/a")
	private WebElement DashboardModule;
	
	@FindBy(xpath = "//*[@id=\"w1\"]/li[8]/a")
	private WebElement InvoiceModule;
	
	@FindBy(xpath = "//*[@id=\"w0\"]/table/tbody/tr[1]/td[5]/a")
	private WebElement downloadButton;
	
	public String doInvoiceModuleDownloadinvoicetest() throws Exception {
		eleutil.doClickAction(downloadButton);
		String actualtitle=eleutil.doDownloadAction(downloadButton);
		
		
		return actualtitle;
	}



	public void doInvoiceModuletModuleClick() {
		eleutil.waitforVisibleWebElement( DashboardModule);
		eleutil.doClickAction( DashboardModule);
eleutil.waitforVisibleWebElement(InvoiceModule);
		
		eleutil.doClickAction(InvoiceModule);
		
	}


	

}
