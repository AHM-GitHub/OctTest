package OOPS;

import java.io.File;  // Begin  End of ORG LC_TBR_Chrome_Grid
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
// End of ORG LC_TBR_Chrome_Grid

//Org_Begin
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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


public class LC_TBR_Chrome_Grid {
	
	WebDriver driver;
	String baseGoogle = "http://www.google.ca";
	String baseUK = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
	String baseURL_IE = "http://vstbxv1dev-3:8080/toolbox_test";
	String baseURL_LC = "http://localhost:8081/ToolboxRemote.html";// 
	String baseURL_Test = "https://www.seleniumeasy.com/test/";  // https://www.seleniumeasy.com/test/
	String driverPath_Firefox = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\geckodriver64.exe";
	String driverPath_Chrome = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\chromedriver-243.exe";
	String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-32.exe";
	//String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-64.exe";
	public static final String PATH_SCREENSHOTS_Grid = "E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots";
	public static final String PATH_SCREENSHOTS_Grid2 = "E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots\\oct_srh.png";
	// public static WebDriver driver;
	
	
	private static void waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} // End of private static void waiting	
	
	
	
	@BeforeMethod(alwaysRun=true)// @BeforeMethod
	public void test_before()throws Exception{
		// WebDriver driver;	
		
		System.setProperty("webdriver.chrome.driver",driverPath_Chrome);  // System.setProperty("webdriver.gecko.driver",driverPath_Firefox);
		driver = new ChromeDriver();  // driver = new FirefoxDriver();    // 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL_LC);              //driver.get(baseURL_LC);// driver.get(baseGoogle); // driver.get(baseUK);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
	} // End of test_before
	
	@AfterMethod(alwaysRun=true)   //@AfterMethod
	public void endTest(){
		//JOptionPane.showMessageDialog(null, "Browser will be closed");
		driver.close();
	}   
	
	
	
	//@Ignore
	@Test(priority = 6, enabled = true , groups = { "checkout"} )
	public void Chorme_Searching_Test () throws IOException {  // Select_SRM_Test
		System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
		this.doLogin();
		System.out.println("Select_Airplane_Test calls test");
		this.Select_Airplane("30830"); //27838 MSN - 737-700??  // System.out.println("***************************Calling open SRM ******************** test");
		
		this.Select_SRM_Method(); // System.out.println("***************************Calling search ******************** test");
		// JOptionPane.showMessageDialog(null, "End of CHROME_Searching_Test");		//assertThat();
		///   GOT ERROR in Chrome this.Searching_Method("door");  // door //Chem-Milled   
		
		    this.Searching_Method("door");  // door //Chem-Milled
		waiting (3000);
		TakesScreenshot snapper = (TakesScreenshot)driver; 
		File tempScreenshot = snapper.getScreenshotAs(OutputType.FILE); 
		File myScreenshotDirectory = new File("E:\\Eclipse-Data\\workspaces\\Eclipse-inst-win64-Data-Neon\\TestNG\\screenShots");  // E:\Eclipse-Data\workspaces\Eclipse-inst-win64-Data-Neon\TestNG\screenShots
		String newImageFile = "LC_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".png";
		File myScreenshot = new File (myScreenshotDirectory, newImageFile);
		FileUtils.moveFile(tempScreenshot, myScreenshot);
		JOptionPane.showMessageDialog(null, "End of Searching_Test");		//assertThat();
		//    */		
		  //  Comments out   GOT ERROR in Chrome this.Searching_Method("door");  // door //Chem-Milled 
 		
	}  //Searching_Test
	
	
	// **************Below is methods - Org from SRM_TestNG ****************
	
	 
	 public void doLogin()  // @Test(priority = 1, enabled = false)
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
	 
	 
		
		public void Select_Airplane (String plane_Identifier) {   // @Test(priority = 2, enabled = false)
			
			
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
		
	@Ignore
	public void Select_SRM_Method () {  // Select_SRM_Test
			System.out.println("Select_Airplane_Test STARTS");	 //System.out.println("Select_Airplane_Test calls EULA");
			
			// String LC_Heading = driver.findElement(By.className("container-fluid padd_0")).getText();  // ng-scope
					driver.findElement(By.className("ng-scope")).getText();  // ng-scope
					
					 // driver.findElement(By.className("tb-height-max tb-width-max airplaneNote_position_fixed ng-scope")).getText();
					driver.findElement(By.xpath("//div[@id='viewDiv']")).getText();
					
					
//			      id*** tb_navSidebar -- [ id = //div[@id='tb_tocNav'] and //div[@id='tb_toc_container']    
//					AND   class = tb-fit-toolbar do-not-print ]----------       ng-isolate-scope toc-container -----  book ng-scope
					driver.findElement(By.xpath("//div[@id='tb_navSidebar']")).getText();
					//// System.out.println("//div[@id='tb_navSidebar']   ????? " + LC_Heading );

					driver.findElement(By.xpath("//div[@id='tb_tocNav']")).getText();
					//  System.out.println("//div[@id='tb_tocNav']   ????? " + LC_Heading );
					
					
					String LC_Heading   =  driver.findElement(By.xpath("//div[@id='tb_toc_container']")).getText();
					System.out.println("//div[@id='tb_toc_container']    ????? " + LC_Heading );
					
					
					
					String LC2_Heading   = driver.findElement(By.xpath("//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]")).getText();
					System.out.println("//body[@id='tb_body']/   ????? " + LC2_Heading );  // ????? SRM  --	Structural Repair Manual --		BCG · Rev 52 · 10 Mar 2014 · D634A201 
					
					String srm_XPATH = "//body[@id='tb_body']/div[@id='viewDiv']/span[@class='ng-scope']/div[@id='tb_applicationDiv']/div[@class='tb_heightMax tb_tocDivHeight ng-scope col-xs-12 col-sm-12 col-md-4 col-lg-4']/div[@id='tb_tocDiv']/div[@id='tb_navSidebar']/div[@id='tb_tocNav']/div[@id='tb_toc_container']/div[1]";  
					
					driver.findElement(By.xpath(srm_XPATH)).click();
			
			
	}//End of Select_SRM_Method 
	
	@Ignore
	public void Searching_Method (String keyword_Search){
		waiting (500); 
		//String srh_element = driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).getText();
		//  String srh_element = driver.findElement(By.xpath("//div[@class='header_adjustment col-lg-9 col-md-8 col-sm-8 col-xs-7']")).getText();
		
		driver.findElement(By.xpath("//div[@class='header_adjustment col-lg-9 col-md-8 col-sm-8 col-xs-7']")).click();
		System.out.println("going to search line # 120 === header   Done");
		
		driver.findElement(By.xpath("//div[@class='header-search-block ng-scope']")).click();
		System.out.println("going to search line # 120 === BLOCK   Done");
		// waiting (500);
		
		/*driver.findElement(By.xpath("//b[@id='searchInText']")).click();
		// driver.findElement(By.xpath("//i[@title='No more pages to move forward grayColor']")).sendKeys(Keys.TAB+keyword_Search+Keys.ENTER);;
		driver.findElement(By.xpath("//i[@title='No more pages to move forward grayColor']")).click();
		System.out.println("going to search line # 120 === IN Text   Done");
		 waiting (500);
		
		  Actions a = new Actions(driver);
		   a.sendKeys(Keys.TAB)  
		   .sendKeys("AR")  // a.sendKeys("AR" + Keys.ENTER)
		   .sendKeys(Keys.ENTER)  
		    .perform();  
		*/
		
		/* Actions a = new Actions(driver);
		 a.keyDown(Keys.SHIFT)
		    .keyDown(Keys.CONTROL)    
		   // .sendKeys("AR" + Keys.ENTER)
		    .perform();  */
		 System.out.println("going to search line # 120 === key down done"); 
		 
		// waiting (1000);
		 
		 
		 
		/*  driver.findElement(By.xpath("//div[contains(@class,'left_icon')]")).click();
		 
		 driver.findElement(By.xpath("//div[contains(@class,'left_icon')]")).sendKeys(Keys.TAB+keyword_Search+Keys.ENTER);
		 */
		 //  driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys(keyword_Search+Keys.ENTER);  //driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys("AR"+Keys.ENTER);
		 
		 
		 
		 
		 //Actions  = new Actions(driver);
		 /*    
		 a.keyUp(Keys.CONTROL)
		   .keyUp(Keys.SHIFT)
		    .sendKeys("AR" + Keys.ENTER)
		    .perform();  */   		 
		 
		   // waiting (1000);
		    
		    // System.out.println("going to search line # 120 === key UUPP done");
		 // driver.switchTo().activeElement().sendKeys("AR"+Keys.ENTER);		 
		 
		 /*
		 a.keyUp(Keys.CONTROL)
		    .keyUp(Keys.SHIFT)
		    .sendKeys("AR" + Keys.ENTER)
		    .perform();   */
		 
		// driver.switchTo().activeElement();
		 
		 //  driver.findElement(By.xpath("//b[@id='searchInText']")).sendKeys(Keys.SHIFT + Keys.TAB);
		 
		 
		 //js.executeScript ("document.getElementById('"element in question"').focus()"); 
		 
		//  driver.findElement(By.xpath("//b[@id='searchInText']")).sendKeys" + {TAB}";
		 //driver.findElement(By.xpath("//b[@id='searchInText']")).sendKeys("DDD"+ Keys.TAB);
		
////////////
		/* driver.findElement(By.xpath("//div//div//span//input[1]")).click();
		System.out.println("going to search line # 120 === span i/p  Done");
		waiting (500);
		
				
		driver.findElement(By.xpath("//div//div//span//input[1]")).click();
		System.out.println("going to search line # 120 === span i/p  Done");
		waiting (500); 
		
		driver.findElement(By.xpath("//a[@class='tb_searchClearSF text_decoration_none ng-hide']")).click();
		System.out.println("going to search line # 120 === ClearSF  Done");
		
		*/
		
		/*  org 
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).getText();		
		System.out.println("going to search line # 120 === CLICK  get text()");
		waiting (1000);  
		System.out.println("going to search line # 121 ===  121  121");
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).click();
		System.out.println("going to search line # 121 ===  12222222222222");
		driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys(keyword_Search+Keys.ENTER);  //driver.findElement(By.xpath("//div[@class='tb-search-box-width']//input[2]")).sendKeys("AR"+Keys.ENTER);
		*/
		
		
	}// End of Searching_Method	
		
		
		
	 
	
	// Above is methods - Org from SRM_TestNG
	
	

} // End of class LC_TBR
