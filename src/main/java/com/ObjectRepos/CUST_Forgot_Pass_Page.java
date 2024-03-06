package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_Forgot_Pass_Page {
	//Declaration
	@FindBy(name="cust_id")
	private WebElement cust_idField ;
		
	@FindBy(name="dbt_crd")
	private WebElement dbt_crdNumField ;
		
	@FindBy(name="dbt_crdpin")
	private WebElement dbt_PinField ;
		
	@FindBy(name="mobile_no")
	private WebElement mobile_noField ;
		
	@FindBy(name="sendotp")
	private WebElement sendotpBtn ;	
		
		//Initializatino
		public CUST_Forgot_Pass_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		//Utilization
		public WebElement getCust_idField() {
			return cust_idField;
		}

		public WebElement getDbt_crdNumField() {
			return dbt_crdNumField;
		}

		public WebElement getDbt_PinField() {
			return dbt_PinField;
		}

		public WebElement getMobile_noField() {
			return mobile_noField;
		}

		public WebElement getSendotpBtn() {
			return sendotpBtn;
		}
		
		//BusinessLogic
}
