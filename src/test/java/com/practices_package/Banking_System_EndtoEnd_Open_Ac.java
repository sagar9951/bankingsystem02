/*
package com.practices_package;
//package com.bankingSystem_Customer_package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

import com.bankingSystem.genericutils.WebDriverUtils;
import com.bankingSystem_Staff_package.ApprovePendingApplication_SmokeTest;
import com.bankingSystem_Staff_package.CreditCustomer_Test;

public class Banking_System_EndtoEnd_Open_Ac {
	static WebDriver driver = null;
	Workbook wb = null;
	Sheet sh, sh2 ,sh3 = null;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		OpenAccountApplicationForm_Test opAC = new OpenAccountApplicationForm_Test();
		ApprovePendingApplication_SmokeTest apprv = new ApprovePendingApplication_SmokeTest();
		CreditCustomer_Test credCust = new CreditCustomer_Test();
		ApplyDebitCard_Test appDebit = new ApplyDebitCard_Test();
		InternetBanking_Test register = new InternetBanking_Test();
		FundTransfer_Test fndTF = new FundTransfer_Test();
		
		WebDriverUtils wLib = new WebDriverUtils();
		
		
		// Step1. open account application to get application no.
		opAC.openAccount();
		Thread.sleep(1000);
//		driver.quit();
		
		//step2. Approve account application from staff  to get account no.
		apprv.staffLogin();		
		apprv.staffApprvApplication();
		Thread.sleep(1000);
		
		//step3. credit some amount into the created account
		credCust.staffLogin();
		credCust.creditCustomerTest();
		wLib.acceptAlert(driver); // handling alert
		System.out.println("Amount credited Successfully");
		
		//step4. Apply for Debit card to obtain Debit card no. and Pin
		Thread.sleep(1000);
		appDebit.applyDebitCard_test();
		
		//step5. Register for Internet Banking to get Customer ID and setting password
		register.internetBanking_Register_Test();
		
		//step6. Login for Internet banking using customer id and password and //step7. transfer some funds 
		fndTF.fundTransfer_Test();
		
		
	} // main ends
	
	
} // class ends

*/



