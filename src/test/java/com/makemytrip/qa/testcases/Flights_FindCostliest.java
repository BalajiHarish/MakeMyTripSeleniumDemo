package com.makemytrip.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.makemytrip.qa.pages.FlightsPage;
import com.makemytrip.qa.pages.HomePage;
import com.makemytrip.qa.testbase.TestActions;
import com.makemytrip.qa.testbase.TestBase;

public class Flights_FindCostliest extends TestBase{
	
	TestActions ta = new TestActions();
	HomePage home = new HomePage();
	FlightsPage fp = new FlightsPage();

	public Flights_FindCostliest() {

		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {

		initialization();
		home.selectCategory("Flights");
		fp.searchflight();

	}

	@Test
	public void findCostliest() throws InterruptedException {
		
		fp.sortFlightsHightoCheap();
		int maxValue = fp.listStringtoListInt(fp.allFlightsPriceListXpath, "max");
		System.out.println("The maximum ticket price from all the available flights is: " + maxValue);
		Assert.assertEquals("Price Value(Maximum) not matching",maxValue, fp.maxPrice);
		
	}
	
	@AfterClass
	public void terminate() {
		
		driver.quit();
	}

}
