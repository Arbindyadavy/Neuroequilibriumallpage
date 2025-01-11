package GenericMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebGenericMethod {

	private WebDriver driver;
	private Properties prop;
	
	private static WebGenericMethod we;
	
	private ExtentReports extreportobj;
	private ExtentTest extnlog;
	private Workbook workbook;
	private Sheet sheetObj;

	public WebDriver getDriver() {

		return driver;
	}

	public Properties getConfig() { 
		return prop;

	} 

	public WebGenericMethod() { 
		loadConfiguration();
	}

	public void loadConfiguration() {

		prop = new Properties();
		File fileObj = new File("config.properties");
		String fullFilePath = fileObj.getAbsolutePath();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\NEUROEQUILIBRIUM\\eclipse-workspace\\NeuroPatientAppWebPortal\\src\\test\\resources\\config.properties");
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getText(WebElement we) {

		String getvalue = we.getText();
		return getvalue;

	}

	public static WebGenericMethod getObject() {
		if (we == null) {
			we = new WebGenericMethod();
		} 

		return we;
	}

	public void launchbrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 // 
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option); 
			//WebDriverManager.chromedriver().clearDriverCache().setup();
			driver.manage().window().maximize();
			WebDriverWait newWait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
			//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			

		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Assert.assertEquals("hello", "Cuyggi");
			
		}  
	}

	public void ThreadSleep(long Duration) {

		try {
			Thread.sleep(Duration);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public void inputData(WebElement weEle, String inputValue, String msg) {

		try {
			weEle.sendKeys(inputValue);
			extnlog.log(Status.PASS,msg);
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
 
	}

	public void ClickMethod(WebElement weEle, String msg) {
		try {
			weEle.click();
		extnlog.log(Status.PASS, msg);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void openUrl(String Url) {
		try {
			driver.get(Url);
			extnlog.log(Status.INFO, Url + "url opened Successfully");
		} catch (Exception e) {
			// extnlog.log(Status.INFO, Url+"url does't open Successfully");
//
		}
	}

	public void quiteMethod() {
		driver.quit();
		;

	}

	public void CloseBrowser() {

		driver.close();

	}

	public void clear(WebElement we) {
		we.clear();
	}

	public String getTimeStamp() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy  hh_ss_a");
		String time = sdf.format(new Date());
		return time;

	}

	public void selectByindex(WebElement xpath, int i,String msg) {
		try {
			Select ss = new Select(xpath);
			ss.selectByIndex(i);
		} catch (NoSuchElementException e) {

		}
	}

	public void selectByvisibleText(WebElement wel, String value) {
		try {
			Select ss = new Select(wel);
			ss.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
		}
	}

	public void selectByvalue(WebElement we, String value) {
		try {
			Select ss = new Select(we);
			ss.selectByValue(value);
		} catch (NoSuchElementException e) {
		}
	}

	public void doubleClick(WebElement weEle) {

		try {
			Actions actobj = new Actions(driver);
			actobj.doubleClick().build().perform();
			;
		} catch (StaleElementReferenceException e) {

			Actions actobj = new Actions(driver);
			actobj.doubleClick();
		} catch (ElementNotInteractableException e) {

		}

	}

	public void getAttributeValue(WebElement weEle, String AttributeName,String ExpectedValue) {
     String actualAttribute=weEle.getAttribute(AttributeName);
     
		if(actualAttribute.equalsIgnoreCase(AttributeName)) {
			
			System.out.println("Passed! the Actual  :- " + AttributeName + "and expeceted  :-" + ExpectedValue );
			
		}else {
			
			System.out.println("Failed! the Actual :- " + AttributeName + "and expeceted  :-" + ExpectedValue );
		}
			

		}
	
	
	
	public void Action(WebElement weEle) {

		try {
			Actions actobj = new Actions(driver);
			actobj.moveToElement(weEle).build().perform();
			;
		} catch (StaleElementReferenceException e) {

			Actions actobj = new Actions(driver);
			actobj.moveToElement(weEle).build().perform();
		} catch (ElementNotInteractableException e) {

		}

	}

	public void ActionClick(WebElement weEle) {
		try {
			Actions actobj = new Actions(driver);
			actobj.click().build().perform();
		} catch (StaleElementReferenceException e) {

		
		   }

	   }

	public void acceptAllert() {

		try {
			Alert alertmethod = driver.switchTo().alert();

			alertmethod.accept();

		} catch (NoAlertPresentException e) {

		}

	}

	public void Dismiss(String xpath) {

		try {
			Alert alertmethod = driver.switchTo().alert();
			alertmethod.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		} catch (java.util.NoSuchElementException e) {

		}
	}

	public void switchToWindowByUrl(String acTitle) {
		Set<String> setWindows = driver.getWindowHandles();
		Iterator<String> itr = setWindows.iterator();
		while (itr.hasNext() == true) {
			String next = itr.next();
			driver.switchTo().window(next);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase(acTitle)) {
				break;
			}
		}

	}

	public void getTitle(WebElement webEle) {

		try {
			webEle.getText();
		} catch (StaleElementReferenceException e) {
			webEle.getText();
		} catch (NoSuchElementException e) {

			webEle.getText();

		}

	}

	public void writeOneData(String filePath, String sheetName, String value, int rowNum, int cellNum) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}

		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		XSSFSheet sheet;
		XSSFRow row = null;
		if (workbook.getSheet(sheetName) == null) {
			sheet = workbook.createSheet(sheetName);
		} else {
			sheet = workbook.getSheet(sheetName);
		}

		row = sheet.getRow(rowNum);
		if (row == null) {
			row = sheet.createRow(rowNum);
		}

		XSSFCell cell = null;
		// for (int i = 1; i <= 5; i++) {
		cell = row.createCell(cellNum);
		cell.setCellValue(value);

		// }
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getOneDataExcel(String filepath, String sheetName, int Row, int Cell) {
		File file = new File(filepath);
		XSSFWorkbook workbook = null;
		try {
			try {
				workbook = new XSSFWorkbook(file);
			} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
				
				e.printStackTrace();
			}
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(Row);
		XSSFCell cell = row.getCell(Cell, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		String value = cell.getStringCellValue();
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public void actionsDragNDrop(WebElement webEle, WebElement wel) {
		Actions actobj = new Actions(driver);
		try {
			actobj.dragAndDrop(webEle, wel).build().perform();
		} catch (StaleElementReferenceException e) {
	
		}
	}

	public void back() {
		driver.navigate().back();
	}

	public void Windowhandle(String gettitleorgetUrl, String msg) {
		Set<String> setwindos = driver.getWindowHandles();
		Iterator<String> iteretor = setwindos.iterator();

		while (iteretor.hasNext()) {
			String aaaa = iteretor.next();
			driver.switchTo().window(aaaa);
			String acttitle_value = driver.getTitle();
			String acturl_value = driver.getCurrentUrl();
			if (acttitle_value.equalsIgnoreCase(gettitleorgetUrl)) {
				break;
			} else if (acturl_value.equalsIgnoreCase(gettitleorgetUrl)) {

			}
		}
	}

	public void Iframe_Frame(String xpath) {
		driver.switchTo().frame(0);
	}

	public void Iframe_DefoultContent(String xpath) {
		driver.switchTo().defaultContent();
	}

	public void Iframe_ParentFrame(String xpath) {
		driver.switchTo().parentFrame();
	}
	
	
	
	public void generateHTMLReport(String resulttestcase) {

		ExtentSparkReporter htmlobj = new ExtentSparkReporter(resulttestcase);
		extreportobj = new ExtentReports();
		extreportobj.attachReporter(htmlobj);

		
	}

	public void setLogger(String testcasename) {

		extnlog = extreportobj.createTest(testcasename);

	}
	
	public void flushReport() {
		extnlog.log(Status.INFO, "Report is Writen in Extent Successfully");
		extreportobj.flush();

	}


	public void attachSnapshottoExtentReport(String imagepath) {

		try {
			extnlog.addScreenCaptureFromPath(imagepath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String ForTakeSnapShots(String SnapShotName) {

		TakesScreenshot snap = (TakesScreenshot) driver;
		File StoreFile = snap.getScreenshotAs(OutputType.FILE);
		String Time = GetDateAndTime();
		File DestinationFile = new File("Tested Result//" + SnapShotName + Time + ".jpeg");
		try {
			Files.copy(StoreFile, DestinationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		extnlog.log(Status.FAIL, "Screen Shot Taken Successfully" + " -" + SnapShotName);
		return DestinationFile.getAbsolutePath();

	}

	public String ForTakeSnapShots1(String SnapShotName) {

		TakesScreenshot snap = (TakesScreenshot) driver;
		byte[] StoreFile = snap.getScreenshotAs(OutputType.BYTES);
		String Time = GetDateAndTime();
		File DestinationFile = new File("Tested Result//" + SnapShotName + Time + ".jpeg");
		try {
			Files.asByteSource(DestinationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		extnlog.log(Status.FAIL, "Screen Shot Taken Successfully" + " -" + SnapShotName);
		return DestinationFile.getAbsolutePath();

	}
	public List<WebElement> GetWebelements(String xpath) {

		List<WebElement> weEle;
		try {
			weEle = driver.findElements(By.xpath(xpath));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			extnlog.log(Status.INFO, "exception occuredn while finding elements" + e);
			weEle = driver.findElements(By.xpath(xpath));
		}
		extnlog.log(Status.INFO, "WebElement Get Successfully");
		return weEle;

	}

	public void JavaScriptClick(WebElement weEle) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", weEle);
		extnlog.log(Status.INFO, "Click By JS Successfully");

	}

	
	public String GetDateAndTime() {

		SimpleDateFormat SimpDate = new SimpleDateFormat("dd-MM-yyyy");
		String Time = SimpDate.format(new Date());
		return Time;

	}

	
	
	
	
	public int getRowCountofTcID(Sheet sheetobj, String testcaseIdName) {
		int activateRowNum = sheetobj.getLastRowNum();
		int count = 0;
		for (int i = 1; i <= activateRowNum; i++) {
			Row rowObj = sheetobj.getRow(i);
			Cell cellObj = rowObj.getCell(1);
			String actualCellvalue = cellObj.getStringCellValue();
			if (actualCellvalue.equals(testcaseIdName)) {
				count++;
			}
		}
		return count;
	}

	public Object[][] readData(String sheetName, String expTestCaseId) {
		File file = new File("C:\\Dashboard_Web\\Neuroeqililbrium.testing\\User_Data.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheetObj = workbook.getSheet(sheetName);
		Object[][] arrObj = new Object[getRowCountofTcID(sheetObj, expTestCaseId)][1];
		int dataCount = 0;
		int rowcount = sheetObj.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			Row rowObj = sheetObj.getRow(i);
			Cell xcellObj = rowObj.getCell(1, MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String actualTcId = xcellObj.getStringCellValue();
			if (expTestCaseId.equalsIgnoreCase(actualTcId)) {
				Map<String, String> dataMap = new HashMap<String, String>();
				int cellCount = rowObj.getLastCellNum();
				for (int j = 2; j <= cellCount; j++) {
					Cell cellDataName = rowObj.getCell(j, MissingCellPolicy.CREATE_NULL_AS_BLANK);
					Cell cellDatavalue = rowObj.getCell(j + 1, MissingCellPolicy.CREATE_NULL_AS_BLANK);
					String dataKey = cellDataName.getStringCellValue();
					String dataValue = cellDatavalue.getStringCellValue();
					dataMap.put(dataKey, dataValue);
				}
				arrObj[dataCount++][0] = dataMap;
			}
		}
		return arrObj;
	}

	public void ScrollDown() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("argument[0].scrollIntoView(true);", we);

	}

	public void Scroll_Down_Method() {

		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement I = driver.findElement(By.linkText("Latest courses"));
		String str = I.getText();
		System.out.println("Text obtained byscrolling down is " + str);
		at.sendKeys(Keys.PAGE_UP).build().perform();

	   }

	public void VerifyString(String actStr, String ExpStr) {

		if (actStr.equalsIgnoreCase(ExpStr)) {

			System.out.println("Passed! the Actual String :- " + actStr + "and expeceted String :-" + ExpStr + "both are ");
			
			System.out.println("Failed! the Actual String :- " + actStr + "and expeceted String :-" + ExpStr + "both are ");		

		}

	}

	public void veryfyInnerText(WebElement we,String ExpectedText ) {
     String ActualText=we.getText();
 
	if(ActualText.equalsIgnoreCase(ExpectedText))	{
		
		System.out.println("Passed! the Actual String :- " + ActualText + "and expeceted String :-" + ExpectedText );
		
	}else {
		
		System.out.println("Failed! the Actual String :- " + ActualText + "and expeceted String :-" + ExpectedText );
	}
		

		
	}
	
	public void fileUploadJavaScript(String Filepath, String UploadValue) {

		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		rb.delay(2000);
		StringSelection ss = new StringSelection(System.getProperty("user.dir") + Filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		extnlog.log(Status.INFO, UploadValue); 

	}
	
	public void fileUploadJavaScript1(String Filepath, String UploadValue) {

		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		rb.delay(2000);
		StringSelection ss = new StringSelection(Filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		extnlog.log(Status.INFO, UploadValue);

	}		

	public String getSaltString() {

		String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVW";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		extnlog.log(Status.INFO, "<font color='black'>Generate Random Name Successfully"+"</font>");
		 extnlog.log(Status.INFO, "Generate Random Name Successfully");
		return saltStr;
	}

















}
