package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotation_3 {
  @Test
  public void f() {
	  System.out.println("at test a");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("at test b");
  }
  @Test
  public void s() {
	  System.out.println("at test s");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("at test d");
  }

}
