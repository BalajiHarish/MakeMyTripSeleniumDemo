package com.makemytrip.qa.testbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActions extends TestBase {

	public String value, backupstatustext;
	public int listSize;
	public List<WebElement> list;
	public String[] listTextArray;
	public List<String> listText;

	public void clickElement(By elementLocator) {

		WebElement element = driver.findElement(elementLocator);
		element.click();
	}

	public void enterText(By elementLocator, String textToEnter) {

		WebElement element = driver.findElement(elementLocator);
		element.sendKeys(textToEnter);
	}

	public String getTitle() {

		return driver.getTitle();
	}

	public void sleep(int S) throws InterruptedException {

		Thread.sleep(S);
	}

	public void mouseOver(By elementLocator) {

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(elementLocator);
		action.moveToElement(element).perform();
	}

	public void waitfunction(By elementLocator, int timeinsec) {

		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.elementToBeClickable(elementLocator));

	}

	public void waitForStringMatch(By elementLocator, String listHeading) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = driver.findElement(elementLocator);
		ExpectedCondition<Boolean> elementTextEqualString = arg0 -> element.getText().equalsIgnoreCase(listHeading);
		wait.until(elementTextEqualString);
	}

	public void checkIsDisplayed(By elementLocator) {

		WebElement element = driver.findElement(elementLocator);
		element.isDisplayed();
	}

	public String getattrifromhidden(By elementLocator) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(elementLocator);
			js.executeScript("arguments[0].setAttribute('type','')", element);
			value = driver.findElement(elementLocator).getAttribute("id");
		} catch (Exception e) {

		}
		return value;

	}

	public String getText(By elementLocator) {

		backupstatustext = driver.findElement(elementLocator).getText();
		return backupstatustext;
	}

	public void dropdown(By elementLocator, String guestcreddescription) {

		Select credentialslist = new Select(driver.findElement(elementLocator));
		credentialslist.selectByVisibleText(guestcreddescription);
	}

	public void switchToAlert() {

		String alertText = driver.switchTo().alert().getText();
		System.out.print(alertText);
	}

	public String alertGetText(By elementLocator, By elementLocatordismiss) throws InterruptedException {

		String alertText = driver.findElement(elementLocator).getText();
		Thread.sleep(3000);
		clickElement(elementLocatordismiss);
		System.out.println(alertText);
		return alertText;

	}

	public String getCurrentURL() {

		return driver.getCurrentUrl();
	}

	public List<WebElement> listOfElements(By elementLocator) {

		list = driver.findElements(elementLocator);
		listSize = list.size();
		listTextArray = new String[listSize];

		for (int i = 0; i < listSize; i++) {

			listTextArray[i] = list.get(i).getText();
			// listText = Arrays.toString(listTextArray);
			listText = Arrays.asList(listTextArray);
		}

		return list;
	}

	public int listStringtoListInt(By elementLocator, String value) {

		List<WebElement> priceList = driver.findElements(elementLocator);
		int listlength = priceList.size();
		int convertedList, finalOutput = 0;
		List<Integer> price = new ArrayList<Integer>();

		for (int i = 0; i < listlength; i++) {

			String temp = priceList.get(i).getText();
			temp = temp.replaceAll("[^\\d]", "");
			convertedList = Integer.parseInt(temp);
			price.add(convertedList);
		}
		if (value.equalsIgnoreCase("min")) {

			if (price == null || price.size() == 0) {
				return Integer.MIN_VALUE;
			}
			List<Integer> sortedlist = new ArrayList<>(price);
			Collections.sort(sortedlist);

			finalOutput = sortedlist.get(0);
		} else if (value.equalsIgnoreCase("max")) {

			if (price == null || price.size() == 0) {
				return Integer.MAX_VALUE;
			}
			List<Integer> sortedlist = new ArrayList<>(price);
			Collections.sort(sortedlist);

			finalOutput = sortedlist.get(sortedlist.size()-1);
		}
		
		return finalOutput;
	}

	public int stringToIntConverter(String value) {

		value = value.replaceAll("[^\\d]", "");
		return Integer.parseInt(value);
	}

	public void selectFromList(By elementLocator, String value) {

		list = driver.findElements(elementLocator);
		listSize = list.size();
		for (int i = 0; i < listSize; i++) {

			if (list.get(i).getText().contains(value)) {
				list.get(i).click();
				break;
			}

		}
	}

	/*
	 * public void selectDateUsingJS(By elementLocator, String dateVal) {
	 * 
	 * WebElement element = driver.findElement(elementLocator); JavascriptExecutor
	 * js = ((JavascriptExecutor)driver);
	 * js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",
	 * element); }
	 */

	public String getattrivalue(By elementLocator, String attrival) {

		WebElement priceSortElement = driver.findElement(elementLocator);
		return priceSortElement.getAttribute(attrival);

	}

	public String getWindowHandle() {

		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public String switchWindow() {

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		String parentWindow = it.next();
		System.out.println("Parent Windows ID is: " + parentWindow);
		String childWindow = it.next();
		System.out.println("Child Window ID is: " + childWindow);
		driver.switchTo().window(childWindow);
		return driver.getCurrentUrl();
	}

}
