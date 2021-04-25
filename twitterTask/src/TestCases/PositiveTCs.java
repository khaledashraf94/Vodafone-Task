package TestCases;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import Base.TestBase;

import Pages.HomePage;
import Pages.LoginPage;


public class PositiveTCs extends TestBase{
		HomePage homeObj;
		LoginPage loginObj;
		
		
		@BeforeTest
		public void beforeMethod() throws InterruptedException {
			homeObj = new HomePage(driver);
			loginObj = new LoginPage(driver);
			
			
		}
		@Test(priority = 1)
		public void verifywhenTweetequal250Char() throws InterruptedException {
			
			loginObj.clickLogin();
			loginObj.setEmailvalue("khaledashraf.vodafone@gmail.com");
			loginObj.setPassowrdvalue("Welcome@1");
			loginObj.clickLoginButton();
			String ExpectedText = "This tweet can be longer than 250 character , This tweet can be longer than 250 character , This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character ,This tweet can be longer than 250 character.\r\n"+"Khaledas";
			homeObj.setTweetFieldText(ExpectedText);
			homeObj.clickTweetButton();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			Assert.assertTrue(ExpectedText.contains("This tweet can be longer than 250 character , This tweet can be longer than 250 character "));
			
			
		
	
	

	}
		
	
		@Test(priority = 2)
		public void verifythread() throws InterruptedException {
			
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

			homeObj.clickReply();
			String ExpectedText2 = "reply";
			homeObj.setReplyTweetFieldText(ExpectedText2);
			homeObj.clickReplyTweetButton();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			Assert.assertTrue(ExpectedText2.contains("reply"));
			
			
		
	
	

	}
		
		
		
		
		
		
		
		
		
		
		
		
		//@AfterMethod
		//public void tearDown() throws Exception {
	//	driver.quit();
	//	}


}
