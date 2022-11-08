package myPractices;

import java.util.Scanner;

public class maths {

	public static void main(String[] args) {
		
      Scanner allowUser = new Scanner(System.in);
		
		System.out.println("Enter your base number: ");
		
		int base = allowUser.nextInt();
		
		System.out.println("Enter the power or exponent for your base: ");
		
		int power = allowUser.nextInt();
		
		System.out.println("Your base number is: " + base);
		System.out.println("The power or exponent for your base is: "+power);
				myMath( base, power);
		
	}
	

	public static void myMath(int base, int power) {
		
       int y = (int)Math.pow(base, power);
       
      double ans = (int) Math.sqrt(y);
       
       System.out.println("Your answer is " + y);
       
       System.out.println("The square root of your answer is " + ans);
       
		
	}

}
