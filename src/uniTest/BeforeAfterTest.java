package uniTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class BeforeAfterTest {
	String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\simbu\\eclipse-workspace\\Samples\\MyFirstTestNGProject\\drivers\\chromedriver.exe";
    WebDriver driver ; 
    int counter = 1;
     
     @BeforeTest
      public void launchBrowser() {
    	  System.out.println(counter++ + " : Before Test");
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
    	  System.out.println(counter++ + " : Test");
          String expectedTitle = "Welcome: Mercury";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
    	  System.out.println(counter++ + " : After Test");
         // driver.close();
      }
}
