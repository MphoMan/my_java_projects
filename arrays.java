package myPractices;

public class arrays {

	public static void main(String[] args) {
		
			myArray();
		

	}
	
	public static void myArray() {
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("The Days of the week with their Indexes\n");
		
		System.out.println("Using for loop\n");
		
		for(int a=0; a<days.length; a++) {
			
			String index = days[a];
			
			System.out.println("The index is "+a+" of the day "+index+".");
			
		}
		
		System.out.println("Using for Each\n");
		
		for(String a: days) {
			
			System.out.println("The days of the week are: "+a);
		}
		
		System.out.println("Looping through Dimensional loop\n");
		
		String persons[][] = {
				
				{"Mpho", "25", "BSc in IT"},
				{"Kgopotso", "26" , "BSc in IT"},
				{"Bokang", "24" , "BSc in IT"}
						
		};
		
		System.out.println("The name, Age and Qualification on the list \n");
		int b = 0;
		
		while(b<persons.length) {
			for(int c=0;c<persons.length; c++) {
				
				System.out.println(persons[b][c]);
			}
			b++;
			
		}
		
		
		System.out.println("Calculating the sum of the numbers in an array\n");
		
		int[] numbers = {2,3,23,464,44,78,76,2454};
		int total =0;
		int average = 0;
         
		int d = 0;
		do {
			total+=numbers[d];
			average = total/numbers.length;
			
			d++;
		}while(d<numbers.length);
		
		System.out.println("The sum of the numbers is: " + total);
		System.out.println("The average of the numbers is: " + average);
	}
	

}
