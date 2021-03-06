package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  {

	 static WebDriver driver;
	WebDriverWait wait;
	
	// Locators of Elements of the registeration page
	By loginBtn = By.xpath("//div/a[@data-testid='loginButton']");
	////div/input[@name='session[username_or_email]']
	By emailTxt = By.name("session[username_or_email]");
	By password =  By.name("session[password]");
	By loginformBtn = By.xpath("//div[@data-testid='LoginForm_Login_Button']");
	
			
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		wait = new WebDriverWait(driver, 1000);
	}
	
	//click on login button
	public void clickLogin() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		driver.findElement(loginBtn).click(); 
	}
	
	
	
	
	
	
	
	
	
	// Set email address Text field
		public void setEmailvalue(String email) throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(emailTxt));
			driver.findElement(emailTxt).sendKeys(email);
		}
		
		// Set Password Text field
			public void setPassowrdvalue(String Password) throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOfElementLocated(password));
				driver.findElement(password).sendKeys(Password);
			}
		// click Login form button
		public void clickLoginButton() throws InterruptedException {

			wait.until(ExpectedConditions.visibilityOfElementLocated(loginformBtn));
			driver.findElement(loginformBtn).click(); 
		}
		
	


	
}
