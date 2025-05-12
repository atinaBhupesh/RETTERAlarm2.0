package function;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import org.openqa.selenium.WebDriver;

public class E_timeClass extends b_baseClass{
	
	
	String todaysDate;
	String germanyTodaysDate;
	String germanyCurrentTimeHHMMSS;
	
	
	
	public void catchDateTime (WebDriver driver)
	{
		String germanyTimeZone = "Europe/Berlin";
		
		ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());
		ZonedDateTime currentGermanDateTimeHHMM = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());
		
		DateTimeFormatter timeFormatterHHMMSS = DateTimeFormatter.ofPattern("HHmmss");
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
		
		germanyCurrentTimeHHMMSS = currentGermanDateTimeHHMM.format(timeFormatterHHMMSS);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
