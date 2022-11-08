package myPractices;

public class DemoBox {

	public static void main(String[] args) {

		box myObject = new box();
				
				myObject.height= 10;
				myObject.width= 20;
				myObject.depth= 25;
				
			double volume=myObject.height*myObject.width*myObject.depth;
			
			System.out.println("The value of Volume is: "+ volume +"3");

	}

}
