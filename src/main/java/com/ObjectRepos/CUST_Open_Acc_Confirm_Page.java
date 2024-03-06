package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_Open_Acc_Confirm_Page {

	//Declaration
	@FindBy(xpath="//div[@class='cnfrm_info']/span[text()]")
	private WebElement confirmAccDetails;
	

	@FindBy(name="cnfrm-submit")
	private WebElement cnfrm_submitBtn ;
	
	@FindBy(xpath="//input[@value='Go back']")
	private WebElement go_backBtn ;
	
	//Initialization
	public CUST_Open_Acc_Confirm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getCnfrm_submitBtn() {
		return cnfrm_submitBtn;
	}

	public WebElement getGo_backBtn() {
		return go_backBtn;
	}

	public WebElement getConfirmAccDetails() {
		return confirmAccDetails;
	}
	
	//Business Logic
	public void clickOnConfirmBtn() {
		cnfrm_submitBtn.click();
	}
}
