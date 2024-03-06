package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_OTP_VerifyForFundTrns_Page {
	//Declaration
	@FindBy(xpath="//label[@class='OTP_msg']")
	private WebElement otpText_Label ;
		
	@FindBy(name="otpcode")
	private WebElement otpcodeField ;
		
	@FindBy(name="verify-btn")
	private WebElement verify_OTPBtn ;	
		
		//Initializatino
		public CUST_OTP_VerifyForFundTrns_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		//Utilization
		public WebElement getOtpText_Label() {
			return otpText_Label;
		}

		public WebElement getOtpcodeField() {
			return otpcodeField;
		}

		public WebElement getVerify_OTPBtn() {
			return verify_OTPBtn;
		}
		
		
		//BusinessLogic
//		public void verifyOTP() {
//			
//		}
		
}
