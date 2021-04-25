package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.PageBase;

public class RegisterationPage extends PageBase {

	static WebDriver driver;
	WebDriverWait wait;
	// Locators of Elements of the registeration page
	By emailvalidText = By.id("email_create");
	By createacctBtn = By.id("SubmitCreate");
	By genderMale = By.id("id_gender1");
	By genderFemale = By.id("id_gender2");
	By CustfirstnameText = By.id("customer_firstname");
	By CustlastnameText = By.id("customer_lastname");
	By passText = By.id("passwd");
	By daysMenuBtn = By.id("uniform-days");
	By daysMenu = By.id("days");
	By monthMenuBtn = By.id("uniform-months");
	By monthMenu = By.xpath("//div[@id='months']");
	By yearMenuBtn = By.id("uniform-years");
	By yearMenu = By.id("years");
	By fnameText = By.id("firstname");
	By lnameText = By.id("lastname");
	By companyText = By.id("company");
	By address1Text = By.id("address1");
	By address2Text = By.id("address2");
	By cityText = By.id("city");
	By stateMenu = By.id("id_state");
	By stateMenuBtn = By.id("uniform-id_state");
    By zipcdText = By.id("postcode");
	By countryMenuBtn = By.id("uniform-id_country");
	By countryMenu = By.id("id_country");
	By additionalText = By.id("other");
	By homePhone = By.id("phone");
	By mobilePhone = By.id("phone_mobile");
	By aliasAddresText = By.id("alias");
	By registerBtn = By.id("submitAccount");
	By myaccountTxt = By.xpath("//div/h1");

	// constructor
	public RegisterationPage(WebDriver driver) {
		RegisterationPage.driver = driver;
		// wait = new WebDriverWait(driver, 1000);
		wait = new WebDriverWait(driver, 1000);
	}

	// Set email address Text field
	public void setEmailvalue(String emailaddress) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailvalidText));
		SetTextElement(driver, emailvalidText, emailaddress, "Email Address");
	}

	// click create account button
	public void clickCreateAccountButton() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(createacctBtn));
		ClickElement(driver, createacctBtn, "Create Account Button");
	}

	// Set customer first name Text field
	public void setCustomerFnamevalue(String Custfirstname) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(CustfirstnameText));
		SetTextElement(driver, CustfirstnameText, Custfirstname, "First Name");
	}

	// Set Customer last name text field
	public void setCustomerLnamevalue(String Custlastname) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(CustlastnameText));
		SetTextElement(driver, CustlastnameText, Custlastname, "Last Name");
	}

	// Set password Text field
	public void setPasswordvalue(String password) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(passText));
		SetTextElement(driver, passText, password, "Password");
	}

	// Set first name Text field
	public void setFirstNamevalue(String fname) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(fnameText));
		SetTextElement(driver, fnameText, fname, "First Name");
	}

	// Set second name Text field
	public void setLastNamevalue(String lname) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(lnameText));
		SetTextElement(driver, lnameText, lname, "Last Name");
	}

	// Set Company Text field
	public void setCompanyvalue(String company) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(companyText));
		SetTextElement(driver, companyText, company, "Company");
	}

	// Set First Address Text field
	public void setAddress1value(String address1) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(address1Text));
		SetTextElement(driver, address1Text, address1, "First Address");
	}

	// Set Second Address Text field
	public void setAddress2value(String address2) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(address2Text));
		SetTextElement(driver, address2Text, address2, "Address2 Details");
	}

	// Set City Text field
	public void setCityvalue(String city) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(cityText));
		SetTextElement(driver, cityText, city, "City Name");
	}

	// Set Zip Postal code Text field
	public void setPostalCodevalue(String Zcode) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(zipcdText));
		SetTextElement(driver, zipcdText, Zcode, "Zip Code");
	}

	// Set Additional Text field
	public void setAdditoionalTextvalue(String Additionaltxt) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(additionalText));
		SetTextElement(driver, additionalText, Additionaltxt, "Additional Text");
	}

	// Set Home Phone Text field
	public void setHomePhonevalue(String phoneNo) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(homePhone));
		SetTextElement(driver, homePhone, phoneNo, "Home Number");
	}

	// Set Mobile Phone Text field
	public void setMobileNumbervalue(String mobileNo) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(mobilePhone));
		SetTextElement(driver, mobilePhone, mobileNo, "Mobile Number");
	}

	// Set Alias Address Text field
	public void setAliasAddressvalue(String aliasadd) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(aliasAddresText));
		SetTextElement(driver, aliasAddresText, aliasadd, "Alias Address");
	}

	// click Register button
	public void clickRegisterButton() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(registerBtn));
		ClickElement(driver, registerBtn, "Regsiter Button");
	}

	// To choose Male option
	public void chooseMaleOption() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(genderMale));
		ClickElement(driver, genderMale, "Male Option");
	}

	// click Register button
	public void chooseFemaleOption() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(genderFemale));
		ClickElement(driver, genderFemale, "Female Option");
	}

	// Select Day from list
	public void selectDayfromList(String dayValue) throws InterruptedException {

		ClickElement(driver, daysMenuBtn, "daysMenu");
		wait.until(ExpectedConditions.visibilityOfElementLocated(daysMenu));
		SelectValueFromList(driver, daysMenu, dayValue, "Day of Birth");

	}

	// Select Month from list
	public void selectMonthfromList(String monthValue) throws InterruptedException {
		//ClickElement(driver, monthMenuBtn, "monthMenu");
		wait.until(ExpectedConditions.visibilityOfElementLocated(monthMenu));
		SelectValueFromList(driver, monthMenu, monthValue, "Month of Birth");

	}

	// Select year from list
	public void selectYearfromList(String yearValue) throws InterruptedException {
		ClickElement(driver, yearMenuBtn, "yearMenu");
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearMenu));
		SelectValueFromList(driver, yearMenu, yearValue, "Year of Birth");

	}

	// Select State from list
	public void selectStatefromList(String stateValue) throws InterruptedException {
		//ClickElement(driver, stateMenuBtn, "yearMenu");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(stateMenu));
		SelectValueFromList(driver, stateMenu, stateValue, "State");

	}

	// Select Country from list
	public void selectCountryfromList(String countryValue) throws InterruptedException {
		//ClickElement(driver, countryMenuBtn, "Country");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(countryMenu));
		SelectValueFromList(driver, countryMenu, countryValue, "Country");

	}
	
	public String verifyTextIsDisplayed()throws InterruptedException{
		
		//ElementIsDisplayed(driver, text, "Text");
		String actualTitle = GetElementText(driver,myaccountTxt ,"My account Text");
		return actualTitle;
		
		
	}

}
