package com.makemytrip.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.makemytrip.qa.pages.FlightsPage;
import com.makemytrip.qa.pages.HomePage;
import com.makemytrip.qa.testbase.TestActions;
import com.makemytrip.qa.testbase.TestBase;

public class Flights_SearchFlights extends TestBase {

	TestActions ta = new TestActions();
	HomePage home = new HomePage();
	FlightsPage fp = new FlightsPage();

	public Flights_SearchFlights() {

		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();

	}

	@Test(priority = 1)
	public void switchToFlights() throws InterruptedException {

		home.selectCategory("Flights");
		String currentURL = ta.getCurrentURL();
		Assert.assertEquals("https://www.makemytrip.com/flights/", currentURL);
	}

	@Test(priority = 2, dependsOnMethods = { "switchToFlights" })
	public void flightSearch() throws InterruptedException {

		fp.searchflight();
		System.out.println("From city suggestions list size ->" + fp.fromSuggestionslistSize);
		System.out.println("From city suggestions list ->" + fp.fromSuggestionslistText);
		System.out.println("From city suggestions list size ->" + fp.toSuggestionslistSize);
		System.out.println("From city suggestions list ->" + fp.toSuggestionslistText);
		String currentURL = fp.getCurrentURL();
		boolean result = false;
		if (currentURL.contains("https://www.makemytrip.com/flight/search")) {
			result = true;
		}
		Assert.assertEquals("Flight Search Page not available", true, result);
	}

	@AfterClass
	public void terminate() {

		driver.quit();
	}
}
