package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import SetupClass.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;

public class Footer extends Setup {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void clear_cache() throws InterruptedException
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(4200);
		log.info("DELETE COOKIES");
	}
	
	public void err_page() throws InterruptedException
	{
		
		pagetitle=driver.getTitle().toUpperCase();
		System.out.println("Title of the Page is:-"+""+pagetitle);
		Thread.sleep(3500);
		
		try
		{
			driver.getPageSource().contains("404 Not Found");
		}
	    catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void chat_pop_up() throws InterruptedException
	{
		try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
			else {
					System.out.println("chat window does not open");
			     }
		}
				catch(NoSuchElementException NCP) {
					
				}
	}
  
  
  @Given("^Open the Website URL1\\.$")
	public void open_the_Website_URL1() throws InterruptedException {
		
		driver.get(AppURL);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	log.info("It's opening the website URL");
	Thread.sleep(1000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
         driver.manage().deleteAllCookies();
         Thread.sleep(2000);
	try {
		driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");
	} 
	catch (NoSuchElementException popup) {
	}
	}

	@Then("^user enter email and password$")
       public void user_enter_email_and_password() throws InterruptedException  {
    
	       WebElement old_paid_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[2]/div/input")));
               old_paid_email.sendKeys("sakshi.pathania@slidetech.in");
    
               WebElement old_paid_pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[3]/div/input")));
               old_paid_pass.sendKeys("Qwerty@1");
	       
	       Thread.sleep(3000);
	       WebElement old_paid_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
	       old_paid_login_btn.click();
        }
        
      @Then("^Free Business PPT\\.$")
	public void Free_Business_PPT() throws Throwable {
		
		WebElement footer_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Business PPT')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_1);
		footer_1.click();
		log.info("FOOTER --> 1 || FREE STUFF || FREE BUSINESS PPT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}


	@Then("^Free PPT template\\.$")
	public void Free_PPT_template() throws Throwable {
		
		WebElement footer_2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[3]/a")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_2);
		footer_2.click();
		log.info("FOOTER --> 3 || FREE STUFF || FREE PPT Template");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free Editable PPT\\.$")
	public void Free_Ediatble_PPT() throws Throwable {
		
		WebElement footer_3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[3]/a")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_3);
		footer_3.click();
		log.info("FOOTER --> 4 || FREE STUFF || FREE EDITABLE PPT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free Google Slide\\.$")
	public void Free_Google_Slide() throws Throwable {
		
		WebElement footer_4= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[5]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_4);
		footer_4.click();
		log.info("FOOTER --> 5 || FREE STUFF || FREE GOOGLE SLIDE ");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	
	@Then("^Free Timeline\\.$")
	public void Free_Timeline() throws Throwable {
	    
		WebElement footer_5= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[7]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_5);
		footer_5.click();
		log.info("FOOTER --> 7 || FREE STUFF || FREE TIMELINE");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^Free Investor Pitch\\.$")
	public void Free_Investor_Pitch() throws Throwable {
		
		WebElement footer_6= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[8]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_6);
		footer_6.click();
		log.info("FOOTER --> 8 || FREE STUFF || FREE INVESTOR PITCH");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}
			 
			 

	@Then("^Free Template\\.$")
	public void Free_Template() throws Throwable {
		
		WebElement footer_7= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[10]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_7);
		footer_7.click();
		log.info("FOOTER --> 10 || FREE STUFF || FREE TEMPLATE");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

			 
	@Then("^Free Business Plan\\.$")
	public void Free_Business_Plan() throws Throwable {
		
		
		  WebElement footer_8= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[12]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_8);
		  footer_8.click();
		  log.info("FOOTER --> 11 || FREE STUFF || FREE BUSINESS PLAN"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	 @Then("^View All\\.$")
	public void View_All() throws Throwable {
		
		
		  WebElement footer_9= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[13]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_9);
		  footer_9.click();
		  log.info("FOOTER --> 12 || FREE STUFF || View All"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	// Popular PPts
	
	@Then("^Action Plan Template\\.$")
	public void Action_Plan_Template() throws Throwable {
		
		
		  WebElement footer_10= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[3]/ul/li[1]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_10);
		  footer_10.click();
		  log.info("FOOTER --> 13 || POPULAR PPT || ACTION PLAN TEMPLATE"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Biz Model Canvas\\.$")
	public void Biz_Model_Canvas() throws Throwable {
		
		
		  WebElement footer_11= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[3]/ul/li[3]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_11);
		  footer_11.click();
		  log.info("FOOTER --> 14 || POPULAR PPT || BIZ MODEL CANVAS"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Certificate PPT\\.$")
	public void Certificate_PPT() throws Throwable {
		
		
		  WebElement footer_12= wait.until(ExpectedConditions.elementToBeClickable(By.csselector("body > div.page-wrapper > footer > div > div > div.footer-outer > div > div:nth-child(3) > ul > li:nth-child(5) > a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_12);
		  footer_12.click();
		  log.info("FOOTER --> 15 || POPULAR PPT || CERTIFICATE PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Change Management\\.$")
	public void Change_Management() throws Throwable {
		
		
		  WebElement footer_13= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[3]/ul/li[7]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_13);
		  footer_13.click();
		  log.info("FOOTER --> 16 || POPULAR PPT || CERTIFICATE PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Company Powerpoint\\.$")
	public void Company_Powerpoint() throws Throwable {
		
		
		  WebElement footer_14= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[3]/ul/li[9]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_14);
		  footer_14.click();
		  log.info("FOOTER --> 17 || POPULAR PPT || COMPANY POWERPOINT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Competitor landscape\\.$")
	public void Competitor_landscape() throws Throwable {
		
		
		  WebElement footer_15= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[3]/ul/li[11]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_15);
		  footer_15.click();
		  log.info("FOOTER --> 18 || POPULAR PPT || COMPETITOR LANDSCAPE"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Current State PPT\\.$")
	public void Current_State_PPT() throws Throwable {
		
		
		  WebElement footer_16= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[1]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_16);
		  footer_16.click();
		  log.info("FOOTER --> 19 || POPULAR PPT || CURRENT STATE PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Cybersecurity PPT\\.$")
	public void Cybersecurity_PPT() throws Throwable {
		
		
		  WebElement footer_17= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[3]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_17);
		  footer_17.click();
		  log.info("FOOTER --> 20 || POPULAR PPT || CYBERSECURITY PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("^Disaster Mgmt ppt\\.$")
	public void Disaster_Mgmt_ppt() throws Throwable {
		
		
		  WebElement footer_18= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[5]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_18);
		  footer_18.click();
		  log.info("FOOTER --> 21 || POPULAR PPT || DISASTER MGMT PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	
	@Then("Food Powerpoint\\.$")
	public void Food_Powerpoint() throws InterruptedException {
		
		 WebElement footer_19= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[6]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_19);
		  footer_19.click();
		  log.info("FOOTER --> 22 || POPULAR PPT || FOOD POWERPOINT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("Happy Birthday PPT\\.$")
	public void Happy_Birthday_PPT() throws InterruptedException {
		
		 WebElement footer_21= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[7]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_21);
		  footer_21.click();
		  log.info("FOOTER --> 23 || POPULAR PPT || HAPPY BIRTHDAY PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("HR Management PPT\\.$")
	public void HR_Management_PPT() throws InterruptedException {
		
		 WebElement footer_22= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[9]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_22);
		  footer_22.click();
		  log.info("FOOTER --> 24 || POPULAR PPT || HR MANAGEMENT PPT"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	@Then("Introduce Yourself\\.$")
	public void Introduce_Yourself() throws InterruptedException {
		
		 WebElement footer_23= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[11]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_23);
		  footer_23.click();
		  log.info("FOOTER --> 25 || POPULAR PPT || INTRODUCE YOURSELF"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	
	@Then("View All 1\\.$")
	public void View_All_1() throws InterruptedException {
		
		 WebElement footer_24= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[4]/ul/li[13]")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_24);
		  footer_24.click();
		  log.info("FOOTER --> 26 || POPULAR PPT || VIEW ALL"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
	
	
	
	}
	
