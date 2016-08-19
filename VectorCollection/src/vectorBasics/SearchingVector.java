package vectorBasics;

import java.util.Vector;

public class SearchingVector {

	public static void main(String[] args) {

	Vector<String> vector = new Vector<String>();

	// Add elements to Vector
	vector.add("Kate");
	vector.add("Patt");
	vector.add("Kluge");
	vector.add("Karon");
	vector.add("Patt");
	vector.add("Monica");
	vector.add("Patt");
		
	int first_index = vector.indexOf("Patt");
	System.out.println("First Occurrence of Patt at index: "+first_index);
	
	int last_index = vector.lastIndexOf("Patt");
    System.out.println("Last Occurrence of Patt at index: "+last_index);
    
    int after_index = vector.indexOf("Patt", 2);
    System.out.println("Occurrence after index 2: "+after_index);
    
    int before_index = vector.lastIndexOf("Patt", 6);
    System.out.println("Occurrence before index 6: "+before_index);

 }

}
