package com.hrms.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {
	
	/**
	 * Method that sends texts to any element
	 * @param element
	 * @param text
	 */
	
	public static void sendText(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Method return object of JSE
	 * @return js object
	 */
	
	public static JavascriptExecutor getJSExecuter() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		return js;
		
	}
	
	
	/**
	 * Method clicks on element with JSE
	 * @param element
	 */
	
	
	public static void jsClick(WebElement element) {
	 getJSExecuter().executeScript("argument[0].click", element);
	}
	
	
	/**
	 * Scroll up by using JSE
	 * @param pixel
	 */
	
	public static void scroolUp(int pixel) {
		getJSExecuter().executeScript("window.scrollBy(0,+"+pixel+")");
	}
	
	/**
	 * Scroll down by using JSE
	 * @param pixel
	 */
	
	public static void scroolDown(int pixel) {
		getJSExecuter().executeScript("window.scrollBy(0,-"+pixel+")");
	}
	
	
	public static WebDriverWait getWaitObject() {
	return	new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
	}
	
	
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));

	}
	
	
	public static void click(WebElement element) {
	waitForClickability(element);
		element.click();
		
	}
	

}
