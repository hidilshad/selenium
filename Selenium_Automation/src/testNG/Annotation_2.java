package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation_2 {
  @Test
  public void f() {
	  System.out.println("at test f");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("at test a");
  }
  @Test
  public void m() {
	  System.out.println("at test m");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("at test n");
  }

}
