package uniTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle_Inheritance  extends TestBaseConfig {
  
	 @Test
     public void verifyHomepageTitle() {
   	  System.out.println(counter++ + " : Test");
         String expectedTitle = "Welcome: Mercury Tours";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
    }
	 
}
