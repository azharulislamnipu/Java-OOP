package vectorBasics;

import java.util.Collections;
import java.util.Vector;

public class SortingVector {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		 
	    //Add elements to Vector
	    vector.add("Walter");
	    vector.add("Anna");
	    vector.add("Hank");
	    vector.add("Flynn");
	    vector.add("Tom");
	    System.out.println("Vector elements before sorting: ");
	    for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
	    

	    Collections.sort(vector);
//	    Collections.sort(vector,Collections.reverseOrder());
	    
	    System.out.println("\n\n Vector elements after sorting: \n");
	    for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
	    
	    vector.set(1, "zery");
	    vector.set(3, "curue");
	    
	    System.out.println("\n\n Vector elements after Updating : \n");
	    for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
	    
	}

}
