package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_Ib_Login_Page {
	//declaration
		@FindBy(name="customer_id")
		private WebElement customer_idField ;
		
		@FindBy(name="password")
		private WebElement passwordField ;
		
		@FindBy(name="login-btn")
		private WebElement loginBtn ;
		
		
		
		//initilization
		public CUST_Ib_Login_Page(WebDriver driver) {
			PageFactory.initElements(driver , this);
		}
		
		//utilization
		public WebElement getCustomer_idField() {
			return customer_idField;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
	

		
		
		//business Logic
		public void cust_login(String CUSTOMER_ID, String CUSTOMER_Pass) {
			customer_idField.sendKeys(CUSTOMER_ID);
			passwordField.sendKeys(CUSTOMER_Pass);
			loginBtn.click();
			
		}
}
