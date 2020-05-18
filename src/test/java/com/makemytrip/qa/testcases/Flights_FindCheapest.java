package com.makemytrip.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.makemytrip.qa.pages.FlightsPage;
import com.makemytrip.qa.pages.HomePage;
import com.makemytrip.qa.testbase.TestActions;
import com.makemytrip.qa.testbase.TestBase;

public class Flights_FindCheapest extends TestBase {

	TestActions ta = new TestActions();
	HomePage home = new HomePage();
	FlightsPage fp = new FlightsPage();

	public Flights_FindCheapest() {

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
		int minValue = fp.listStringtoListInt(fp.allFlightsPriceListXpath, "min");
		System.out.println("The minimum ticket price from all the available flights is: " + minValue);
		Assert.assertEquals("Price Value(Minimum) not matching",minValue, fp.minPrice);
		
	}
	
	@AfterClass
	public void terminate() {
		
		driver.quit();
	}
}
