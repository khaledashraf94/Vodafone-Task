package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.Base.PageBase;

public class WomenShoppingPage extends PageBase {

	static WebDriver driver;
	WebDriverWait wait;
	public String i;
	//locators
	By womenTab = By.xpath("//ul/li/a[@title='Women']");
	By proceedBtn = By.xpath("//div[@class='button-container']//a[@title='Proceed to checkout']");
//	By firstProduct = By.xpath("//ul[@class='product_list grid row']/li[" + i + "]");
//	By secondProduct = By.xpath("//ul[@class='product_list grid row']/li[2]");
//	By thridProduct = By.xpath("//ul[@class='product_list grid row']/li[3]");
//	By fourthProduct = By.xpath("//ul[@class='product_list grid row']/li[4]");
//	By fifththProduct = By.xpath("//ul[@class='product_list grid row']/li[5]");
//	By sixthProduct = By.xpath("//ul[@class='product_list grid row']/li[6]");
//	By seventhProduct = By.xpath("//ul[@class='product_list grid row']/li[7]");
	
	//constructor
	public WomenShoppingPage(WebDriver driver) {
		WomenShoppingPage.driver = driver;
		wait = new WebDriverWait(driver, 1000);
	}
	
	//navigate to women tab
	public void navigatetoWomentabLink() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(womenTab));
		ClickElement(driver, womenTab, "Women Tab");



}
	
	// hover over specific product and click on Add to cart button 
		public void addProductToCart(int i) throws InterruptedException {		
		WebElement productBox = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li[" + i + "]"));	 
		productBox.click();
		  //HoverElement(driver, productBox, "Product is displayed");
		WebElement addcartBtn = driver.findElement(By.xpath("(//div[@class='button-container']/a[@title='Add to cart'])[" + i + "]"));
		addcartBtn.click();
		}
		
		//Click Proceed to checkout btn
		public void clickProceedCheckoutButton() throws InterruptedException {

			wait.until(ExpectedConditions.visibilityOfElementLocated(proceedBtn));
			ClickElement(driver, proceedBtn, "Proceed to checkout Button");
		}
	

		
}
