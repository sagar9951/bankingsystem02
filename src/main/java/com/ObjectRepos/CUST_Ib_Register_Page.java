package com.ObjectRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_Ib_Register_Page {
	//declaration
	@FindBy(name="holder_name")
	private WebElement holder_nameField ;
		
	@FindBy(name="accnum")
	private WebElement accnumField ;
		
	@FindBy(name="dbtcard")
	private WebElement dbtcardNumField ;
		
	@FindBy(name="dbtpin")
	private WebElement dbtpinField ;
		
	@FindBy(name="mobile")
	private WebElement mobileField ;
		
	@FindBy(name="pan_no")
	private WebElement pan_noField ;
		
	@FindBy(name="dob")
	private WebElement dobField ;
		
	@FindBy(name="last_trans")
	private WebElement last_transField ;
		
	@FindBy(name="password")
	private WebElement passwordField ;
		
	@FindBy(name="cnfrm_password")
	private WebElement cnfrm_passwordField ;
		
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement ib_submitBtn ;
		
		
		
		//initilization
		public CUST_Ib_Register_Page(WebDriver driver) {
			PageFactory.initElements(driver , this);
		}
		
		
		
		//utilization
		public WebElement getHolder_nameField() {
			return holder_nameField;
		}

		public WebElement getAccnumField() {
			return accnumField;
		}

		public WebElement getDbtcardNumField() {
			return dbtcardNumField;
		}

		public WebElement getDbtpinField() {
			return dbtpinField;
		}

		public WebElement getMobileField() {
			return mobileField;
		}

		public WebElement getPan_noField() {
			return pan_noField;
		}

		public WebElement getDobField() {
			return dobField;
		}

		public WebElement getLast_transField() {
			return last_transField;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getCnfrm_passwordField() {
			return cnfrm_passwordField;
		}

		public WebElement getIb_submitBtn() {
			return ib_submitBtn;
		}
	
		
		//business Logic
		public void register_Ib(String ACC_HOLDER_NAME,String ACC_NUMBER,
			String DEBIT_NUM,String DEBIT_PIN,String MOBILE,String PAN,
			String CUST_DOB,String LAST_TRANSACTION,
			String PASS,String CONFIRM_PASS) throws InterruptedException {
			
			holder_nameField.sendKeys(ACC_HOLDER_NAME);
			accnumField.sendKeys(ACC_NUMBER);
			dbtcardNumField.sendKeys(DEBIT_NUM);
			dbtpinField.sendKeys(DEBIT_PIN);
			mobileField.sendKeys(MOBILE);
			pan_noField.sendKeys(PAN);
			
			WebElement dob = dobField;
			dob.click();
			dob.sendKeys(CUST_DOB);
			
			last_transField.sendKeys(LAST_TRANSACTION);
			passwordField.sendKeys(PASS);
			cnfrm_passwordField.sendKeys(CONFIRM_PASS);
			
			Thread.sleep(2000);
			ib_submitBtn.click();
		}
}
