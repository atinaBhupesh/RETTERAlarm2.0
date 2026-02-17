package function;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportsManagers {

	private static ExtentReports extents;
	private static ExtentTest test;

	public static ExtentReports getReportInstance() {
		if (extents == null) {
			String timeStamp = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
			String reportPath = "reports/ExtentReports_" + timeStamp + ".html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setDocumentTitle("automation test report");
			reporter.config().setReportName("Test Execution Report");
			extents = new ExtentReports();
			extents.attachReporter(reporter);

		}
		return extents;
	}

	public static ExtentTest createTest(String testName) {

		test = getReportInstance().createTest(testName);
		return test;
	}

}
