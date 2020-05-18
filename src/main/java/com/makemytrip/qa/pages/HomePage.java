package com.makemytrip.qa.pages;

import org.openqa.selenium.By;

import com.makemytrip.qa.testbase.TestActions;

public class HomePage extends TestActions {
	
	By flights = By.xpath("//li[@class=\"menu_Flights\"]");
	By hotels = By.xpath("//li[@class=\"menu_Hotels\"]");
	By villasAndApts = By.xpath("//li[@class=\"menu_VillasApts\"]");
	By holidays = By.xpath("//li[@class=\"menu_Holidays\"]");
	By trains = By.xpath("//li[@class=\"menu_Trains\"]");
	By buses = By.xpath("//li[@class=\"menu_Buses\"]");
	By cabs = By.xpath("//li[@class=\"menu_Cabs\"]");
	By visas = By.xpath("//li[@class=\"menu_Visa\"]");
	By giftcards = By.xpath("//li[@class=\"menu_Giftcards\"]"); 
	By more = By.xpath("//li[@data-cy=\"menu_More\"]");
	
	By myBizs = By.xpath("//a[@data-cy=\"submenu_MyBiz\"]");
	By internationalFlights = By.xpath("//a[@data-cy=\"submenu_InternationalFlights\"]");
	By internationalHotels = By.xpath("//a[@data-cy=\"submenu_InternationalHotels\"]");
	By deals = By.xpath("//a[@data-cy=\"submenu_Deals\"]");
	By blog = By.xpath("//a[@data-cy=\"submenu_Blog\"]");
	
	//String category = prop.getProperty("category");
	
	public void selectCategory(String category) {
		
		if (category.equalsIgnoreCase("flights")) {
			switchToFlightsPage();
		} else if (category.equalsIgnoreCase("hotels")) {
			switchToHotelsPage();
		}else if (category.equalsIgnoreCase("villasAndApts")) {
			switchToVillasPage();
		}else if (category.equalsIgnoreCase("holidays")) {
			switchToHolidaysPage();
		}else if (category.equalsIgnoreCase("trains")) {
			switchToTrainsPage();
		}else if (category.equalsIgnoreCase("buses")) {
			switchToBusesPage();
		}else if (category.equalsIgnoreCase("cabs")) {
			switchToCabsPage();
		}else if (category.equalsIgnoreCase("visas")) {
			switchToVisaPage();
		}else if (category.equalsIgnoreCase("giftcards")) {
			switchToGiftsPage();
		}else if (category.equalsIgnoreCase("myBizs")) {
			switchToBizPage();
		}else if (category.equalsIgnoreCase("internationalFlights")) {
			switchToInterFlights();
		}else if (category.equalsIgnoreCase("internationalHotels")) {
			switchToInterHotels();
		}else if (category.equalsIgnoreCase("deals")) {
			switchToDealsPage();
		}else if (category.equalsIgnoreCase("blog")) {
			
		}
	}
	
	public FlightsPage switchToFlightsPage() {
		
		clickElement(flights);
		return new FlightsPage();
	}
	
	public HotelsPage switchToHotelsPage() {
		
		clickElement(hotels);
		return new HotelsPage();
	}
	
	public VillasAndAptsPage switchToVillasPage() {
		
		clickElement(villasAndApts);
		return new VillasAndAptsPage();
	}
	
	public HolidaysPage switchToHolidaysPage() {
		
		clickElement(holidays);
		return new HolidaysPage();
	}
	
	public TrainsPage switchToTrainsPage() {
		
		clickElement(trains);
		return new TrainsPage();
	}
	
	public BusesPage switchToBusesPage() {
		
		clickElement(buses);
		return new BusesPage();
	}
	
	public CabsPage switchToCabsPage() {
		
		clickElement(cabs);
		return new CabsPage();
	}
	
	public VisasPage switchToVisaPage() {
		
		clickElement(visas);
		return new VisasPage();
	}
	
	public GiftCardsPage switchToGiftsPage() {
		
		clickElement(giftcards);
		return new GiftCardsPage();
	}
	
	public MyBizPage switchToBizPage() {
		
		mouseOver(more);
		clickElement(myBizs);
		return new MyBizPage();
	}
	
	public InternationalFlightsPage switchToInterFlights() {
		
		mouseOver(more);
		clickElement(internationalFlights);
		return new InternationalFlightsPage();
	}
	
	public InternationalHotelsPage switchToInterHotels() {
		
		mouseOver(more);
		clickElement(internationalHotels);
		return new InternationalHotelsPage();
	}
	
	public DealsPage switchToDealsPage() {
		
		mouseOver(more);
		clickElement(deals);
		return new DealsPage();
	}
	
	public BlogsPage switchToBlogsPage() {
		
		mouseOver(more);
		clickElement(blog);
		return new BlogsPage();
	}

}
