package com.dilshad;

public class IfCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        printage(2);
        printage(20);
        printage(50);

	}
	

	public static void printage(int age) {

		if (age >= 0 && age <= 2) {
			System.out.println("infant age :  " + age);

		}
		else if (age>2 && age<=12) {
			System.out.println("child age :" + age);
			
		} 
		else if (age>12 && age<=25){
			System.out.println("youth age :" + age);

		}
		else if(age>25 && age<=59 ) {
			System.out.println("adult age :" + age);
			
		}
		else if(age>59 && age<=125) {
			System.out.println("senier citizen :" + age);
			
		}
		else {System.out.println("age is not in the range 0 to 125 :" + age);
			
		}
	}

}
