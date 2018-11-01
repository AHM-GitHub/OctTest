package LittleCat_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LC_AbstractsBK01 {
	
	
	WebDriver driver;
	
	public void doLogin_1()
	
	
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
		waiting(1500); 			//	driver.findElement(By.className("tb-agreementText")).click();
		
		
		String agreementClearfix = driver.findElement(By.className("modal-footer-custom")).getText();   // tb-agreementText
		System.out.println("Accept Text : " +  agreementClearfix );   //driver.findElement(By.className("modal-footer-custom")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("tb_accpt_lic_agrmnt_txt")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Continue')]")).click();
		
		
	 }  // End of doLogin
	
		public void waiting(int time) {       //private static void waiting(int time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}  // End of wait
			
	
	
} // End of LC_Abstracts 
