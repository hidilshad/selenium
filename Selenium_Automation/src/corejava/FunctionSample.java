/**
 * 
 */
package corejava;

/**
 * @author Kamal
 *
 */
public class FunctionSample {

	public static void firstName(String name, int i) {
		System.out.println("**********************");
		System.out.println(name);
		System.out.println("//////////////////////");
	}

	public static void lastName(String name) {
		System.out.println("**********************");
		System.out.println(name);
		System.out.println("**////////****//////////**////");
	}

	public static void main(String[] args) {
		firstName("Hello",1);
		firstName("Dilshad",2);
		firstName("Swathi",3);
		lastName("Selenium");

	}

}
