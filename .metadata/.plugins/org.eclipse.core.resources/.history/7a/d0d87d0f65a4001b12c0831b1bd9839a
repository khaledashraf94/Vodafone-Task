package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.PageBase;


public class HomePage extends PageBase {

		
		static WebDriver driver;
		 WebDriverWait wait;

		// Locators of Elements of the home page
		By signinLink = By.xpath("//div/a[@class='login']");
		By pageTitle = By.xpath("/html/head/title");
		
		
		//constructor

		public HomePage(WebDriver driver) {
			
			HomePage.driver = driver;
			wait =new WebDriverWait(driver, 1000);
			
		}
		
		public String verifyTitleIsDisplayed()throws InterruptedException{
			
			//ElementIsDisplayed(driver, text, "Text");
			String actualTitle = driver.getTitle();
			return actualTitle;
			
			
		}
		public void navigatetoSignInLink() throws InterruptedException {

				wait.until(ExpectedConditions.visibilityOfElementLocated(signinLink));
				ClickElement(driver, signinLink, "Signin Link");

		

		}

	}


