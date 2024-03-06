package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_Profile_Page {

	//Declaration
	@FindBy(name="home")
	private WebElement custhomeBtn ;
	
	@FindBy(name="logout_btn")
	private WebElement custlogoutBtn ;
	
	@FindBy(xpath="//li[.='My Account']")
	private WebElement myAccLink ;
		
	@FindBy(xpath="//li[.='My Profile']")
	private WebElement myProfileLink ;
		
	@FindBy(xpath="//li[.='Change Password']")
	private WebElement changePasswordLink ;
		
	@FindBy(xpath="//li[.='Fund Transfer']")
	private WebElement fnd_trnsLink ;
	
	@FindBy(xpath="//li[.='Statement']")
	private WebElement StatementLink ;
	
	
	
	//Initialization
	public CUST_Profile_Page(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	
	
	//Utilization
	public WebElement getMyAccLink() {
		return myAccLink;
	}

	public WebElement getCusthomeBtn() {
		return custhomeBtn;
	}

	public void setCusthomeBtn(WebElement custhomeBtn) {
		this.custhomeBtn = custhomeBtn;
	}

	public WebElement getCustlogoutBtn() {
		return custlogoutBtn;
	}

	public void setCustlogoutBtn(WebElement custlogoutBtn) {
		this.custlogoutBtn = custlogoutBtn;
	}

	public WebElement getMyProfileLink() {
		return myProfileLink;
	}

	public WebElement getChangePasswordLink() {
		return changePasswordLink;
	}

	public WebElement getFnd_trnsLink() {
		return fnd_trnsLink;
	}

	public WebElement getStatementLink() {
		return StatementLink;
	}
		
	//Business Logic
}
