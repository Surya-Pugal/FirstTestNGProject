package uniTest;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;
/***

Method 1: Open Browser say Chrome (openBrowser())

Method 2: Launch Google.com (launchGoogle())

Method 3: Perform a search using “Facebook” (performSearchAndClick1stLink())

Method 4: Verify Google search page title (FaceBookPageTitleVerification())

****/

public class No_Priority {
	 WebDriver driver;			
	 String driverPath = "C:\\Users\\simbu\\eclipse-workspace\\Samples\\MyFirstTestNGProject\\drivers\\chromedriver.exe";
	  
	    // Method 1: Open Browser say Chrome			
	    @Test		
	    public void openBrowser() {				
	    	 System.setProperty("webdriver.chrome.driver", driverPath);
	          driver= new ChromeDriver();
	      }

	    // Method 2: Launch Google.com			
	    @Test		
	    public void launchGoogle() {				
	        driver.get("http://www.google.co.in");						
	    }		
     
	    // Method 3: Perform a search using "Facebook"			
	    @Test		
	    public void peformSeachAndClick1stLink() {				
	        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");								
	    }		

	    // Method 4: Verify Google search page title.			
	    @Test		
	    public void FaceBookPageTitleVerification() throws Exception {				
	        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
	        Thread.sleep(3000);		
	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
	    }		
	}		
