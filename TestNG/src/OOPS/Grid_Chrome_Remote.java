package OOPS;
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
import org.openqa.selenium.Platform;
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
import org.openqa.selenium.remote.RemoteWebDriver;

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






/*
 * import org.openqa.selenium.ie.InternetExplorerDriver;
 * import java.net.MalformedURLException;
 * import java.net.URL; 
 */



//@Test
public class Grid_Chrome_Remote {          // E:\Eclipse-Data\workspaces\Eclipse-inst-win64-Data-Neon\Selenium_313\src\practices

	 WebDriver driver;
	
	 String baseGoogle = "http://www.google.ca";
		String baseUK = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
		String baseURL_IE = "http://vstbxv1dev-3:8080/toolbox_test";
		String baseURL_LC = "http://localhost:8081/ToolboxRemote.html";   
		String baseURL_Test = "https://www.seleniumeasy.com/test/";  // https://www.seleniumeasy.com/test/
		String baseURL_DragAndDrop = "https://html5demos.com/drag/";  // https://html5demos.com/drag/
		String driverPath_Firefox = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\geckodriver64.exe";
		String driverPath_Chrome = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\chromedriver.exe";
		String driverPath_IE = "E:\\Eclipse-Data\\workspaces\\selenium-java-3.13.0\\IEDriverServer-32.exe";

		public String nodeURL;
		
				
		
		private static void waiting(int time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} // End of private static void waiting	
	
	//public static void main(String[] args) {
	
