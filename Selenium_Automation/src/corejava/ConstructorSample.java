package corejava;

public class ConstructorSample {

	public static void sub() {
		System.out.println("sub");
	}




	public ConstructorSample() {
		System.out.println("constructed has excuted succes");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		
		int age = 20;
		Integer x = new Integer(20);
		ConstructorSample cs = new ConstructorSample();
		
		
	}
	
	
	public static void add() {
		System.out.println("add");
	}

}
