package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.PageBase;

public class LoginPage extends PageBase {

	static WebDriver driver;
	WebDriverWait wait;
	// Locators of Elements of the registeration page
	By emailaddressText = By.id("email");
	By passwordText = By.id("passwd");
	By loginBtn = By.id("SubmitLogin");
	By myaccountTxt = By.xpath("//div/h1");
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		wait = new WebDriverWait(driver, 1000);
	}
	
	// Set email address Text field
		public void setEmailvalue(String email) throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(emailaddressText));
			SetTextElement(driver, emailaddressText, email, "Email Address");
		}
		
		// Set Password Text field
			public void setPassowrdvalue(String Password) throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOfElementLocated(passwordText));
				SetTextElement(driver, passwordText, Password , "Password");
			}
		// click Login button
		public void clickLoginButton() throws InterruptedException {

			wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
			ClickElement(driver, loginBtn, "Login Button");
		}
		
		public String verifyTextIsDisplayed()throws InterruptedException{
			
			//ElementIsDisplayed(driver, text, "Text");
			String actualTitle = GetElementText(driver,myaccountTxt ,"My account Text");
			return actualTitle;
			
			
		}


	
}
