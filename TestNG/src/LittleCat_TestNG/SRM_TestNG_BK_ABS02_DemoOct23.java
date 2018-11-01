package LittleCat_TestNG;

// Org_Begin
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.internal.Utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 

import org.apache.commons.io.FileUtils;  //  need to get  commonsIO 

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
//Org_End

//From Browser _Begin
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.AssertJUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerOptions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
//From Browser _End


public class SRM_TestNG_BK_ABS02_DemoOct23 extends LC_Abstracts {

	WebDriver driver;
	
	
	String baseGoogle = "http://www.google.ca";
	String baseUK = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
	String baseURL_IE = "http://vstbxv1dev-3:8080/toolbox_test";
	String baseURL_LC = "http://localhost:8081/ToolboxRemote.html";// 
	String baseURL_Test = "https://www.seleniumeasy.com/test/";  // https://www.seleniumeasy.com/test/
	String driverPath_Firefox = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\geckodriver64.exe";
	String driverPath_Chrome = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\chromedriver.exe";
	String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-32.exe";
	//String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-64.exe";
	
	public static final String PATH_SCREENSHOTS_2 = "E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots";
	public static final String PATH_SCREENSHOTS = "E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots\\oct_srh.png";
 
	
	// public static WebDriver driver;
	
	/*
	// To create reference of TakesScreenshot
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			// Call method to capture screenshot
			File src=screenshot.getScreenshotAs(OutputType.FILE);
	
	*/  
	
	
	
	
	/*
	private static void waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} // End of private static void waiting	
	
	*/
	
	@BeforeMethod
	public void test_before()throws Exception{
		// WebDriver driver;	
		
		System.setProperty("webdriver.gecko.driver",driverPath_Firefox);  //System.setProperty("webdriver.chrome.driver",driverPath_Chrome);
		driver = new FirefoxDriver();    // driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL_LC);              //driver.get(baseURL_LC);// driver.get(baseGoogle); // driver.get(baseUK);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
	} // End of test_before
	
	
	
	 @Test(priority = 1, enabled = false)
	 public void doLogin()
	 {
	     //do some stuff to trigger a login
	     //  assertEquals("My Logged In Page", driver.getTitle());
		 //AssertJUnit.assertEquals(driver.getTitle(),"Selenium Easy - Best Demo website to practice Selenium Webdriver Online");
		 
		
		//driver.navigate().to(baseURL_LC);  //driver.navigate().to("http://seleniumsimplified.com");
		
		//boolean bbbc = driver.getTitle().startsWith("Selenium Simplified - Automated Browser Testing");		
		String bbbd = driver.getTitle();  System.out.println(bbbd);
		
		waiting(1000);
	
		String agreementHeading = driver.findElement(By.className("tb-license-heading")).getText();
		System.out.println("Heading: "+  agreementHeading );  
						
		
		String agreementTEXT = driver.findElement(By.className("tb-agreementText")).getText();   // tb-agreementText
		//  stop printing agreement    System.out.println("Heading: "+  agreementTEXT );
		this.waiting(1500); 			//	driver.findElement(By.className("tb-agreementText")).click();
		
		
		String agreementClearfix = driver.findElement(By.className("modal-footer-custom")).getText();   // tb-agreementText
		System.out.println("Accept Text : " +  agreementClearfix );   //driver.findElement(By.className("modal-footer-custom")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("tb_accpt_lic_agrmnt_txt")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Continue')]")).click();
		
		
	 }  // End of doLogin
	
	
	
	@Test(priority = 2, enabled = false)
	public void Select_Airplane (String plane_Identifier) {
		
		
		String SelectPlane = driver.findElement(By.className("ng-scope")).getText(); 
		//	System.out.println("Select an Airplane : " + SelectPlane ); 
			// driver.findElement(By.className("ng-scope")).click();   // msn = 30830
			
			// Above click the SRM on left pane to bring up SRM
			// driver.findElement(By.xpath("//input[@placeholder='Enter airplane search criteria']")).sendKeys("30830"); // Enter msn to text box
		driver.findElement(By.xpath("//input[@placeholder='Enter airplane search criteria']")).sendKeys(plane_Identifier); // Enter msn to text box
			driver.findElement(By.xpath("//b[@class='ng-binding ng-scope']")).click();;  // Click the airplane in list box
			// driver.findElement(By.xpath("//div[@class='book-container root-selected']//div[@id='book-name']")).click();;  // Click SRM located under Table of Contents
			//driver.findElement(By.xpath("div[@class='book ng-scope']")).click();
		
	} // End of Select_Airplane
	
	
	@Test(priority = 1, enabled = true)
	public void Agreement_click_Test () {
		System.out.println("Agreement_click_Test calls EULA");	
		this.doLogin();           //doLogin_1(driver);
		
		// Select_Airplane_Test("30830");
		
	} // End of Test_click_Agreement
	
	 
	@Test(priority = 2, enabled = true)
	public void Select_Airplane_Test () {
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		
		this.Select_Airplane("30830");
		JOptionPane.showMessageDialog(null, "End of Select_Airplane_Test");
	}//End of Select_Airplane_Test
	
	
	
