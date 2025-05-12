package function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
	String St1N;
	String St2N;
	String St1V1;
	String St1V2;
	String St2V1;
	String st01A1;
	String st01R1;
	String st01R2;
	String st01FF1;
	String st02FF1;
	String st02A1;
	String st01REsc;
	String st02REsc;
	String st2t1;
	
	public void getDetailsFromUser()
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
		scriptPsaaword = scanner.nextLine();

		if (branchName != null && !branchName.isEmpty() && scriptPsaaword != null) {

			if (scriptPsaaword.equals("123456")) {
				System.out.println("*****entered password is correct*****");
			} else {
				
				System.out.println("The Selenium script cannot continue because your password is incorrect.");

				System.exit(0);

			}
		
		
		
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
		
		File src = new File(".\\DataFiles\\DetailsFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		if (branchName.equals("1"))
		{
			
			Reporter.log("Well come to RETTERAlarm Live branch",true);
			url = sheet.getRow(1).getCell(1).getStringCellValue();
			driver.get(url);
			
			url = sheet.getRow(1).getCell(1).getStringCellValue();
			driver.get(url);
			userName = sheet.getRow(2).getCell(1).getStringCellValue();
			password = "123456";
			deptN = sheet.getRow(4).getCell(1).getStringCellValue();
			St1N  = sheet.getRow(5).getCell(1).getStringCellValue();
			St2N = sheet.getRow(6).getCell(1).getStringCellValue();
			St1V1 = sheet.getRow(7).getCell(1).getStringCellValue();
			St1V2 = sheet.getRow(8).getCell(1).getStringCellValue();
			st01A1 = sheet.getRow(9).getCell(1).getStringCellValue();
			st01R1 = sheet.getRow(10).getCell(1).getStringCellValue();
			st01R2 = sheet.getRow(11).getCell(1).getStringCellValue();
			st01FF1 = sheet.getRow(12).getCell(1).getStringCellValue();
			st02FF1 = sheet.getRow(13).getCell(1).getStringCellValue();
			St2V1 = sheet.getRow(14).getCell(1).getStringCellValue();
			st02A1 = sheet.getRow(15).getCell(1).getStringCellValue();
			st01REsc =  sheet.getRow(16).getCell(1).getStringCellValue();
			st02REsc = sheet.getRow(17).getCell(1).getStringCellValue();
			st2t1 = sheet.getRow(18).getCell(1).getStringCellValue();
			

			
		}
		
		else if (branchName.equals("2"))
		{
			Reporter.log("Well come to RETTERAlarm Testing branch",true);
			url = sheet.getRow(1).getCell(2).getStringCellValue();
			driver.get(url);
			userName = sheet.getRow(2).getCell(2).getStringCellValue();
			password = "Qwerty@123";
			St1N  = sheet.getRow(5).getCell(2).getStringCellValue();
			St2N = sheet.getRow(6).getCell(2).getStringCellValue();
			St1V1 = sheet.getRow(7).getCell(2).getStringCellValue();
			St1V2 = sheet.getRow(8).getCell(2).getStringCellValue();
			st01A1 = sheet.getRow(9).getCell(2).getStringCellValue();
			st01R1 = sheet.getRow(10).getCell(2).getStringCellValue();
			st01R2 = sheet.getRow(11).getCell(2).getStringCellValue();
			st01FF1 = sheet.getRow(12).getCell(2).getStringCellValue();
			st02FF1 = sheet.getRow(13).getCell(2).getStringCellValue();
			St2V1 = sheet.getRow(14).getCell(2).getStringCellValue();
			st02A1 = sheet.getRow(15).getCell(2).getStringCellValue();
			st01REsc =  sheet.getRow(16).getCell(2).getStringCellValue();
			st02REsc = sheet.getRow(17).getCell(2).getStringCellValue();
			st2t1 = sheet.getRow(18).getCell(2).getStringCellValue();
			
		}
		
		else if (branchName.equals("3"))
		{
			Reporter.log("Well come to RETTERAlarm Development branch",true);
			url = sheet.getRow(1).getCell(3).getStringCellValue();
			driver.get(url);
			userName = sheet.getRow(2).getCell(3).getStringCellValue();
			password = "Qwerty@123";
			
			
			
		}
		
	
		
	}

}
