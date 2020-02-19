package corejava;

public class ConditonalStatements {
	public static void main(String[] args) {
		// if
		// if-else
		// if; if-else;else
		// nested-if
		int a = 90;
		int b = 90;
		if (a > b) {
			System.out.println("a is large value****");

		} else if (b > a) {
			System.out.println("b is large value****");
		} else {
			System.out.println("both are equal****");
		}

		// nested if: write the condition within the condition
		int age = 65;
		String gender = "female";
		if (age >= 60) {
			if (gender.equals("male")) {
				System.out.println("give discount of 20%");
			}
			if (gender.equals("female")) {
				System.out.println("give discount of 30%");
			} else {

				System.out.println("give discount of 25%");

			}

		}

	}

}
