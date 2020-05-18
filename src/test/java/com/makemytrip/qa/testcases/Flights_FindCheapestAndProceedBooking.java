package com.makemytrip.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.makemytrip.qa.pages.FlightsPage;
import com.makemytrip.qa.pages.HomePage;
import com.makemytrip.qa.testbase.TestActions;
import com.makemytrip.qa.testbase.TestBase;

public class Flights_FindCheapestAndProceedBooking extends TestBase {

	TestActions ta = new TestActions();
	HomePage home = new HomePage();
	FlightsPage fp = new FlightsPage();

	public Flights_FindCheapestAndProceedBooking() {

		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {

		initialization();
		home.selectCategory("Flights");
		fp.searchflight();

	}

	@Test
	public void findCheapest() throws InterruptedException {

		fp.sortFlightsCheaptoHigh();
		fp.proceedBooking();
		// System.out.println(fp.listText.get(1));
		System.out.println("Saver option price ->" + fp.saverOfferPrice);
		System.out.println("Flexi Plus price ->" + fp.flexiPlusOfferPrice);
		String flightReviewPageURL = ta.switchWindow();
		boolean result = false;
		if (flightReviewPageURL.contains("https://www.makemytrip.com/flight/review")) {
			result = true;
		}
		Assert.assertEquals("Flight Review Page not available", true, result);
	}
	
	@AfterClass
	public void terminate() {
		
		driver.quit();
	}
}

