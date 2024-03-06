package com.ObjectRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CUST_AddBeneficiary_Page {
	
	//Declaration
	@FindBy(name="beneficiary_name")
	private WebElement beneficiary_nameField ;
		
	@FindBy(name="beneficiary_acno")
	private WebElement beneficiary_acnoField ;
		
	@FindBy(name="Ifsc_code")
	private WebElement Ifsc_codeField ;
		
	@FindBy(name="beneficiary_acc_type")
	private WebElement beneficiary_acc_typeDropDown ;
	
	@FindBy(name="add_beneficiary_btn")
	private WebElement add_beneficiaryBtn ;
	
	
	
	//Initialization
	public CUST_AddBeneficiary_Page(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	
	//Utilization

	public WebElement getBeneficiary_nameField() {
		return beneficiary_nameField;
	}

	public WebElement getBeneficiary_acnoField() {
		return beneficiary_acnoField;
	}

	public WebElement getIfsc_codeField() {
		return Ifsc_codeField;
	}

	public WebElement getBeneficiary_acc_typeDropDown() {
		return beneficiary_acc_typeDropDown;
	}

	public WebElement getAdd_beneficiaryBtn() {
		return add_beneficiaryBtn;
	}
		
	//Business Logic
	public void addBeneficiary(String BENEFICIARY_NAME,String BENEFICIARY_ACNO,String IFSCcode,String ACCtype) {
		beneficiary_nameField.sendKeys(BENEFICIARY_NAME);
		beneficiary_acnoField.sendKeys(BENEFICIARY_ACNO);
		Ifsc_codeField.sendKeys(IFSCcode);
		
		Select sel = new Select(beneficiary_acc_typeDropDown);
		sel.selectByVisibleText(ACCtype);
		
		add_beneficiaryBtn.click();
	}
}
