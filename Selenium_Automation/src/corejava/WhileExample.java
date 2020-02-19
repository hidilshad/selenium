package corejava;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		while (a > 0) {
			System.out.println(a);
			a++;
			if (a == 10) {
				break;
			}
		}
	}

}
