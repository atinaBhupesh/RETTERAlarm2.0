package function;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class b_baseClass {
	
	String branchName;
	String browserName;
	String scriptPsaaword;
	
	
	WebDriver driver;
	
	String url;
	String userName;
	String password;
	String deptN;
	String st01N;
	String st02N;
	String st01V1;
	String st01V2;
	String st02V1;
	String st01A1;
	String st01R1;
	String st01R2;
	String st01FF1;
	String st02FF1;
	String st02A1;
	String st01REsc;
	String st02REsc;
	String st02t1;
	String st02R1;
	String NewTemplate;
	String NewResource ;
	String st01FF2;
	String St1V3 ;
	String NewResourceEsc;
	String St01M1;
	String St01M2;
	String St02M1;
	String InfoEventNameForChat;
	String GREEN = "\u2714 ";
	String RED = "\\u2716 ";
	String ManualAlarmNameForChat;
	String oldEscTemplateSt02ToSt01;
	
	
	
	
	String proEnd ="|*******************************************************|";
	
	public void getDetailsFromUser() throws Throwable
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the branch name > for live-1, for Testing-2, for development-3 : ");
		System.out.println();
		branchName= scanner.nextLine();
		
		switch (branchName)
		{
		case "1" :
		{
			
			System.out.println("*****you have selected Live branch *****");
			break;
		}
		
		case "2" :
		{
			System.out.println("*****you have selected Testing branch *****");
			break;
		}
		
		case "3" :
		{
			System.out.println("*****you have selected Development branch *****");
			break;
		}
		 default:
             System.out.println("*****you have not selected proper branch*****");
         
             System.out.println("The Selenium script cannot continue because the branch name was not found.");

				System.exit(0);
		
				 break;
			    
		}
		
		System.out.print("please select browser- 1 for chrome, 2 for edge,3 for firefox : ");
		browserName = scanner.nextLine();
		
		
		switch (browserName)
		{
		case "1" :
		{
			System.out.println("*****you have selected chrome browser*****");
			break;
		}
		
		case "2" :
		{
			System.out.println("*****you have selected edge browser*****");
			break;
		}
		
		case "3" :
		{
			System.out.println("*****you have selected firfox browser*****");
			break;
		}
		
		 default:
             System.out.println("*****you have not selected proper browser*****");
         
             System.out.println("The Selenium script cannot continue because the browser name was not found.");

				System.exit(0);
		
				 break;
			    
		}
		
		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		if (branchName != null && !branchName.isEmpty() && password != null) {

		    if (password.equals("123456")) {
		        System.out.println("***** Entered password is correct *****");
		    } else {
		        // Give second chance
		        System.out.print("Wrong password. Please try again: ");
		        password = scanner.nextLine();

		        if (password.equals("123456")) {
		            System.out.println("***** Entered password is correct *****");
		        } else {
		            System.out.println("The Selenium script cannot continue because your password is incorrect.");
		            System.exit(0);
		        }
		    }

		} else {
		    System.out.println("You did not enter any branch name.");
		    Thread.sleep(2000);
		    System.out.println();
		    System.out.println("The Selenium script cannot continue because the branch name was not found.");
		    System.exit(0);
		}

		
		
	}
	
	
	public void lonchBrowser () throws Throwable
	{
		
		if (browserName.equals("1")) {
			driver = new ChromeDriver();

		}

		else if (browserName.equals("2")) {
			driver = new EdgeDriver();

		}

		else if (browserName.equals("3")) {
			driver = new FirefoxDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		
		  switch (branchName) 
		  {
		  case "1":
			  Reporter.log("Well come to RETTERAlarm Live branch",true);
			  System.out.println("|*******************************************************|");
			  
			  break;
	        case "2":
	        	Reporter.log("Well come to RETTERAlarm Testing branch",true);
	        	System.out.println("|*******************************************************|");
	            break;

	        case "3":
	        	Reporter.log("Well come to RETTERAlarm Development branch",true);
	        	System.out.println("|*******************************************************|");
	            break;

	        default:
	            System.out.println("Invalid branch name: " + branchName);
	            System.out.println("|*******************************************************|");
	            break;
		  }
		
		
	}
	
	public void getDetailsFromFiles () throws Throwable
	{
		
		
		
		
		File src = new File(".\\DataFiles\\DetailsFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		switch (branchName) {

		case "1":
		    url = sheet.getRow(1).getCell(1).getStringCellValue();
		    driver.get(url);

		    userName = sheet.getRow(2).getCell(1).getStringCellValue();
		    password = "123456";
		    deptN = sheet.getRow(4).getCell(1).getStringCellValue();
		    st01N  = sheet.getRow(5).getCell(1).getStringCellValue();
		    st02N = sheet.getRow(6).getCell(1).getStringCellValue();
		    st01V1 = sheet.getRow(7).getCell(1).getStringCellValue();
		    st01V2 = sheet.getRow(8).getCell(1).getStringCellValue();
		    st01A1 = sheet.getRow(9).getCell(1).getStringCellValue();
		    st01R1 = sheet.getRow(10).getCell(1).getStringCellValue();
		    st01R2 = sheet.getRow(11).getCell(1).getStringCellValue();
		    st01FF1 = sheet.getRow(12).getCell(1).getStringCellValue();
		    st02FF1 = sheet.getRow(13).getCell(1).getStringCellValue();
		    st02V1 = sheet.getRow(14).getCell(1).getStringCellValue();
		    st02A1 = sheet.getRow(15).getCell(1).getStringCellValue();
		    st01REsc = sheet.getRow(16).getCell(1).getStringCellValue();
		    st02REsc = sheet.getRow(17).getCell(1).getStringCellValue();
		    st02t1 = sheet.getRow(18).getCell(1).getStringCellValue();
		    st02R1 = sheet.getRow(19).getCell(1).getStringCellValue();
		    NewTemplate = sheet.getRow(20).getCell(1).getStringCellValue();
		    NewResource  = sheet.getRow(21).getCell(1).getStringCellValue();
		    st01FF2 = sheet.getRow(22).getCell(1).getStringCellValue();
		    St1V3 = sheet.getRow(23).getCell(1).getStringCellValue();
		    NewResourceEsc = sheet.getRow(24).getCell(1).getStringCellValue();
		    St01M1 = sheet.getRow(25).getCell(1).getStringCellValue();
		    St01M2 = sheet.getRow(26).getCell(1).getStringCellValue();
		    St02M1 = sheet.getRow(27).getCell(1).getStringCellValue();
		    InfoEventNameForChat = sheet.getRow(28).getCell(1).getStringCellValue();
		    ManualAlarmNameForChat= sheet.getRow(29).getCell(1).getStringCellValue();
		    oldEscTemplateSt02ToSt01  = sheet.getRow(30).getCell(1).getStringCellValue();
		    
		    
		    break;

		case "2":
		    url = sheet.getRow(1).getCell(2).getStringCellValue();
		    driver.get(url);

		    userName = sheet.getRow(2).getCell(2).getStringCellValue();
		    password = "Qwerty@123";
		    st01N  = sheet.getRow(5).getCell(2).getStringCellValue();
		    st02N = sheet.getRow(6).getCell(2).getStringCellValue();
		    st01V1 = sheet.getRow(7).getCell(2).getStringCellValue();
		    st01V2 = sheet.getRow(8).getCell(2).getStringCellValue();
		    st01A1 = sheet.getRow(9).getCell(2).getStringCellValue();
		    st01R1 = sheet.getRow(10).getCell(2).getStringCellValue();
		    st01R2 = sheet.getRow(11).getCell(2).getStringCellValue();
		    st01FF1 = sheet.getRow(12).getCell(2).getStringCellValue();
		    st02FF1 = sheet.getRow(13).getCell(2).getStringCellValue();
		    st02V1 = sheet.getRow(14).getCell(2).getStringCellValue();
		    st02A1 = sheet.getRow(15).getCell(2).getStringCellValue();
		    st01REsc = sheet.getRow(16).getCell(2).getStringCellValue();
		    st02REsc = sheet.getRow(17).getCell(2).getStringCellValue();
		    st02t1 = sheet.getRow(18).getCell(2).getStringCellValue();
		    st02R1 = sheet.getRow(19).getCell(2).getStringCellValue();
		    NewTemplate = sheet.getRow(20).getCell(2).getStringCellValue();
		    NewResource  = sheet.getRow(21).getCell(2).getStringCellValue();
		    st01FF2 = sheet.getRow(22).getCell(2).getStringCellValue();
		    St1V3 = sheet.getRow(23).getCell(2).getStringCellValue();
		    NewResourceEsc = sheet.getRow(24).getCell(2).getStringCellValue();
		    St01M1 = sheet.getRow(25).getCell(2).getStringCellValue();
		    St01M2 = sheet.getRow(26).getCell(2).getStringCellValue();
		    break;

		case "3":
		    url = sheet.getRow(1).getCell(3).getStringCellValue();
		    driver.get(url);

		    userName = sheet.getRow(2).getCell(3).getStringCellValue();
		    password = "Qwerty@123";
		    break;

		default:
		    System.out.println("\u001B[31m✖ Invalid branch selected\u001B[0m");
		}
		
		
		
	
		
	}
	
	


}
