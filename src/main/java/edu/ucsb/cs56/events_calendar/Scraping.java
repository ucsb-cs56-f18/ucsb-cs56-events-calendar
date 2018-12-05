package main.java.edu.ucsb.cs56.events_calendar;

import main.java.edu.ucsb.cs56.events_calendar.Event;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * TODO: - Write the loading into database method
 * 		 - Parse time, days, rooms/buildings
 * 		 - Use the building class and room
 */
public class Scraping {
     private static Logger logger = LoggerFactory.getLogger(Scraping.class);


	// START -  MUTABLE ATTRIBUTES
	private static HtmlUnitDriver driver;
	private static HashMap<String,Event> events;
	// END - MUTABLE ATTRIBUTES


	// START - IMMUTABLE ATTRIBUTES
	private static String target_url = "https://events.ucsb.edu/next-three-months/";
	private static String eventDivsXPath = "//div[@class=\"mini-boxX\"]";
	// END - IMMUTABLE ATTRIBUTES

	public Scraping() {
		driver = new HtmlUnitDriver();
		driver.setJavascriptEnabled(true);
		driver.get(target_url);
		ArrayList<String> events= get_events(driver);
		logger.info("works:" + events);
		//load_times_rooms_days(driver, events);
	}

	public static void main(String []args){
		Scraping s = new Scraping();
	}


	/*
	*	parameters:
	*		driver	-- HtmlUnitDriver object for scraping
	*/
	public static ArrayList<String> get_events(HtmlUnitDriver driver){


		java.util.List<WebElement> eventDivs =  driver.findElementsByXPath(eventDivsXPath);

		logger.info("eventDivs:" + eventDivs);
		
		ArrayList<String> temp = new ArrayList<String>();

		for(WebElement e : eventDivs )
			temp.add(e.getText());

		return temp;
	}

	/*
	*	parameters:
	*		driver	-- HtmlUnitDriver object for scraping
	*		courses	-- ArrayList<String> of courses already
	*/
	public static void load_times_rooms_days(HtmlUnitDriver driver, ArrayList<String> courses){

		/* TODO: Loop through each course and level
		 * Start with the one subject area
		 * Then move on to all subject areas
		 * and finally to all course levels
		 * add sleep() between courses
		*/

		// VARIABLE - DELIMITER TO PARSE DAY STRING, RANDOM DELAY FOR SCRAPING
		/*String delimiter = "(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)";
		double r = (Math.random() * ((60000 - 4000) + 1)) + 4000;

		for(String c : courses) {
			//	grabs element id
			Select course_editbox = new Select(driver.findElementByXPath(eventListXPath));
			course_editbox.selectByVisibleText(c);

			//	grabs course level and changes to ALL
			Select lvl_editbox = new Select(driver.findElementByXPath());
			lvl_editbox.selectByVisibleText(allCourseLevels);

			//	grabs element id and clicks
			WebElement search_button = driver.findElementByXPath(searchButtonXPath);
			search_button.click();

			for(int i = 1; i <= driver.findElements(By.xpath(courseTableXPath)).size(); i++){
				String location = driver.findElement(By.xpath(String.format(locationXPath,i)).getText());

				String[] location_room = location.split(delimiter);

				if(location_room[0].compareTo(nonRooms) != 0) {
					if(!events.containsKey(location_room[0]))
						events.put(location, new event(location_room[0]));

					events.get(location_room[0]).addToRoom((location_room.length == 1)? 0 : Integer.parseInt(location_room[1]),
							driver.findElement(By.xpath(String.format(daysXPath, i))).toString());
							driver.findElement(By.xpath(String.format(timesXPath, i)).toString());
				}
			}

			// random delay
			Thread.sleep((long) r);
		}*/
	}
}
