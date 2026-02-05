package function;

import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class E_timeClass extends b_baseClass{
	
	
	String todaysDate;
	String germanyTodaysDate;
	String germanyTomorrowDate;
	String germanyCurrentTimeHHMMSS;
	String germanyTimeAfter5MinHH;
	String germanyTimeAfter5MinMM;
	String germanyTimeAfter20MinHH;
	String germanyTimeAfter20MinMM;
	String germanyTimeAfter1Hrs5MinHH;
	String germanyTimeAfter1Hrs5MinMM;
	String germanyTimeAfter1Hrs20MinHH;
	String germanyTimeAfter1Hrs20MinMM;
	
	public void catchDateTime (WebDriver driver)
	{
//		String germanyTimeZone = "Europe/Berlin";
//		
//		ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());
//		ZonedDateTime currentGermanDateTimeHHMM = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());
//		
//		DateTimeFormatter timeFormatterHHMMSS = DateTimeFormatter.ofPattern("HHmmss");
//		
//		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//		
//		germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
//		
//		germanyCurrentTimeHHMMSS = currentGermanDateTimeHHMM.format(timeFormatterHHMMSS);
		
		
		
		
		 ZoneId germanyZone = ZoneId.of("Europe/Berlin");

		    ZonedDateTime nowGermany = ZonedDateTime.now(germanyZone);

		    // Formatters
		    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		    DateTimeFormatter timeFormatterHHMMSS = DateTimeFormatter.ofPattern("HHmmss");
		    DateTimeFormatter timeFormatterHH = DateTimeFormatter.ofPattern("HH");
		    DateTimeFormatter timeFormatterMM = DateTimeFormatter.ofPattern("mm");

		    
		    
		    
		    // Current date & time
		    germanyTodaysDate = nowGermany.format(dateFormatter);
		    germanyCurrentTimeHHMMSS = nowGermany.format(timeFormatterHHMMSS);
		    
		 //tomorrow date
		    
		    LocalDate tomorrowDate = LocalDate.now().plusDays(1);
		    germanyTomorrowDate = tomorrowDate.format(dateFormatter);
		    
		    

		    // Time after 5 minutes
		    ZonedDateTime after5Min = nowGermany.plusMinutes(5);
		    germanyTimeAfter5MinHH = after5Min.format(timeFormatterHH);
		    germanyTimeAfter5MinMM= after5Min.format(timeFormatterMM);
		    
		    // Time after 20 minutes
		    ZonedDateTime after20Min = nowGermany.plusMinutes(20);
		    germanyTimeAfter20MinHH = after20Min.format(timeFormatterHH);
		    germanyTimeAfter20MinMM= after20Min.format(timeFormatterMM);
		    
		 // Time after 1 hrs 5 minutes
		    ZonedDateTime after1Hrs5Min = nowGermany.plusMinutes(65);
		    germanyTimeAfter1Hrs5MinHH = after1Hrs5Min.format(timeFormatterHH);
		    germanyTimeAfter1Hrs5MinMM= after1Hrs5Min.format(timeFormatterMM);
		    
		 // Time after 1 hrs 20 minutes
		    
		    ZonedDateTime after1Hrs20Min = nowGermany.plusMinutes(80);
		    germanyTimeAfter1Hrs20MinHH = after1Hrs20Min.format(timeFormatterHH);
		    germanyTimeAfter1Hrs20MinMM= after1Hrs20Min.format(timeFormatterMM);
		    
		    
		
	}
	
	
	
	
	

	
	

}
