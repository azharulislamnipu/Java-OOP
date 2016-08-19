package vectorBasics;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class VectorConvertArraylist {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		
		 vector.add("Item1");
	     vector.add("Item2");
	     vector.add("Item3");
	     vector.add("Item4");
	     vector.add("Item5");
	     vector.add("Item6");
	     
	     String[] array = vector.toArray(new String[vector.size()]);
	     System.out.println("String Array Elements :\n");
	     for (String string : array) {
			System.out.println(string);
		}
	     
	     vector.add("Rahul");
	     vector.add("Steve");
	     vector.add("Jude");
	     vector.add("Locke");
	     vector.add("Mike");
	     vector.add("Robert");
	     System.out.println("String vector Elements :\n\n");
	     for (String str : vector){
	         System.out.println(str);
	      }
	     
	    List<String> list = Collections.list(vector.elements());
	     System.out.println("\nlist element \n\n");
	    for (String str1 : list) {
			System.out.println(str1);
		}
	     
	     ArrayList<String> arrayList = new ArrayList<>(vector);
	     
	     System.out.println("\n Arraylist \n\n");
	     for (String str2 : arrayList) {
			System.out.println(str2);
		}
	     
	    ListIterator<String> listIterator = vector.listIterator();
	    System.out.println("\nTraversing in Forward Direction: \n\n");
	    while (listIterator.hasNext()) {
		String str3 = (String) listIterator.next();
		System.out.println(str3);
		
	    }
	    
	    System.out.println("\nTraversing in Backward Direction: \n\n");
		while (listIterator.hasPrevious()) {
			String str4 = (String) listIterator.previous();
			System.out.println(str4);
		}

	}

}
