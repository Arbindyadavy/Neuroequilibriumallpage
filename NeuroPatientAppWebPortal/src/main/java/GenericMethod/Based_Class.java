package GenericMethod;


import java.util.Properties;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Based_Class {

	protected WebGenericMethod weUtil = WebGenericMethod.getObject();

	@BeforeSuite
	public void tcOpenApplicationOfNeuru() {

		System.out.println("www.com Neuro application start of all test Screapt");   
		weUtil.generateHTMLReport("Tested Result/ExtenthtmlResult.PNG"+ new SimpleDateFormat("dd-MM-yyyy__hh-mm-ss").format(new Date()));
		
	
	
	} 
 
	
	@BeforeClass
	public void LanchingMethod() {

		weUtil.launchbrowser("chrome");
		Properties prop = weUtil.getConfig();
		String urlValue = prop.getProperty("url");
		weUtil.openUrl(urlValue);
		// '''''''''weUtil.openUrl("https://vertigo.neuroequilibrium.in/index.jsp");
	}
 
	@BeforeMethod
	public void tcLoginPage( Method method1) {
		String tcname = method1.getName();
		weUtil.setLogger(tcname);
	
		
   
	}

	@AfterMethod
	public void tcLogOut(ITestResult result, Method method) {

		int status = result.getStatus();

		if (status == ITestResult.FAILURE) {
			String TcName = method.getName();
			String imgPath = weUtil.ForTakeSnapShots(TcName);
			weUtil.attachSnapshottoExtentReport(imgPath);

		}
		weUtil.flushReport();

	}

	@AfterSuite
	public void TCCclose() {
		System.out.println("Our TestCase Run Successfully");

	}
}
