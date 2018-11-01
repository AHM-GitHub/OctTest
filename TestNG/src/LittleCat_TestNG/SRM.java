package LittleCat_TestNG;


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
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
public class SRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseGoogle = "http://www.google.ca";
		String baseUK = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
		String baseURL_IE = "http://vstbxv1dev-3:8080/toolbox_test";
		String baseURL_LC = "http://localhost:8081/ToolboxRemote.html";// 
		String driverPath_Firefox = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\geckodriver64.exe";
		String driverPath_Chrome = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\chromedriver.exe";
		String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-32.exe";
		//String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-64.exe";
		// public static WebDriver driver;
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",driverPath_Firefox);  //System.setProperty("webdriver.chrome.driver",driverPath_Chrome);
		driver = new FirefoxDriver();    // driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get(baseURL_LC);              //driver.get(baseURL_LC);// driver.get(baseGoogle); // driver.get(baseUK);
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
		System.out.println("//body[@id='tb_body']/   ????? " + LC2_Heading );  // ????? SRM  --	Structural Repair Manual --		BCG · Rev 52 · 10 Mar 2014 · D634A201 
		
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
	
	
	
	private static void waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

} // End of Class
