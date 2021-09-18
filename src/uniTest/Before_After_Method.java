package uniTest;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Before_After_Method {
	 	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 	String driverPath = "C:\\Users\\simbu\\eclipse-workspace\\Samples\\FirstTestNGProject\\drivers\\chromedriver.exe";
	    public WebDriver driver ; 
	    int counter = 1;
	    public String expected = null;
	    public String actual = null;
	    
	    @BeforeTest
	    public void launchBrowser() {
	    	System.out.println(counter++ + " : Before Test");
	          System.out.println("launching chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver= new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	    	  System.out.println(counter++ + " : Before Method");
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	      
	      @Test(priority = 0)
	      public void register(){
	    	  System.out.println(counter++ + " : Test register link");
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	      }
	      
	      @Test(priority = 1)
	      public void support() {
	    	  System.out.println(counter++ + " : Test support link");
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	      }
	      
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	    	  System.out.println(counter++ + " : After Method");
	            driver.findElement(By.linkText("Home")).click() ;
	      }
	       
	      @AfterTest
	      public void terminateBrowser(){
	    	  System.out.println(counter++ + " : After Test");
	          driver.close();
	      }
	}