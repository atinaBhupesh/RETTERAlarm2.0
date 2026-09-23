package function;

import java.time.DayOfWeek;
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


public class E_timeClass extends b_baseClass {

	String todaysDate;
	String germanyTodaysDate;
	String germanyTodaysDate1;
	String germanyTodaysDate2;
	String germanyTodaysDate3;
	String germanyTodaysDate4;
	String germanyTomorrowDate;
	String germanyCurrentTimeHHMMSS;
	String dayName;
	String dayCount;
	int monthCount;
	
	String germanyTimeAfter5MinHH;
	String germanyTimeAfter5MinMM;
	
	String germanyTimeAfter7MinHH;
	String germanyTimeAfter7MinMM;

	String germanyTimeAfter9MinHH;
	String germanyTimeAfter9MinMM;
	
	String germanyTimeAfter11MinHH;
	String germanyTimeAfter11MinMM;
	
	String germanyTimeAfter15MinHH;
	String germanyTimeAfter15MinMM;
	
	String germanyTimeAfter20MinHH;
	String germanyTimeAfter20MinMM;
	String germanyTimeAfter1Hrs5MinHH;
	String germanyTimeAfter1Hrs5MinMM;
	String germanyTimeAfter1Hrs20MinHH;
	String germanyTimeAfter1Hrs20MinMM;

	public void catchDateTime(WebDriver driver) {
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
		
		
//		ZoneId germanyZone = ZoneId.of("Europe/Berlin");
		ZoneId germanyZone = ZoneId.of("Asia/Kolkata");

		ZonedDateTime nowGermany = ZonedDateTime.now(germanyZone);

		
		
		// Formatters
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		DateTimeFormatter timeFormatterHHMMSS = DateTimeFormatter.ofPattern("HHmmss");
		DateTimeFormatter timeFormatterHH = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter timeFormatterMM = DateTimeFormatter.ofPattern("mm");

		// Current date & time
		germanyTodaysDate = nowGermany.format(dateFormatter);
		germanyTodaysDate1=nowGermany.format(dateFormatter1);
		germanyCurrentTimeHHMMSS = nowGermany.format(timeFormatterHHMMSS);

		// tomorrow date

		LocalDate tomorrowDate = LocalDate.now().plusDays(1);
		germanyTomorrowDate = tomorrowDate.format(dateFormatter);

		// Time after 5 minutes
		ZonedDateTime after5Min = nowGermany.plusMinutes(5);
		germanyTimeAfter5MinHH = after5Min.format(timeFormatterHH);
		germanyTimeAfter5MinMM = after5Min.format(timeFormatterMM);
		
		// Time after 7 minutes
		ZonedDateTime after7Min = nowGermany.plusMinutes(7);
		germanyTimeAfter7MinHH = after7Min.format(timeFormatterHH);
		germanyTimeAfter7MinMM = after7Min.format(timeFormatterMM);
		
		
		// Time after 9 minutes
		ZonedDateTime after9Min = nowGermany.plusMinutes(9);
		germanyTimeAfter9MinHH = after9Min.format(timeFormatterHH);
		germanyTimeAfter9MinMM = after9Min.format(timeFormatterMM);
		
		// Time after 11 minutes
				ZonedDateTime after11Min = nowGermany.plusMinutes(11);
				germanyTimeAfter11MinHH = after11Min.format(timeFormatterHH);
				germanyTimeAfter11MinMM = after11Min.format(timeFormatterMM);
		

				// Time after 15 minutes
				ZonedDateTime after15Min = nowGermany.plusMinutes(15);
				germanyTimeAfter15MinHH = after15Min.format(timeFormatterHH);
				germanyTimeAfter15MinMM = after15Min.format(timeFormatterMM);
		
				
		// Time after 20 minutes
		ZonedDateTime after20Min = nowGermany.plusMinutes(20);
		germanyTimeAfter20MinHH = after20Min.format(timeFormatterHH);
		germanyTimeAfter20MinMM = after20Min.format(timeFormatterMM);

		// Time after 1 hrs 5 minutes
		ZonedDateTime after1Hrs5Min = nowGermany.plusMinutes(65);
		germanyTimeAfter1Hrs5MinHH = after1Hrs5Min.format(timeFormatterHH);
		germanyTimeAfter1Hrs5MinMM = after1Hrs5Min.format(timeFormatterMM);

		// Time after 1 hrs 20 minutes

		ZonedDateTime after1Hrs20Min = nowGermany.plusMinutes(80);
		germanyTimeAfter1Hrs20MinHH = after1Hrs20Min.format(timeFormatterHH);
		germanyTimeAfter1Hrs20MinMM = after1Hrs20Min.format(timeFormatterMM);
		
	
		LocalDate today = ZonedDateTime.now(ZoneId.of("Europe/Berlin")).toLocalDate();
		DayOfWeek day = today.getDayOfWeek();

		int count = 0;

		for (int i = 1; i <= today.getDayOfMonth(); i++) {
		    if (today.withDayOfMonth(i).getDayOfWeek() == day) {
		        count++;
		    }
		} 

		String[] words = {"", "First", "Second", "Third", "Fourth", "Fifth"};

		int occurrenceCount = count;
		 dayCount = words[count];

		  dayName = day.toString().substring(0, 1) +
		                 day.toString().substring(1).toLowerCase();

		// Month count
		 monthCount = today.getMonthValue();

//		System.out.println("Month Count: " + monthCount);   // June=6, July=7
//		System.out.println("Day Count: " + dayCount);
//		System.out.println("Day Name: " + dayName);
	     
		 DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");

	        String date = LocalDate.now().format(dateFormatter2);

	        germanyTodaysDate2=date;
	        
	        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		

	        germanyTodaysDate3=nowGermany.format(dateFormatter3);
	        
	        DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			

	        germanyTodaysDate3=nowGermany.format(dateFormatter3);
	        germanyTodaysDate4=nowGermany.format(dateFormatter4);
	        
//	        System.out.println(germanyTodaysDate3);
//	        System.out.println(germanyTodaysDate4);

	}

}
