package com.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	public static Logger logger = Logger.getLogger(PageBase.class);

	// to click on element
	public void ClickElement(WebDriver driver, By element_locator, String element_log) {
		logger = Logger.getLogger("Click Element ");

		Boolean flag = ElementIsDisplayed(driver, element_locator, element_log);
		if (flag == true) {
			WebElement element = driver.findElement(element_locator);
			element.click();
			logger.info("Click on " + element_log);
		} else {
			logger.error("Cannot Click on " + element_log);
		}
	}

	// to check if an element is exists or not exist
	public Boolean ElementIsDisplayed(WebDriver driver, By element_locator, String element_log) {
		logger = Logger.getLogger("Check Element is displayed");

		try {
			driver.findElement(element_locator).isDisplayed();
			logger.info(element_log + " is Displayed successfully");
			return true;

		} catch (Exception e) {
			logger.error(element_log + " is not Displayed");
			logger.error(e.getMessage());

			return false;
		}

	}

	// to set text in an element
	public void SetTextElement(WebDriver driver, By element_locator, String value, String element_log) {
		logger = Logger.getLogger("Set Element Text");
		//
		Boolean Flag_element = ElementIsDisplayed(driver, element_locator, element_log);
		// waitUntilElementEnabled(driver, element_locator);
		try {
			if (Flag_element == true) {
				WebElement element = driver.findElement(element_locator);
				element.clear();
				Thread.sleep(5000);
				element.sendKeys(value);
				logger.info("Set " + element_log + " : " + value);
			} else {
				logger.error("Can't Set Element :" + element_log);
			}
		} catch (Exception e) {
			logger.error("Can't Set Element :" + element_log);
		}

	}

	// to get element text
	public String GetElementText(WebDriver driver, By element_locator, String elementLog) {

		logger = Logger.getLogger("Get Element Text");

		String elementText;

		if (driver.findElement(element_locator).isDisplayed()) {
			elementText = driver.findElement(element_locator).getText();
			logger.info(elementLog + " Actual text is " + elementText);
			return elementText;
		} else {
			logger.error(elementLog + " text is not Displayed");
			return "";
		}

	}

	// to get element text
	public String GetElementValue(WebDriver driver, By element_locator, String elementLog) {

		logger = Logger.getLogger("Get Element Text");

		String elementText;

		if (driver.findElement(element_locator).isDisplayed()) {
			elementText = driver.findElement(element_locator).getAttribute("value");
			logger.info(elementLog + " Actual text is " + elementText);
			return elementText;
		} else {
			logger.error(elementLog + " text is not Displayed");
			return "";
		}

	}

	// to select value from list
	public void SelectValueFromList(WebDriver driver, By element_locator, String value, String element_log) {
		logger = Logger.getLogger("Select Item from List");

		ClickElement(driver, element_locator, element_log);
		try {
			Select dropdown = new Select(driver.findElement(element_locator));
			dropdown.selectByVisibleText(value);
			logger.info("Select " + element_log + " :  " + value);
		} catch (Exception e) {
			logger.error(" Cannot find element in list with text  : " + value);

		}

	}

	// to hover over element

	public void HoverElement(WebDriver driver, WebElement element_locator, String element_log) {
		logger = Logger.getLogger("Hover Element ");
		WebElement element = driver.findElement((By) element_locator);

		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			logger.info("Hover element and click " + element_log);
		} catch (Exception ex) {
			logger.error("Can't Hover element " + element_log + " due to exception " + ex.getMessage());
		}
	}

	// select value from list by JS
	public String getSelectedValueByJS(WebDriver driver, By selectLocator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String selectedItemValue = (String) js.executeScript(
				"return arguments[0].options[arguments[0].selectedIndex].value;", driver.findElement(selectLocator));
		logger.info("selectedItemValue --> " + selectedItemValue);

		return selectedItemValue;
	}

}
