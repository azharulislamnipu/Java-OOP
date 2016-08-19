package arrayListPakage;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
	
		ArrayList<String> aList = new ArrayList<>();
		aList.add("nipu");
		aList.add("Arif");
		aList.add("Sumon");
		aList.add("China");
		aList.add("Tania");
		aList.add("Miraz");
		
		System.out.println("Before Sorting List is: \n");
		for (String var : aList) {
			System.out.println(var);
		}
		
		System.out.println("\n After Sorting List is: \n");
		Collections.sort(aList);
		
		for (String var2 : aList) {
			System.out.println(var2);
		}
		
		System.out.println("\n After Sorting Decending order List is: \n");
		
		Collections.sort(aList, Collections.reverseOrder());
		for (String var3 : aList) {
			System.out.println(var3);
		}

	}

}
