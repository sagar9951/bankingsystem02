package com.ObjectRepos;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_Delete_Beneficiary_Page {

	//Declaration
	@FindBy(xpath="//table/tbody/tr[last()]/td[1]/input[@name='radio']")
	private WebElement deleteradioBtn ;
		
	@FindBy(name="delete_beneficiary")
	private WebElement delete_beneficiaryBtn ;
	
	
	//Initialization
	public CUST_Delete_Beneficiary_Page(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	
	//Utilization
	public WebElement getDeleteradioBtn() {
		return deleteradioBtn;
	}


	public WebElement getDelete_beneficiaryBtn() {
		return delete_beneficiaryBtn;
	}
		
	//Business Logic

}
