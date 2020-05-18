package com.makemytrip.qa.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.makemytrip.qa.testbase.TestActions;

public class FlightsPage extends TestActions {

	By fromCity = By.xpath("//input[@placeholder=\"From\"]");
	By toCity = By.xpath("//input[@placeholder=\"To\"]");
	By searchButton = By.xpath("//a[contains(text(),\"Search\")]");
	String fromCityName = prop.getProperty("FromCity");
	String toCityName = prop.getProperty("ToCity");
	By fromBox = By.xpath("//label[@for=\"fromCity\"]");
	By toBox = By.xpath("//label[@for=\"toCity\"]");
	public int fromSuggestionslistSize;
	public List<String> fromSuggestionslistText;
	public int toSuggestionslistSize;
	public List<String> toSuggestionslistText;

	By SuggestionListxpath = By
			.xpath("//ul[@role=\"listbox\"]//li/descendant::div//p[@class=\"font14 appendBottom5 blackText\"]");
	public List<WebElement> fromSuggetions;
	public List<WebElement> toSuggetions;
	By listHeading = By.xpath("//div/p[@class=\"hsw_sectionTitle font12 latoBlack greyText\"]");
	String requiredHeading = "SUGGESTIONS";

	By depatureDateSelection = By.xpath("//label[@for=\"departure\"]");
	By depatureDateHeading = By.xpath("//div[@class=\"DayPicker-Caption\"]/div");
	public List<WebElement> displayedMonths;
	public List<String> availableMonthsinUI;

	String dateBeforeXpath = "//div[@class='DayPicker-Caption']/div[contains(text(),'";
	String dateMiddleXpath = "')]//parent::div/following-sibling::div[@class='DayPicker-Body']//descendant::div[@class='dateInnerCell']/p[text()=";
	String dateAfterXpath = "]";
	String MonthYear = prop.getProperty("MonthAndYear");
	String Date = prop.getProperty("Date");

	By datexpath = By.xpath(dateBeforeXpath + MonthYear + dateMiddleXpath + Date + dateAfterXpath);
	By nextMonthScrollButton = By.xpath("//span[@role=\"button\" and @aria-label=\"Next Month\"]");

	By travellersXpath = By.xpath("//p[@data-cy=\"travellerText\"]");

	String adultsCountBeforeXpath = "//p[@data-cy='adultRange']//following-sibling::ul/li[text()=";
	String adultsCountAfterXpath = "]";
	String adultsNumber = prop.getProperty("Adults");
	By adultsCount = By.xpath(adultsCountBeforeXpath + adultsNumber + adultsCountAfterXpath);

	String childCountBeforeXpath = "//p[@data-cy='childrenRange']//following-sibling::ul/li[text()=";
	String childCountAfterXpath = "]";
	String childrenNumber = prop.getProperty("Children");
	By ChildrenCount = By.xpath(childCountBeforeXpath + childrenNumber + childCountAfterXpath);

	String infantCountBeforeXpath = "//p[@data-cy='infantRange']//following-sibling::ul/li[text()=";
	String infantCountAfterXpath = "]";
	String infantNumber = prop.getProperty("Infant");
	By infantCount = By.xpath(infantCountBeforeXpath + infantNumber + infantCountAfterXpath);

	By EconomyAndPremiumEconomy = By.xpath("//li[@data-cy=\"travelClass-0\"]");
	By PremiumEconomy = By.xpath("//li[@data-cy=\"travelClass-1\"]");
	By Business = By.xpath("//li[@data-cy=\"travelClass-2\"]");

	By travellersApplyButton = By.xpath("//button[@data-cy=\"travellerApplyBtn\"]");

	By priceButtonXpath = By.xpath("//span[@class=\"pointer\"]/span[text()=\"Price\"]");
	// By priceSortArrowXpath = By.xpath("//span[@class=\"pointer\"]/span[text()=\"Price\"]/following-sibling::span");
	By priceSortArrowXpath = By.xpath("//span[@class=\"pointer\"]/span[2]");
	public int minPrice;
	public int maxPrice;
	