	@BeforeMethod
	public void test_before()throws Exception{
		// WebDriver driver;	
		
		System.setProperty("webdriver.gecko.driver",driverPath_Firefox);  //System.setProperty("webdriver.chrome.driver",driverPath_Chrome);
		
		nodeURL = "http://172.16.0.64:5555/wd/hub";
		 
		
		/*   Below is Firefox for RemoteWebdriver
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		 caps.setBrowserName("firefox");
		 caps.setPlatform(Platform.WINDOWS);
		 driver = new RemoteWebDriver(new URL("http://172.16.0.64:5555/wd/hub"),caps);  
		 //  Above is Firefox for RemoteWebdriver                    */
		
					
		DesiredCapabilities caps = DesiredCapabilities.chrome();     // DesiredCapabilities.firefox();
		caps.setBrowserName("chrome");         //caps.setBrowserName("firefox");
		 caps.setPlatform(Platform.WINDOWS);
		 driver = new RemoteWebDriver(new URL("http://172.16.0.64:5555/wd/hub"),caps);
		
		 /* below is new setting but NOT in USe 
		  * FirefoxOptions options = new FirefoxOptions();
		  * driver = new RemoteWebDriver(new URL(nodeURL), options);
		  */
		 
		
		
		
		//driver = new FirefoxDriver();    // driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL_Test);              //driver.get(baseURL_LC);// driver.get(baseGoogle); // driver.get(baseUK);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	}
	
	//@Ignore
	@Test(priority = 0, enabled = true ) //true)
	public void test_one(){
		String bbbd = driver.getTitle(); 
		AssertJUnit.assertEquals(driver.getTitle(),"Selenium Easy - Best Demo website to practice Selenium Webdriver Online");  
		// below is get text to use with assert later 
		WebElement para1 =  driver.findElement(By.xpath("//div[@id='home']//h3[@class='head text-center']"));  // get page text WELCOME TO SELENIUM EASY DEMO
		AssertJUnit.assertEquals(para1.getText(),"WELCOME TO SELENIUM EASY DEMO");                 //String ccc = para1.getText();
	}  // End of test one   
	
	
	@Test(priority = 1, enabled = true)  //  @Test(priority = 1, enabled = true) 
	public void test_two_Simple_Form_Demo(){		
		driver.findElement(By.id("btn_basic_example")).click();
		//driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();  // //a[@id='btn_basic_example']
		driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Simple Form Demo')]")).click();  // Click Simple Form Demo
		waiting(1000);  	//driver.findElement(By.id("user-message")).click();
		
		
		//JOptionPane.showMessageDialog(null, "Click OK to test Input Form thru Text Box");
		
		driver.findElement(By.id("user-message")).sendKeys("Mini Demo");		
		waiting(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		
		String hhh = driver.findElement(By.xpath("//span[@id='display']")).getText();
				
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).sendKeys(Keys.ARROW_DOWN);
		
		//JOptionPane.showMessageDialog(null, "Click OK to test Second Input Form thru Text Box");
		
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("1000");   // driver.findElement(By.xpath("//input[@id='sum1']")).click();
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("2000");
		
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click(); waiting(3000);
		WebElement ddd = driver.findElement(By.xpath("//span[@id='displayvalue']"));
		String kkk = ddd.getText();   		//System.out.println(kkk);
		
		AssertJUnit.assertEquals(ddd.getText(),"3000");    
		
		JOptionPane.showMessageDialog(null, "End of Input Form Test using sendKeys method");
		
		// Below to scroll up then click DemoHome to next scenario 
				driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).sendKeys(Keys.ARROW_UP);
				driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).sendKeys(Keys.ARROW_UP);
				driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).sendKeys(Keys.ARROW_UP); //  
				
			
				
				driver.findElement(By.xpath("//a[contains(text(),'Demo Home')]")).click();
		
		//driver.close();
	}// End of test_two_Simple_Form_Demo
	
	@Ignore
	//@Ignore
	@Test(priority = 2, enabled = true)
	public void Test_three_Table_Sort_And_Search_Demo() {
		
		 //Below is to test 2nd Scenario in Advance Level   ' Table Sort And Search Demo' --------------intermediate level
		driver.navigate().to("https://www.seleniumeasy.com/test/");     // driver.get(baseURL_Test);   
		
		
		driver.findElement(By.xpath("//span[@class='round-tabs four']")).click();   waiting(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");
		 waiting(2000);
		
		JOptionPane.showMessageDialog(null, "Click to test Table Sort & Search");
		 
		// after click , will go to Table Sort & Search  
		driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Table Sort & Search')]")).click(); 
		
		JOptionPane.showMessageDialog(null, "Testing action of Click Next Button");
		
		waiting(2000);
				
		driver.findElement(By.xpath("//a[@id='example_next']")).click(); 
				
		waiting(2000);  // Click next btn on lower left
		
		JOptionPane.showMessageDialog(null, "Testing action of Clicking BTN labeled with 3");
		driver.findElement(By.xpath("//a[contains(@class,'paginate_button')][contains(text(),'3')]")).click(); waiting(5000);  // Click number three  btn on lower left
		
		
		JOptionPane.showMessageDialog(null, "Testing action of Clicking Drop down and select 25 ");
		driver.findElement(By.xpath("//select[@name='example_length']")).click(); waiting(5000);  // Click drop down above black bar 
		driver.findElement(By.xpath("//option[@value='25']")).click(); waiting(5000);  // Click 50 in drop down list
		
		js.executeScript("window.scrollBy(0,700)");   waiting(2000); // scroll down to near bottom thru java scripts
		JOptionPane.showMessageDialog(null, "Called Java script to perfrom Scroll down action");
		//  https://www.guru99.com/scroll-up-down-selenium-webdriver.html
		js.executeScript("window.scrollBy(0,-700)");   waiting(2000); // scroll up  thru java scripts
		
		String asd = driver.findElement(By.xpath("//div[@id='example_info']")).getText(); //System.out.println("show item 3 = " + asd);
		AssertJUnit.assertEquals("Showing 1 to 25 of 32 entries", asd);

		JOptionPane.showMessageDialog(null, "Click to perform enter search key word");
		// Below to click search box  to be complete
		driver.findElement(By.xpath("//input[@type='search']")).click(); waiting(2000);  // click search box
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("New York"+ Keys.ENTER);
		
		//New York
		JOptionPane.showMessageDialog(null, "End of Table_Sort_And_Search_Demo");
		// click to home
		driver.findElement(By.xpath("//a[contains(text(),'Demo Home')]")).click();
		
	} // End of test three
	
	@Ignore
	@Test(priority = 3, enabled =  true)     //true)      // false)
	public void test_five_alert_pop_up(){  
		
		// https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
		
		// Below is go to the test page of Alerts & Modals
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		 
		/*    no need to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");   waiting(1000);  */   
		
		
		JOptionPane.showMessageDialog(null, "Click the Click me btn to test first alert box = I am an alert box!");
		
		
		// Below is to click the first Click me btn to test first alert box = I am an alert box!   
		//driver.findElement(By.xpath("//button[@class='btn btn-default']")).click(); //  waiting(1000);
		
		driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-primary:nth-child(4) div.panel-body > button.btn.btn-default:nth-child(4)")).click();
			
		
		driver.switchTo().alert();
		String FirstAlertMsg = driver.switchTo().alert().getText();  		//System.out.println(FirstAlertMsg);  
		AssertJUnit.assertEquals(FirstAlertMsg, "I am an alert box!");     waiting(3000);   // somehow if change 3000 to other value will cause not working
		driver.switchTo().alert().accept();
		
		 JOptionPane.showMessageDialog(null, "Click the Click for Prompt Box btn to test next alert box ");
		
		// Below is to click the third Click me btn to test first alert box = Click for Prompt Box   
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click(); //  waiting(1000);
		String sendPromptTest = "Code Demo October 2018";
		driver.switchTo().alert().sendKeys(sendPromptTest);
		waiting(2000);  
		driver.switchTo().alert().accept();
		String SecondAlertMsg = driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText();  //System.out.println("second MSG ="+SecondAlertMsg); 
		AssertJUnit.assertEquals("You have entered '"+sendPromptTest+"' !", SecondAlertMsg);    // //p[@id='prompt-demo']
		
		waiting(5000);
		JOptionPane.showMessageDialog(null, "End of test_five_alert ");
		
	}// End of test_five_alert 
	
	@Ignore
	@Test(priority = 4, enabled = true)  //false) // true)  
	public void test_Bootstrap_Dual_List_Box(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Demo Home')]")).click();  //System.out.println(" click home to reset  ");
		
		driver.findElement(By.xpath("//span[@class='round-tabs three']")).click(); //  waiting(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");   waiting(1000); // scroll down to near bottom thru java scripts

		JOptionPane.showMessageDialog(null, "Calling Java script to perfrom scroll down action. Click OK to continue testing Bootstrap_Dual_List_Box");
		
		driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Bootstrap List Box')]")).click(); // System.out.println(" click Bootstrap List Box ");

		
		JOptionPane.showMessageDialog(null, "Click 'Dapibus ac facilisis in' in left list box then right Chervon to move to right List Box");
		// Click Dapibus ac facilisis in in list box
		driver.findElement(By.xpath("//div[@class='well text-right']//li[@class='list-group-item'][contains(text(),'Dapibus ac facilisis in')]")).click(); waiting(2000); 
		
		
		
		// driver.findElement(By.xpath("//div[@class='list-arrows col-md-1 text-center']")).click(); waiting(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click(); waiting(5000); // click arrow
		
		
		JOptionPane.showMessageDialog(null, "Find Search Box on th right then enter Dapibus ac to search. Then Move it to the left List Box");
		
		
		driver.findElement(By.xpath("//div[@class='well']//input[@placeholder='search']")).sendKeys("Dapibus ac"); waiting(5000); // click search on right hand side
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click(); waiting(5000); // click left arrow
		
		JOptionPane.showMessageDialog(null, "End of test_Bootstrap_Dual_List_Box");
	}   // End of test_Bootstrap_Dual_List_Box
	
	
	
	
	
	//@Ignore //  FINISHED 
	@Test(priority = 5 , enabled = true)
	public void test_Drag_And_Drop(){   
		
		driver.get("http://compendiumdev.co.uk/selenium/gui_user_interactions.html");
						
		// https://www.guru99.com/drag-drop-selenium.html
		
		//JOptionPane.showMessageDialog(null, "Before Drag and Drop -- The Text is Drop Here");
				
		Actions act=new Actions(driver); //Using Action class for drag and drop.
		WebElement From=driver.findElement(By.xpath("//div[@id='draggable1']"));	  // item to drag
				
		act.dragAndDropBy(From,300, 50).build().perform();	// act.dragAndDropBy(From,166, 166).build().perform();
		
		WebElement To=driver.findElement(By.xpath("//div[@id='droppable1']"));
		String ccc = To.getText();
		AssertJUnit.assertEquals(To.getText(),"Dropped!");   
		
		String pageSource = driver.getPageSource();  //GUI User Interactions
		AssertJUnit.assertTrue(pageSource.contains("GUI User Interactions"));
		JOptionPane.showMessageDialog(null, "End of test_Drag_And_Drop");// showMessageDialog(null, "This is even shorter");
		//waiting(3000); 
		
	}// End of test_Drag
	
	@Ignore
	//@Ignore
	@Test(priority = 6, enabled = true, expectedExceptions = ElementNotInteractableException.class) 
	public void Exception_test (){
		driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Simple Form Demo')]")).click();  // Click Simple Form Demo
		waiting(1000);
	}
	
	@Ignore
	@Test
	public void JQuery_Dual_List_Box(){
		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		
	}// End of JQuery Dual List Box
	
	
	@AfterMethod
	public void endTest(){
		driver.close();
	}   
	

} // End of Class

