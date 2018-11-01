package LittleCat_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LC_AbstractsBK02 {
	
	
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
			
		public String  select_result_type(String revision_Type){
		String ar_XPATH ="//span[@id='span_Revision Type_AR']";////ul[@id='Revision Type']//li[1]//label[1]  //span[@id='span_Revision Type_AR']
		String oem_XPATH ="";
		String revision_Type_XPATH ="";
		
		if (revision_Type == "AR") {
			revision_Type_XPATH = ar_XPATH; 
			}
			else {
				revision_Type_XPATH = oem_XPATH;
			} // End of If
		return revision_Type_XPATH;
		// waiting (3000);
		
		
		/*
		System.out.println("Ready to click AR option box");

		//***
		String bbbd = driver.getTitle();  System.out.println(bbbd);
		waiting(1000);
		//***
		
		
		///////////
		
		//div[@id='tb_facetWrapper']
		String xyz =  driver.findElement(By.xpath("//*div[@id='tb_facetWrapper']")).getText(); // driver.findElement(By.xpath("//div[@id='tb_facetWrapper']")).click();
		
		//ul[@id='Revision Type']//li[1]//label[1]
		// Not to click this one  as it will hide AR and OEM 
		driver.findElement(By.xpath("//ul[@id='Revision Type']//li[1]//label[1]"));
		
		//b[contains(text(),'Revision Type')]     // this is the revision Type label
		driver.findElement(By.xpath("//b[contains(text(),'Revision Type')]"));  
		
		
		//span[@id='span_Revision Type_AR']
		driver.findElement(By.xpath("//span[@id='span_Revision Type_AR']")).click();
		
		System.out.println("CLICKED ??????");
		
		*/
		
		
////////
		}// End of select_result_type
		
		
	
} // End of LC_Abstracts 