	By airwaysName = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::p/span[@class=\"airways-name \"]");
	By flightCodeXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::p[@class=\"fli-code\"]");
	By deptTimeXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::div[@class=\"dept-time\"]");
	By deptCityXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::p[@class=\"dept-city\"]");
	By arrivalCityXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::p[@class=\"arrival-city\"]");
	By arrivalTimeXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::p[@class=\"reaching-time append_bottom3\"]");
	By priceXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::div[@class=\"fli-list-body-section\"]/descendant::span[@class=\"actual-price\"]");
	By bookingProceedButton = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//descendant::div[@class=\"fli-list-body-section\"]//div/button");
	By availableBookingOptionsPrice = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//div[@class=\"viewFaresOuter collapse in\"]//descendant::span[@class=\"actual-price\"]");

	public By allFlightsPriceListXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div//descendant::div[@class=\"fli-list-body-section\"]/descendant::span[@class=\"actual-price\"]");
	
	public List<WebElement> fareOptionsPrice;
	By offerTypeSaver = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//div[@class=\"viewFaresOuter collapse in\"]//descendant::div[contains(text(),\"Saver\")]//following-sibling::div/descendant::span[@class=\"actual-price\"]");
	By offerTypeFlexiPlus = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//div[@class=\"viewFaresOuter collapse in\"]//descendant::div[contains(text(),\"Flexi plus\")]//following-sibling::div/descendant::span[@class=\"actual-price\"]");
	public String saverOfferPrice, flexiPlusOfferPrice;
	String offerType = prop.getProperty("OfferType");
	By saverBookNowButtonXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//div[@class=\"viewFaresOuter collapse in\"]//descendant::div[contains(text(),\"Saver\")]//following-sibling::div/descendant::button[contains(text(),\"Book Now\")]");
	By flexiPlusBookNowButtonXpath = By.xpath("//div[@class=\"fli-intl-lhs pull-left\"]/div[@class=\"fli-intl-lhs pull-left\"]/div/div[1]//div[@class=\"viewFaresOuter collapse in\"]//descendant::div[contains(text(),\"Flexi plus\")]//following-sibling::div/descendant::button[contains(text(),\"Book Now\")]");
	
	public void searchflight() throws InterruptedException {

		sleep(5000);
		clickElement(fromBox);
		enterText(fromCity, fromCityName);
		waitForStringMatch(listHeading, requiredHeading);
		sleep(5000);
		fromSuggetions = listOfElements(SuggestionListxpath);
		fromSuggestionslistSize = listSize;
		fromSuggestionslistText = listText;
		selectFromList(SuggestionListxpath, fromCityName);

		sleep(5000);
		clickElement(toCity);
		enterText(toCity, toCityName);
		waitForStringMatch(listHeading, requiredHeading);
		sleep(5000);
		toSuggetions = listOfElements(SuggestionListxpath);
		toSuggestionslistSize = listSize;
		toSuggestionslistText = listText;
		selectFromList(SuggestionListxpath, toCityName);

		try {
			clickElement(depatureDateSelection);
		} catch (Exception e) {

		}
		sleep(2000);
		boolean result = true;
		while (result) {

			displayedMonths = listOfElements(depatureDateHeading);
			availableMonthsinUI = listText;
			System.out.println(availableMonthsinUI);
			if (listText.contains(MonthYear)) {

				result = false;
				break;
			} else {

				sleep(2000);
				clickElement(nextMonthScrollButton);
			}
		}

		clickElement(datexpath);
		sleep(3000);
		clickElement(travellersXpath);
		clickElement(adultsCount);
		clickElement(ChildrenCount);
		clickElement(infantCount);

		if (prop.getProperty("class").equalsIgnoreCase("EconomyAndPremiumEconomy")) {

			clickElement(EconomyAndPremiumEconomy);
		} else if (prop.getProperty("class").equalsIgnoreCase("premiumEconomy")) {

			clickElement(PremiumEconomy);
		} else if (prop.getProperty("class").equalsIgnoreCase("Business")) {

			clickElement(Business);
		}

		clickElement(travellersApplyButton);
		sleep(3000);
		clickElement(searchButton);

	}

