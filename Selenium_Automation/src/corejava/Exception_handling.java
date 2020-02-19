package corejava;

import java.io.File;

public class Exception_handling {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			int a = 20;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		File abc= new File("f://aanvm.exe");
		System.out.println(abc.canRead());
		
	}

}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at corejava.Exception_handling.main(Exception_handling.java:9)
//java.lang.ArithmeticException: / by zero
//at corejava.Exception_handling.main(Exception_handling.java:10)
