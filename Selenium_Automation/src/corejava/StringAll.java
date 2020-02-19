package corejava;

public class StringAll {
	public static void main(String[] args) {
		String abc ;
		abc ="Testing";
		
		String xyz ="Selenium";
		
		//concadinate the Strings
		String a = xyz+" "+abc;
		System.out.println(a);
		
		//toUppercase
		System.out.println(xyz.toUpperCase());
		System.out.println(xyz.toLowerCase());
		
		//length of string
		System.out.println(abc.length());//
		System.out.println(abc.charAt(3));
		
		
		//Compare the strings: Equals EqualsIgnore
		String t = "Apple";
		String r = "apple";
		String y = "mango";
		
		if (t.equalsIgnoreCase(r)) {
			System.out.println("Both the Strings are matching");
		}
		else {
			System.out.println("Both the Strings are NOT matching");
		}
		
		
		
	}

}