	@Test(priority = 3, enabled = true)   // @Ignore
	public void Select_SRM_Test () {  // Select_SRM_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830");
		// this.Select_SRM_Method();
		this.select_Doc_Type_Method ("SRM");
		JOptionPane.showMessageDialog(null, "End of Select_SRM_Test");
	}  //End of Select_SRM_Test
	
	
	@Test(priority = 4, enabled = true)
	public void Select_SWPM_Test () {  // Select_SWPM_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830");
		// this.Select_SRM_Method();
		this.select_Doc_Type_Method ("SWPM");
		JOptionPane.showMessageDialog(null, "End of Select_SWPM_Test");
	}  //End of Select_SWPM_Test
	
	
	@Test(priority = 5, enabled = true)
	public void Select_Airline_Doc_Test () {  // Airline_Doc_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830");
		System.out.println("***************************Calling open Airline_Doc_Test ******************** test");
		// this.Select_SRM_Method();
		this.select_Doc_Type_Method ("AD");
		
		JOptionPane.showMessageDialog(null, "End of Select_AD_Test");
		
	}  //End of Select_AD_Test
	
	
	
	
	
	@Test(priority = 6, enabled = true)
	public void Searching_Test () throws IOException {  // Select_SRM_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830");
		// System.out.println("***************************Calling open SRM ******************** test");
		this.Select_SRM_Method();
		System.out.println("***************************Calling search ******************** test");
		this.Searching_Method("door");  
		// Chem-Milled
		
		waiting (3000);
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshotFile, new File(PATH_SCREENSHOTS + "\\oct_srh.png"));
		FileUtils.copyFile(screenshotFile, new File(PATH_SCREENSHOTS));
		// FileUtils.copyFile(screenshotFile, new File("E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots\\oct_srh.png"));
		//driver.close(); PATH_SCREENSHOTS
		
