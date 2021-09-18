package uniTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;			
import org.testng.annotations.Test;
/***

Method 1: Open Browser say Chrome (openBrowser())

Method 2: Launch Google.com (launchGoogle())

Method 3: Perform a search using “Facebook” (performSearchAndClick1stLink())

Method 4: Verify Google search page title (FaceBookPageTitleVerification())

****/

public class Priority_Google_Search {
	WebDriver driver;			
	 String driverPath = "C:\\Users\\simbu\\eclipse-workspace\\Samples\\MyFirstTestNGProject\\drivers\\chromedriver.exe";
	  
	    // Method 1: Open Browser say Chrome			
	    @Test (priority=1)	
	    public void openBrowser() {				
	    	 System.setProperty("webdriver.chrome.driver", driverPath);
	          driver= new ChromeDriver();
	      }

	    // Method 2: Launch Google.com			
	    @Test  (priority=2)
	    public void launchGoogle() {				
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://www.google.com/");					
	    }		
    
	    // Method 3: Perform a search using "Facebook"			
	    @Test (priority=3)		
	    public void peformSeachAndClick1stLink() throws Exception {				
	       // driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	        // identify element
	        WebElement p=driver.findElement(By.name("q"));
	        //enter text with sendKeys() then apply submit()
	        p.sendKeys("Facebook");
	        WebDriverWait w = new WebDriverWait(driver, 5);
	        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
	        p.submit();	
	    }		

	    // Method 4: Verify Google search page title.			
	    @Test  (priority=4)
	    public void FaceBookPageTitleVerification()  {				
	       // driver.findElement(By.xpath(".//*[@name='btnK']")).click();	
	    	//driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
	        // Explicit wait condition for search results

	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
	    }		
	}		
