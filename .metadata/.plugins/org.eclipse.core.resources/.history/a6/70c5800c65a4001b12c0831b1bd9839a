package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.PageBase;

public class CartCheckoutPage extends PageBase {
	static WebDriver driver;
	WebDriverWait wait;

	// locators
	
	By proceedCheckoutBtn = By.xpath("//div[@id='center_column']//a[@title='Proceed to checkout']");
	By processAddress = By.name("processAddress");
	By termsCheckBox = By.id("uniform-cgv");
	By proceedShipping = By.name("processCarrier");
	By payCheque = By.xpath("//div/p/a[@class='cheque']");
	By confirmOrderBtn = By.xpath("//div[@id='center_column']//button[@type='submit']");
	By successOrdermsg= By.xpath("//div[@id='center_column']/p");

	// constructor
	public CartCheckoutPage(WebDriver driver) {
		CartCheckoutPage.driver = driver;
		wait = new WebDriverWait(driver, 1000);
	}

	// Click Proceed to checkout btn
	public void clickCheckoutButtonSummaryTab() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(proceedCheckoutBtn));
		ClickElement(driver, proceedCheckoutBtn, "Proceed to checkout Button In Summary Tab");
	}

	// Click Proceed to checkout btn
	public void clickCheckoutButtonAddressTab() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(processAddress));
		ClickElement(driver, processAddress, "Proceed to checkout Button In Address Tab");
	}
	// Check box of the terms
	public void checkTermsBox() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(termsCheckBox));
		ClickElement(driver, termsCheckBox, "Check box of terms");
	}
	// Click Proceed to checkout btn
	public void clickCheckoutButtonShippingTab() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(proceedShipping));
		ClickElement(driver, proceedShipping, "Proceed to checkout Button In Shipping Tab");
	}
	// Choose Pay by check btn
	public void ChoosePayByCheck() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(payCheque));
		ClickElement(driver, payCheque, "Choose to pay by check");
	}
	
	//Click on confirm my order
	public void clickonConfirmMyOrder() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmOrderBtn));
		ClickElement(driver, confirmOrderBtn, "Click on I confirm my order");
	}
	//verify text is displayed
	public String verifyTextIsDisplayed()throws InterruptedException{
		
		//ElementIsDisplayed(driver, text, "Text");
		String actualTitle = GetElementText(driver, successOrdermsg ,"My account Text");
		return actualTitle;
		
		
	}
}
