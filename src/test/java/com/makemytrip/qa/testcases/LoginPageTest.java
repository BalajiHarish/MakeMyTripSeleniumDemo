package com.makemytrip.qa.testcases;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.makemytrip.qa.pages.LoginPage;
import com.makemytrip.qa.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
	
	LoginPage login = new LoginPage();
	
	public LoginPageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();

	}
	
	@Test
	public void PersonalAccountLogin() throws InterruptedException{
		
		login.Login();
		System.out.println("As of now everything working fine");
	}
	
	/*@AfterMethod
	public void finish() throws InterruptedException {

		driver.quit();
	}*/


}
