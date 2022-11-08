package myPractices;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {

		arrayList();

	}
	
	
	public static void arrayList() {
		
		 ArrayList<String> students = new ArrayList<String>();
		 
		 students.add("Mpho");
		 students.add("Kgopotso");
		 students.add("Bokang");
		 
		 //clearing all the elements in an arraylist
		 //students.clear();
		 //Setting new element to the arrayList
		 //students.set(1, "Karabo");
		 //getting a specific element in an arraylist
		 //System.out.println(students.get(0));
		 //Removing an element from an arraylist
		 //students.remove(0);
		  System.out.println(students.size());
		  Collections.sort(students);
		 for(String a : students) {
		 
		 System.out.println(a);
		 }
		
	} 

}
