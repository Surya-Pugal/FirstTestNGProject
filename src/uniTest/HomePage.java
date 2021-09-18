package uniTest;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// logic to verify the page title and assert it to true or false inside “verifyTitle”
public class HomePage {
	WebDriver driver;
	int Seqeunce = 1;
  @Test
  public void verifyTitle() {
	  System.out.println(Seqeunce++ + " :" + "Verify Title Call");
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google");
  }
  
  @Test
  public void y_TestCase2() {
	  System.out.println(Seqeunce++ + " :" + "Test Case 2");
	  
  }
  
  @BeforeTest
  public void startingUp()
  {
	  System.out.println(Seqeunce++ + " :" + "Before Test Call");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\simbu\\eclipse-workspace\\Samples\\MyFirstTestNGProject\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
  }
  
  @AfterTest
  public void afterTest()
  {
	  System.out.println(Seqeunce++ + " :" + "After Test Call");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println(Seqeunce++ + " :" + "Before Method Call");
	  
	  Date d = new Date();
	  
	  System.out.println(d.toString());
	  
  }
  
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println(Seqeunce++ + " :" + "After Method Call");
	  
	  Date d = new Date();
	  
	  System.out.println(d.toString());
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println(Seqeunce++ + " :" + "Before Class Call");	  
  }
  
  
  @AfterClass
  public void afterClass()
  {
	  System.out.println(Seqeunce++ + " :" + "After Class Call");	  
  }
}
