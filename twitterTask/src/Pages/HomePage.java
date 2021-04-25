package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {

	static WebDriver driver;
	WebDriverWait wait;

	// Locators of Elements of the registeration page

	By tweetfieldTxt = By.xpath("//div/div/div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
	By tweetBtn = By.xpath("//div/div[@data-testid='tweetButtonInline']");
	By txtTweet = By.xpath("(//div[@class='css-1dbjc4n']/div/span)[2]");
	//By tweeterror = By.xpath("//div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div");
//	By replybtn = By.xpath("//div[@class='css-18t94o4 css-1dbjc4n r-1777fci r-bt1l66 r-1ny4l3l r-bztko3 r-lrvibr'][@data-testid='reply'][@role ='button'][@tabindex = '0']");
	By replybtn = By.xpath("//div[@data-testid='reply']");
    //By replyfield = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr' ][@data-offset-key='4hh7h-0-0']");
	By replyfield = By.xpath("//div [@id='placeholder-ffcou'][@class='public-DraftEditorPlaceholder-inner']");
    By replytweetbtn = By.xpath("//div[@class='css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-19u6a5r r-ero68b r-1gg2371 r-icoktb r-1ny4l3l r-1fneopy r-o7ynqc r-6416eg r-lrvibr'][@data-testid='tweetButton']");
    
    public HomePage(WebDriver driver) {
		HomePage.driver = driver;
		wait = new WebDriverWait(driver, 1000);
	}
	

	// Set Tweet Text field
	public void setTweetFieldText(String Tweettext) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(tweetfieldTxt));
		driver.findElement(tweetfieldTxt).sendKeys(Tweettext);
	}

	// click on tweet button
	public void clickTweetButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(tweetBtn));
		driver.findElement(tweetBtn).click();
	}
	
	//get the latest tweet text
	
	public String getTweetText() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtTweet));
		return driver.findElement(txtTweet).getText();
		
	}
	
	//Verifythat tweet button is disabled
	
	public void verifybuttonDisabledSuccessfully() throws InterruptedException{
		WebElement DisabledBtn = driver.findElement(tweetBtn);
		Boolean disabled;
       disabled = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].hasAttribute(\"aria-disabled\");", DisabledBtn);
       System.out.println("Button is disabled");
		
	}
	
	//clear the tweet text field
	// click on tweet button
		public void clearTweetText() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tweetfieldTxt));
			driver.findElement(tweetfieldTxt).clear();
		}
	
	
		// click Reply Btn 
		public void clickReply() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(replybtn));
			driver.findElement(replybtn).click(); 
		}

	//tweet reply 
		
		public void setReplyTweetFieldText(String Tweettext2) throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(replyfield));
			driver.findElement(replyfield).sendKeys(Tweettext2);
	

}

		
// click tweet reply btn 
		
		
		public void clickReplyTweetButton() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(replytweetbtn));
			driver.findElement(replytweetbtn).click();
		}
		
		
}