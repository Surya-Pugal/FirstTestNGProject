package uniTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBaseConfig {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\simbu\\eclipse-workspace\\Samples\\MyFirstTestNGProject\\drivers\\chromedriver.exe";
    public WebDriver driver ; 
    int counter = 1;
     
     @BeforeTest
      public void launchBrowser() {
    	  System.out.println(counter++ + " : Before Test");
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
     
     @AfterTest
     public void terminateBrowser(){
   	  System.out.println(counter++ + " : After Test");
        // driver.close();
     }
}
