package function;

import java.time.DayOfWeek;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class E_timeClass extends b_baseClass {

//	String todaysDate;
	String todaysDate;// (dd.mmd.yyyy)
	String todaysDateddmmyy;
	String todaysDateD;
	String todaysDate1;// (dd/mm/yyyy)
	String tomorrowDate;
	String currentTimeHHMMSS;
	String currentTimeHHMMSSG;
	String dayName;
	String dayCount;
	int monthCount;
	
	String todaysDayG;
	String tomorrowDayG;
	String dayAfterFourDaysG;

	String timeAfter5MinHH;
	String timeAfter5MinMM;
	
	String timeAfter5MinHHG;
	String timeAfter5MinMMG;

	String timeAfter7MinHH;
	String timeAfter7MinMM;
	
	String timeAfter7MinHHG;
	String timeAfter7MinMMG;

	String timeAfter9MinHH;
	String timeAfter9MinMM;
	
	String timeAfter9MinHHG;
	String timeAfter9MinMMG;

	String timeAfter11MinHH;
	String timeAfter11MinMM;

	String timeAfter15MinHH;
	String timeAfter15MinMM;

	String timeAfter20MinHH;
	String timeAfter20MinMM;
	String timeAfter1Hrs5MinHH;
	String timeAfter1Hrs5MinMM;
	String timeAfter1Hrs20MinHH;
	String timeAfter1Hrs20MinMM;

	public void catchDateTime(WebDriver driver) {

//		ZoneId timeZone = ZoneId.of("Europe/Berlin");
		ZoneId timeZone = ZoneId.of("Asia/Kolkata");
		
		ZoneId timeZoneG = ZoneId.of("Europe/Berlin");

		ZonedDateTime now = ZonedDateTime.now(timeZone);
		ZonedDateTime nowG = ZonedDateTime.now(timeZoneG);

		// Formatters
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter dateFormatterddmmyy = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		DateTimeFormatter timeFormatterHHMMSS = DateTimeFormatter.ofPattern("HHmmss");
		DateTimeFormatter timeFormatterHH = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter timeFormatterMM = DateTimeFormatter.ofPattern("mm");
		
		
		

		// Current date & time
		todaysDate = now.format(dateFormatter);
		todaysDateddmmyy = now.format(dateFormatterddmmyy);
		currentTimeHHMMSS = now.format(timeFormatterHHMMSS);
		
		currentTimeHHMMSSG= nowG.format(timeFormatterHHMMSS);

		// Tomorrow date
		LocalDate tomorrowDate1 = now.toLocalDate().plusDays(1);
		tomorrowDate = tomorrowDate1.format(dateFormatter);

		// Time after 5 minutes
		ZonedDateTime after5Min = now.plusMinutes(5);
		timeAfter5MinHH = after5Min.format(timeFormatterHH);
		timeAfter5MinMM = after5Min.format(timeFormatterMM);
		
		
		// Time after 7 minutes-Germany
		ZonedDateTime after5MinG = nowG.plusMinutes(5);
		timeAfter5MinHHG = after5MinG.format(timeFormatterHH);
		timeAfter5MinMMG = after5MinG.format(timeFormatterMM);

		// Time after 7 minutes
		ZonedDateTime after7Min = now.plusMinutes(7);
		timeAfter7MinHH = after7Min.format(timeFormatterHH);
		timeAfter7MinMM = after7Min.format(timeFormatterMM);
		
		// Time after 7 minutes-Germany
		ZonedDateTime after7MinG = nowG.plusMinutes(7);
		timeAfter7MinHHG = after7MinG.format(timeFormatterHH);
		timeAfter7MinMMG = after7MinG.format(timeFormatterMM);
		
		// Time after 9 minutes
		ZonedDateTime after9Min = now.plusMinutes(9);
		timeAfter9MinHH = after9Min.format(timeFormatterHH);
		timeAfter9MinMM = after9Min.format(timeFormatterMM);
		
		
		// Time after 7 minutes-Germany
		ZonedDateTime after9MinG = nowG.plusMinutes(9);
		timeAfter9MinHHG = after9MinG.format(timeFormatterHH);
		timeAfter9MinMMG = after9MinG.format(timeFormatterMM);
		

		// Time after 11 minutes
		ZonedDateTime after11Min = now.plusMinutes(11);
		timeAfter11MinHH = after11Min.format(timeFormatterHH);
		timeAfter11MinMM = after11Min.format(timeFormatterMM);

		// Time after 15 minutes
		ZonedDateTime after15Min = now.plusMinutes(15);
		timeAfter15MinHH = after15Min.format(timeFormatterHH);
		timeAfter15MinMM = after15Min.format(timeFormatterMM);

		// Time after 20 minutes
		ZonedDateTime after20Min = now.plusMinutes(20);
		timeAfter20MinHH = after20Min.format(timeFormatterHH);
		timeAfter20MinMM = after20Min.format(timeFormatterMM);

		// Time after 1 hour 5 minutes
		ZonedDateTime after1Hrs5Min = now.plusMinutes(65);
		timeAfter1Hrs5MinHH = after1Hrs5Min.format(timeFormatterHH);
		timeAfter1Hrs5MinMM = after1Hrs5Min.format(timeFormatterMM);

		// Time after 1 hour 20 minutes
		ZonedDateTime after1Hrs20Min = now.plusMinutes(80);
		timeAfter1Hrs20MinHH = after1Hrs20Min.format(timeFormatterHH);
		timeAfter1Hrs20MinMM = after1Hrs20Min.format(timeFormatterMM);

		
		
		
		
		
		
		
		
		
		// Today's day and occurrence
		LocalDate today = now.toLocalDate();
		DayOfWeek day = today.getDayOfWeek();
		
		LocalDate todayG = nowG.toLocalDate();
		DayOfWeek dayG = todayG.getDayOfWeek();

		
		todaysDayG = dayG.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault());
//		System.out.println(todaysDayG);
		
		LocalDate dateAfterTwoDays = todayG.plusDays(2);
		LocalDate dateAfterFourDays = todayG.plusDays(4);

		// Get the day of the week for the date after two days
		DayOfWeek dayOfWeekAfterTwoDays = dateAfterTwoDays.getDayOfWeek();
		DayOfWeek dayOfWeekAfterForeDays = dateAfterFourDays.getDayOfWeek();

		// Format the date and day of the week using DateTimeFormatter

		tomorrowDayG = dayOfWeekAfterTwoDays.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());

		dayAfterFourDaysG = dayOfWeekAfterForeDays.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());

		
		
		
		

		int count = 0;

		for (int i = 1; i <= today.getDayOfMonth(); i++) {
		    if (today.withDayOfMonth(i).getDayOfWeek() == day) {
		        count++;
		    }
		}

		String[] words = { "", "First", "Second", "Third", "Fourth", "Fifth" };

		int occurrenceCount = count;
		dayCount = words[count];

		dayName = day.toString().substring(0, 1)
		        + day.toString().substring(1).toLowerCase();

		// Month count
		monthCount = today.getMonthValue();

		DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
		String date = today.format(dateFormatter2);
		todaysDateD = date;

		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		todaysDate1 = now.format(dateFormatter1);



	}

}
