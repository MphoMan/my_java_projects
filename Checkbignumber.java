package checkBignumber;

import java.util.Scanner;

public class Checkbignumber {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner allowUser = new Scanner(System.in);
		
		
		System.out.println("This program checks the big or maximum number among 3 numbers");
		
        System.out.print("\nInput the first number:");
        num1 = allowUser.nextInt();
       
        
        System.out.println("\nInput the second number:");
        num2 = allowUser.nextInt();
        
        
        System.out.println("\nInput the third number:");
        num3 = allowUser.nextInt();
       
        
        System.out.print("The first number entered is: " + num1);
        System.out.println("\nThe second number entered is: " + num2);
        System.out.println("\nThe third number entered is: " + num3);
        
        if((num1>=num2) && (num1>=num3)) {
        	System.out.println("The maximum or largest number is: " + num1);
        }
        else  if((num2>=num1) && (num2>=num3)) {
        	System.out.println("The maximum or largest number is: " + num2);
        }
        else {
        	System.out.println("The maximum or largest number is: " + num3);
        }
        
        
        
        
	}

}
