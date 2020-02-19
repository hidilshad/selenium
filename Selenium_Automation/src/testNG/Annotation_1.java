package testNG;

import org.testng.annotations.Test;

public class Annotation_1 {
  @Test
  public void f() {
	  System.out.println("I am at test f");
  }
  @Test(enabled = false)
  public void a() {
	  System.out.println("I am at test a");
  }
  @Test
  public void m() {
	  System.out.println("I am at test m");
  }
}
