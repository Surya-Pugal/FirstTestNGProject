package uniTest;

import org.testng.annotations.Test;

public class TestPriority {
	int counter = 1;
	 @Test(priority=1)
	  public void c_test() {
		  System.out.println(counter++ +" :Test method C");
	  }
	  
	  @Test(priority=2)
	  public void a_test() {
		  System.out.println(counter++ +" :Test method A");
	  }
	  
	  @Test(priority=3)
	  public void b_test() {
		  System.out.println(counter++ +" :Test method B");
	  }
}
