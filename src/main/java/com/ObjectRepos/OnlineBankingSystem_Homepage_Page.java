package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineBankingSystem_Homepage_Page {
	
	//declaration
	@FindBy(xpath="//a[.='Staff Login']")
	private WebElement staffLoginLink ;
	
	@FindBy(xpath="//li[text()='Open Account']")
	private WebElement openAccountLink ;
	
	@FindBy(xpath="//li[text()='Apply Debit Card']")
	private WebElement applyDebitCardLink ;
	
	@FindBy(xpath="//a[contains(.,'Internet Banking')]")
	private WebElement internetBankingLink ;
	
		@FindBy(xpath="//li[text()='Register']")
		private WebElement IBregisterLink ;
	
		@FindBy(xpath="//li[text()='Login ']")
		private WebElement IBloginLink ;
	
	@FindBy(xpath="//li[text()='Fund Transfer']")
	private WebElement fundTransferLink ;
	
	//initialization
	public 	OnlineBankingSystem_Homepage_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getStaffLoginLink() {
		return staffLoginLink;
	}

	public WebElement getOpenAccountLink() {
		return openAccountLink;
	}

	public WebElement getApplyDebitCardLink() {
		return applyDebitCardLink;
	}

	public WebElement getInternetBankingLink() {
		return internetBankingLink;
	}

		public WebElement getIBregisterLink() {
			return IBregisterLink;
		}

		public WebElement getIBloginLink() {
			return IBloginLink;
		}

	public WebElement getFundTransferLink() {
		return fundTransferLink;
	}
		
		
	//business logic
	public void clickOnOpenAccountLink() {
		openAccountLink.click();
	}	
	
}
