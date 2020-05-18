package com.makemytrip.qa.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import com.makemytrip.qa.testbase.TestActions;

public class LoginPage extends TestActions {

	By LoginorSignUPButton = By.xpath("//p[contains(text(),\" Login or Create Account\")]");

	By BizAccountLogin = By.xpath("//li[@data-acctype=\"myBiz\"]");
	By LoginUserName = By.xpath("//input[@id=\"username\"]");
	By ContinueButton = By.xpath("//button/span[contains(text(),\"Continue\")]");
	By LoginWithFB = By.xpath("//div[@data-cy=\"fbLogin\"]");
	By LoginWithGoogle = By.xpath("//div[@data-cy=\"googleLogin\"]");

	By LoginPassword = By.xpath("//input[@id=\"password\"]");
	By LoginPasswordDisplayText = By.xpath("//span[contains(text(),\"Login With Password\")]");
	By LoginButton = By.xpath("//button[@data-cy=\"login\"]");
	
	By LoginWithOTP = By.xpath("//a[contains(text(),\"or Login via OTP\")]");
	By LoginOTP = By.xpath("//input[@id=\"otp\"]");

	String AccountType = prop.getProperty("AccountType");
	String LoginType = prop.getProperty("LoginType");
	String UserName = prop.getProperty("UserName");
	String LoginVia = prop.getProperty("LoginVia");
	String Password = prop.getProperty("Password");
	String OTP = prop.getProperty("OTP");

	public void Login() throws InterruptedException {

		clickElement(LoginorSignUPButton);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		if (AccountType.equalsIgnoreCase("Personal")) {
			LoginType();
		} else if (AccountType.equalsIgnoreCase("Biz")) {
			clickElement(BizAccountLogin);
		}
	}

	public void LoginType() throws InterruptedException {

		if (LoginType.equalsIgnoreCase("EmailorMobile")) {

			LoginWithEmail();
		} else if (LoginType.equalsIgnoreCase("Facebook")) {

			sleep(3000);
			LoginWithFacebook();
		} else if (LoginType.equalsIgnoreCase("Google")) {

			sleep(3000);
			LoginWithGoogle();
		}
	}

	public void LoginWithEmail() throws InterruptedException {

		enterText(LoginUserName, UserName);
		clickElement(ContinueButton);
		clickElement(ContinueButton);
		//driver.findElement(ContinueButton).sendKeys(Keys.ENTER);
		if(LoginVia.equalsIgnoreCase("Password")) {
			
			enterText(LoginPassword, Password);
			sleep(3000);
			clickElement(LoginButton);
			
		}else if(LoginVia.equalsIgnoreCase("OTP")) {
			
			clickElement(LoginWithOTP);
			enterText(LoginOTP, OTP);
			clickElement(LoginButton);
		}

	}

	public void LoginWithFacebook() {
		
		System.out.println("Inside Facebooooooook");
	}

	public void LoginWithGoogle() {
		
		System.out.println("Inside Google");
	}

}