	public void sortFlightsCheaptoHigh() throws InterruptedException {

		sleep(5000);
		boolean result = true;
		while (result) {
			String currentArrowPosition = getattrivalue(priceSortArrowXpath, "class");

			if (currentArrowPosition.equalsIgnoreCase("down sort-arrow")) {
				System.out.println("Flight listing in ascending order wrt Price");
				result = false;
				break;
			} else {
				clickElement(priceButtonXpath);
			}
		}
		String airwaysCompany = getText(airwaysName);
		System.out.println("Airline Name ->" + airwaysCompany);
		String flightCode = getText(flightCodeXpath);
		System.out.println("Flight Code ->" + flightCode);
		String departureTime = getText(deptTimeXpath);
		System.out.println("Departure Time ->" + departureTime);
		String departureCityName = getText(deptCityXpath);
		System.out.println("Departure City ->" + departureCityName);
		String arrivalTime = getText(arrivalTimeXpath);
		System.out.println("Arrival Time ->" + arrivalTime);
		String arrivalCity = getText(arrivalCityXpath);
		System.out.println("Arrival City ->" + arrivalCity);
		String ticketFare = getText(priceXpath);
		System.out.println("Ticket Price ->" + ticketFare);
		
		minPrice = stringToIntConverter(ticketFare);
	}
	
	public void sortFlightsHightoCheap() throws InterruptedException {
		
		sleep(15000);
		boolean result = true;
		while (result) {
			String currentArrowPosition = getattrivalue(priceSortArrowXpath, "class");
			System.out.println(currentArrowPosition);

			if (currentArrowPosition.equalsIgnoreCase("up sort-arrow")) {
				System.out.println("In descending order");
				result = false;
				break;
			} else {
				clickElement(priceButtonXpath);
			}
		}
		
		String airwaysCompany = getText(airwaysName);
		System.out.println("Airline Name ->" + airwaysCompany);
		String flightCode = getText(flightCodeXpath);
		System.out.println("Flight Code ->" + flightCode);
		String departureTime = getText(deptTimeXpath);
		System.out.println("Departure Time ->" + departureTime);
		String departureCityName = getText(deptCityXpath);
		System.out.println("Departure City ->" + departureCityName);
		String arrivalTime = getText(arrivalTimeXpath);
		System.out.println("Arrival Time ->" + arrivalTime);
		String arrivalCity = getText(arrivalCityXpath);
		System.out.println("Arrival City ->" + arrivalCity);
		String ticketFare = getText(priceXpath);
		System.out.println("Ticket Price ->" + ticketFare);
		
		maxPrice = stringToIntConverter(ticketFare);
	}
	
	public void proceedBooking() throws InterruptedException {
		
		String proceedButtonText = getText(bookingProceedButton);
		if (proceedButtonText.equalsIgnoreCase("View Fares")) {
			
			clickElement(bookingProceedButton);
			sleep(3000);
			//fareOptionsPrice = listOfElements(availableBookingOptionsPrice);
			saverOfferPrice = getText(offerTypeSaver);
			flexiPlusOfferPrice = getText(offerTypeFlexiPlus);
			if(offerType.equalsIgnoreCase("FlexiPlus")) {
				clickElement(flexiPlusBookNowButtonXpath);
			}else if(offerType.equalsIgnoreCase("Saver")){
				clickElement(saverBookNowButtonXpath);
			}
				
		}else {
			
			clickElement(bookingProceedButton);
		}
	}

}
