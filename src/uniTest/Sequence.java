package uniTest;

import org.testng.annotations.Test;

public class Sequence {
	int counter = 1;
  @Test
  public void c_test() {
	  System.out.println(counter++ +" :Test method C");
  }
  
  @Test
  public void a_test() {
	  System.out.println(counter++ +" :Test method A");
  }
  
  @Test
  public void b_test() {
	  System.out.println(counter++ +" :Test method B");
  }
}
