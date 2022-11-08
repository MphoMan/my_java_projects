package myPractices;
import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		
		System.out.println("This is the program used to solve quadratic or hyperpolar problem\n ");
		
		Scanner allowUser = new Scanner(System.in);
		
		System.out.println("Enter the value/coefficient of a:");
		int a = allowUser.nextInt();
		
		System.out.println("Enter the value/coefficient of b:");
		int b = allowUser.nextInt();
		
		System.out.println("Enter the value/coefficient of c:");
		int c = allowUser.nextInt();
		
		quadraticSolution(a,b, c);
		

	}

	public static void quadraticSolution(int a,int b,int c) {
		
		
		System.out.println("Your equation is y= "+ a+ "x^2 + "+ b +"x"+" + "+ c +"\n");
		
		System.out.println("Y-Intercept, When x = 0\n");
		int cont = a*(int)Math.pow(0, 2) + b*0 + c;
		System.out.println("y="+ cont+"\n");
		System.out.println("Values are: (0;"+ cont +")\n");
		
		
		System.out.println("Turning point\n");
		int xtp = -b/2*a;
		System.out.println("When x value ="+ xtp +"\n");
		int ytp = a*(int)Math.pow(xtp,2) + b*xtp + c;
		System.out.println("value of y="+ ytp);
		System.out.println("Values are: ("+ xtp +";"+ ytp +")\n");
		
		System.out.println("X-Intercept, When y = 0");
		System.out.println(a+"x^2 + "+ b +"x"+ " + "+ c+ " =0\n");
		int x1 = (-b + (int)Math.sqrt((int)Math.pow(b, 2)- 4*a*c ))/2;
		System.out.println("The value of x1="+ x1);
		int x2 = (-b - (int)Math.sqrt((int)Math.pow(b, 2)- 4*a*c ))/2;
		System.out.println("The value of x2="+ x2);
		
		System.out.println("The values of X-Intercepts are as follow:");
		System.out.println("("+ x1 +"; 0 or "+ x2 +"; 0)");
		
	}
}
