package com.ObjectRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_ApplyDebit_Page {
	//declaration
	@FindBy(name="holder_name")
	private WebElement holder_nameField ;
	
	@FindBy(name="dob")
	private WebElement dobField ;
	
	@FindBy(name="pan")
	private WebElement panCardField ;
	
	@FindBy(name="mob")
	private WebElement mobField ;
	
	@FindBy(name="acc_no")
	private WebElement acc_noField ;
	
	@FindBy(name="dbt_crd_submit")
	private WebElement dbt_crd_submitQueryBtn ;
	
	
	
	//initilization
	public CUST_ApplyDebit_Page(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}


	
	//utilization
	public WebElement getHolder_nameField() {
		return holder_nameField;
	}

	public WebElement getDobField() {
		return dobField;
	}

	public WebElement getPanCardField() {
		return panCardField;
	}

	public WebElement getMobField() {
		return mobField;
	}

	public WebElement getAcc_noField() {
		return acc_noField;
	}

	public WebElement getDbt_crd_submitQueryBtn() {
		return dbt_crd_submitQueryBtn;
	}

	
	
	//business Logic
	public void fill_debitCardDetails(String ACCOUNT_HOLDER_NAME, String CUST_DOB, String PAN, String REGISTERED_MOBILE, String ACCOUNT_NO) throws InterruptedException {
		holder_nameField.sendKeys(ACCOUNT_HOLDER_NAME);
		WebElement dob = dobField;
		dob.click();
		dob.sendKeys(CUST_DOB);
		
		panCardField.sendKeys(PAN);
		mobField.sendKeys(REGISTERED_MOBILE);
		acc_noField.sendKeys(ACCOUNT_NO);
		
		Thread.sleep(1000);
		dbt_crd_submitQueryBtn.click();
	}
}
