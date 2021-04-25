package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class NegativeTCs extends TestBase{
	HomePage homeObj;
	LoginPage loginObj;
	
	
	@BeforeTest
	public void beforeMethod() throws InterruptedException {
		homeObj = new HomePage(driver);
		loginObj = new LoginPage(driver);
		
		
	}
	@Test(priority = 1)
	public void verifyTweetmorethan250Char() throws InterruptedException {
		
		loginObj.clickLogin();
		loginObj.setEmailvalue("khaledashraf.vodafone@gmail.com");
		loginObj.setPassowrdvalue("Welcome@1");
		loginObj.clickLoginButton();
		String ExpectedText = "This tweet can be longer than 250 character , This tweet can be longer than 250 character , This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character.\r\n"+"KhaledAshraf.";
		homeObj.setTweetFieldText(ExpectedText);
		//homeObj.clickTweetButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
		homeObj.verifybuttonDisabledSuccessfully();
		
		
		
		


}
	
	@Test(priority = 2)
	public void verifyduplicatetweets() throws InterruptedException{
		
		
		Thread.sleep(2000);

		homeObj.clearTweetText();
		
		String ExpectedText = "This tweet can be longer than 250 character , This tweet can be longer than 250 character , This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character.\r\n"+"Khaledas";
		homeObj.setTweetFieldText(ExpectedText);
		homeObj.clickTweetButton();
		Thread.sleep(1000);

		String ExpectedText2 = "This tweet can be longer than 250 character , This tweet can be longer than 250 character , This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character.\r\n"+"Khaledas";
		homeObj.setTweetFieldText(ExpectedText2);
		homeObj.clickTweetButton();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		 SoftAssert softAssert = new SoftAssert();
	        String ActualErrorMEssage = driver.findElement(By.xpath("//div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div")).getText();
	        
	        softAssert.assertEquals(ActualErrorMEssage,"Something went wrong, but don’t fret — let’s give it another shot.\r\n"
	        				+ "");
	        softAssert.assertAll();

				
		
	
		
	}
	
	
	
	//@AfterMethod
	//public void tearDown() throws Exception {
	//driver.quit();
	//}
	

}