		JOptionPane.showMessageDialog(null, "End of Searching_Test");
		
	}  //Searching_Test
	
	
	
	@Test(priority = 8, enabled = true)
	public void Select_Result_Type_Test() throws IOException {  // AR or OEM  
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830");
		// System.out.println("***************************Calling open SRM ******************** test");
		this.Select_SRM_Method();
		System.out.println("***************************Calling search ******************** test");
		this.Searching_Method("Chem-Milled");  //span[@id='span_Revision Type_AR']   //this.Searching_Method("AR");
		
		String revision_Type_XPATH = this.select_result_type("AR");  //span[@id='span_Revision Type_AR']   //this.Searching_Method("AR");

		waiting (1000);         ///waiting (3000);
		
		driver.findElement(By.xpath("//div[@id='tb_facetWrapper']")).click();
		
		driver.findElement(By.xpath("//ul[@id='Revision Type']//li[1]//label[1]"));
		
		driver.findElement(By.xpath("//b[contains(text(),'Revision Type')]"));  
		
		// driver.findElement(By.xpath("//span[@id='span_Revision Type_AR']")).click();
		driver.findElement(By.xpath(revision_Type_XPATH)).click();
		driver.findElement(By.xpath("//span[@bo-text='result.referenceTitle']")).click();
		
		
		
		/*
		try {
			driver.findElement(By.cssSelector("#span_Revision Type_AR")).click();
		}
			catch (org.openqa.selenium.NoSuchElementException e) 
			{
				driver.findElement(By.xpath(revision_Type_XPATH)).click();
			}
		driver.findElement(By.xpath("//span[@bo-text='result.referenceTitle']")).click();
		*/
		
		
		
		/*
		
		//https://www.softwaretestingmaterial.com/capture-screenshot-of-failed-test-cases-using-selenium-webdriver-2/
		// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
		// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
		// Copy files to specific location 
		// result.getName() will return name of test case so that screenshot name will be same as test case name
		FileUtils.copyFile(src, new File("E:\\oct.png"));
		*/
		/*
		waiting (5000);       System.out.println("ready to print--- " + PATH_SCREENSHOTS + "\\oct_AR.png");
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots\\oct_AR.png"));
		FileUtils.copyFile(screenshotFile, new File(PATH_SCREENSHOTS + "\\oct_AR.png"));
		//driver.close();
		*/
		JOptionPane.showMessageDialog(null, "End of search_Result_Type_JAVA_Abstracts");
		
		
	}  //Searching_Test
	
	//span[@bo-text='result.referenceTitle']
	
	
	@Test(priority = 7, enabled = true, expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
	public void Error_Test() throws IOException {  // AR or OEM  
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830");
		// System.out.println("***************************Calling open SRM ******************** test");
		this.Select_SRM_Method();
		System.out.println("***************************Calling search ******************** test");
		this.Searching_Method("Chem-Milled");  //span[@id='span_Revision Type_AR']   //this.Searching_Method("AR");
		
		String revision_Type_XPATH = this.select_result_type("AR");  //span[@id='span_Revision Type_AR']   //this.Searching_Method("AR");

		waiting (1000);         ///waiting (3000);
		
		driver.findElement(By.xpath("//div[@id='tb_facetWrapper']")).click();
		
		driver.findElement(By.xpath("//ul[@id='Revision Type']//li[1]//label[1]"));
		
		driver.findElement(By.xpath("//b[contains(text(),'Revision Type')]"));  
		
		// driver.findElement(By.xpath("//span[@id='span_Revision Type_AR']")).click();
		driver.findElement(By.xpath(revision_Type_XPATH)).click();
		
		JOptionPane.showMessageDialog(null, "org.openqa.selenium.NoSuchElementException will be caughted in 30 seconds.... :-( ");
		
		// driver.findElement(By.xpath("//span[@bo-text='result.referenceTitle']")).click();
		driver.findElement(By.cssSelector("#span_Revision Type_AR")).click();
		
		
		
	} // End of Error Test
	
	@Ignore
	public void Searching_Method (String keyword_Search){
		String srh_element = driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).getText();
		System.out.println("going to search line # 120 === " + srh_element);
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).click();
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys(keyword_Search+Keys.ENTER);  //driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys("AR"+Keys.ENTER);
		
		
	}// End of Searching_Method
	
	
	
	
	@Ignore
	public void Select_SRM_Method () {  // Select_SRM_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		
		// String LC_Heading = driver.findElement(By.className("container-fluid padd_0")).getText();  // ng-scope
				driver.findElement(By.className("ng-scope")).getText();  // ng-scope
				
				 // driver.findElement(By.className("tb-height-max tb-width-max airplaneNote_position_fixed ng-scope")).getText();
				driver.findElement(By.xpath("//div[@id='viewDiv']")).getText();
				
				
//		      id*** tb_navSidebar -- [ id = //div[@id='tb_tocNav'] and //div[@id='tb_toc_container']    
//				AND   class = tb-fit-toolbar do-not-print ]----------       ng-isolate-scope toc-container -----  book ng-scope
				driver.findElement(By.xpath("//div[@id='tb_navSidebar']")).getText();
				//// System.out.println("//div[@id='tb_navSidebar']   ????? " + LC_Heading );

				driver.findElement(By.xpath("//div[@id='tb_tocNav']")).getText();
				//  System.out.println("//div[@id='tb_tocNav']   ????? " + LC_Heading );
				
				
				String LC_Heading   =  driver.findElement(By.xpath("//div[@id='tb_toc_container']")).getText();
				System.out.println("//div[@id='tb_toc_container']    ????? " + LC_Heading );
				
				
				
				String LC2_Heading   = driver.findElement(By.xpath("//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]")).getText();
				System.out.println("//body[@id='tb_body']/   ????? " + LC2_Heading );  // ????? SRM  --	Structural Repair Manual --		BCG � Rev 52 � 10 Mar 2014 � D634A201 
				
				String srm_XPATH = "//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]";  
				
				driver.findElement(By.xpath(srm_XPATH)).click();
		
		
	}//End of Select_SRM_Method   //End of Select_SRM_Test
	
	@Ignore
	public void select_Doc_Type_Method (String doc_Type) {  // Select_SRM_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		
		// String LC_Heading = driver.findElement(By.className("container-fluid padd_0")).getText();  // ng-scope
				driver.findElement(By.className("ng-scope")).getText();  // ng-scope
				
				 // driver.findElement(By.className("tb-height-max tb-width-max airplaneNote_position_fixed ng-scope")).getText();
				driver.findElement(By.xpath("//div[@id='viewDiv']")).getText();
				
				
//		      id*** tb_navSidebar -- [ id = //div[@id='tb_tocNav'] and //div[@id='tb_toc_container']    
//				AND   class = tb-fit-toolbar do-not-print ]----------       ng-isolate-scope toc-container -----  book ng-scope
				driver.findElement(By.xpath("//div[@id='tb_navSidebar']")).getText();
				//// System.out.println("//div[@id='tb_navSidebar']   ????? " + LC_Heading );

				driver.findElement(By.xpath("//div[@id='tb_tocNav']")).getText();
				//  System.out.println("//div[@id='tb_tocNav']   ????? " + LC_Heading );
				
				
				String LC_Heading   =  driver.findElement(By.xpath("//div[@id='tb_toc_container']")).getText();
				System.out.println("//div[@id='tb_toc_container']    ????? " + LC_Heading );
				
				
				
				String LC2_Heading   = driver.findElement(By.xpath("//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]")).getText();
				System.out.println("//body[@id='tb_body']/   ????? " + LC2_Heading );  // ????? SRM  --	Structural Repair Manual --		BCG � Rev 52 � 10 Mar 2014 � D634A201 
				
				
				String srm_XPATH = "//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]";  
				String swpm_XPATH = "//div[contains(text(),'Standard Wiring Practices Manual')]";
				String ad_XPATH = "//div[contains(text(),'Airline Authored Documents')]";
				
				
				String doc_Type_XPATH ="";
				
				switch(doc_Type){
				case "SRM" : 
					doc_Type_XPATH = srm_XPATH;               
					System.out.println("SRM");break;
				case "SWPM" : 
					doc_Type_XPATH = swpm_XPATH;
					System.out.println("SWPM"); break;
				case "AD" : 
					doc_Type_XPATH = ad_XPATH;
					System.out.println("AD"); break;
				
				} // End of switch(doc_Type)  
				
				
				
				//String srm_XPATH = "//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]";  
				//String swpm_XPATH = "//div[contains(text(),'Standard Wiring Practices Manual')]";
				driver.findElement(By.xpath(doc_Type_XPATH)).click();  // driver.findElement(By.xpath(srm_XPATH)).click();
		
		
	}//End of select_Doc_Type_Method
	
	
	@AfterMethod
	public void endTest(){
		//JOptionPane.showMessageDialog(null, "Browser will be closed");
		driver.close();
	}   
	

		
	
	
	@Ignore	
	@Test(priority = 2, enabled = false)  //  @Test(priority = 1, enabled = true)
	public void LC_test () {      //  public static void main(String[] args) {
		
		
		//driver.navigate().to(baseURL_LC);  //driver.navigate().to("http://seleniumsimplified.com");
		
		//boolean bbbc = driver.getTitle().startsWith("Selenium Simplified - Automated Browser Testing");		
		String bbbd = driver.getTitle();  System.out.println(bbbd);
		
		waiting(1000);
	
		String agreementHeading = driver.findElement(By.className("tb-license-heading")).getText();
		System.out.println("Heading: "+  agreementHeading );  
						
		
		String agreementTEXT = driver.findElement(By.className("tb-agreementText")).getText();   // tb-agreementText
		//  stop printing agreement    System.out.println("Heading: "+  agreementTEXT );
		waiting(1500); 			//	driver.findElement(By.className("tb-agreementText")).click();
		
		
		String agreementClearfix = driver.findElement(By.className("modal-footer-custom")).getText();   // tb-agreementText
		System.out.println("Accept Text : " +  agreementClearfix );   //driver.findElement(By.className("modal-footer-custom")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("tb_accpt_lic_agrmnt_txt")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Continue')]")).click();
		
						
		
		//input[@placeholder='Enter airplane search criteria']
		
			
		
		String SelectPlane = driver.findElement(By.className("ng-scope")).getText(); 
	//	System.out.println("Select an Airplane : " + SelectPlane ); 
		// driver.findElement(By.className("ng-scope")).click();   // msn = 30830
		
		// Above click the SRM on left pane to bring up SRM
		driver.findElement(By.xpath("//input[@placeholder='Enter airplane search criteria']")).sendKeys("30830"); // Enter msn to text box
		driver.findElement(By.xpath("//b[@class='ng-binding ng-scope']")).click();;  // Click the airplane in list box
		// driver.findElement(By.xpath("//div[@class='book-container root-selected']//div[@id='book-name']")).click();;  // Click SRM located under Table of Contents
		//driver.findElement(By.xpath("div[@class='book ng-scope']")).click();
		
				
		// String LC_Heading = driver.findElement(By.className("container-fluid padd_0")).getText();  // ng-scope
		driver.findElement(By.className("ng-scope")).getText();  // ng-scope
		
		 // driver.findElement(By.className("tb-height-max tb-width-max airplaneNote_position_fixed ng-scope")).getText();
		driver.findElement(By.xpath("//div[@id='viewDiv']")).getText();
		
		
//      id*** tb_navSidebar -- [ id = //div[@id='tb_tocNav'] and //div[@id='tb_toc_container']    
//		AND   class = tb-fit-toolbar do-not-print ]----------       ng-isolate-scope toc-container -----  book ng-scope
		driver.findElement(By.xpath("//div[@id='tb_navSidebar']")).getText();
		//// System.out.println("//div[@id='tb_navSidebar']   ????? " + LC_Heading );

		driver.findElement(By.xpath("//div[@id='tb_tocNav']")).getText();
		//  System.out.println("//div[@id='tb_tocNav']   ????? " + LC_Heading );
		
		
		String LC_Heading   =  driver.findElement(By.xpath("//div[@id='tb_toc_container']")).getText();
		System.out.println("//div[@id='tb_toc_container']    ????? " + LC_Heading );
		
		
		
		String LC2_Heading   = driver.findElement(By.xpath("//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]")).getText();
		System.out.println("//body[@id='tb_body']/   ????? " + LC2_Heading );  // ????? SRM  --	Structural Repair Manual --		BCG � Rev 52 � 10 Mar 2014 � D634A201 
		
		String srm_XPATH = "//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]";  
		String srm_Test = "container-fluid padd_0 ng-scope";
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotFile, new File("E:\\SoftwareTestingMaterial.png"));	
		
		
		
		
		
		
		try {   // driver.findElement(By.xpath(srm_Test)).click();
			 //driver.findElement(By.xpath(srm_Test)).wait(10);
			driver.findElement(By.xpath(srm_XPATH)).click();;
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");		
			 //File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// FileUtils.copyFile(screenshotFile, new File("E:\\SoftwareTestingMaterial.png"));
			//       Utils.captureScreenShot();
			throw(e);  //			e.printStackTrace();
		}
		
		
		
		
		// Click search box
		String srh_element = driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).getText();
		System.out.println("going to search line # 120 === " + srh_element);
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).click();
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys("AR"+Keys.ENTER); 
				
		//         //span[@class='fa fa-search fw']         search icon???
		
		
		
		//File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		// driver.close();
		// driver.quit(); 
		 
		
		
		
		//  driver.findElement(By.xpath(srm_XPATH)).click();
		
		/*
		try {
			driver.getTitle().wait(300);;             // driver.wait(timeout);  // driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */

		/////////String LC3_Heading = driver.findElement(By.className("container-fluid padd_0 ng-scope")).getText(); // container-fluid padd_0 ng-scope
		////////////////System.out.println(LC3_Heading );
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: Unable to locate element: .container\-fluid\ padd_0\ ng\-scope  
		//                         Unable to locate element: .container\-fluid\ padd_0\ ng\-scope
	}  // End of Main
	
	
	private static void search_LC(String srh_String ){
		// find search box element // enter search keyword 	// click search icon btn
		// from main    search("AR");
		
	}// End of search_LC
	
	
	private static void search_Icon_Click(){
		// find and Click Search Icon 
		//driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).click();
		
	}// End of search_Icon_Click
	
	
	/*
	private static void waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}  */

} // End of Class



/*       https://wiki.saucelabs.com/display/DOCS/Best+Practice%3A+Avoid+Dependencies+between+Tests+to+Run+Tests+in+Parallel
 public void doLogin()
{
    //do some stuff to trigger a login
    assertEquals("My Logged In Page", driver.getTitle());
}
  
@Test
public void testLogin()
{
    this.doLogin();
}
  
@Test
public void testUserOnlyFunctionality()
{
    this.doLogin();
    driver.findElement(By.id("userOnlyButton")).click();
    assertEquals("Result of clicking userOnlyButton", driver.findElement(By.id("some_result")));
} 
*/