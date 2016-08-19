package arrayListPakage;

import java.util.ArrayList;




public class ArraylistLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(2);
		arraylist.add(32);
		arraylist.add(20);
		arraylist.add(50);
		arraylist.add(40);
		arraylist.add(35);
		
		System.out.println("For Loop \n \n");
		for(int counter = 0; counter < arraylist.size(); counter++){
			System.out.println(" Value Of index "+counter +" is:"+arraylist.get(counter));
		}
		
		 System.out.println("\n \n Advanced For Loop \n"); 		
	      for (Integer num : arraylist) { 		      
	           System.out.println(num); 		
	      }
		
		System.out.println("\n \n While Loop \n");
		int count =0;
		while (count <arraylist.size()) {
			System.out.println(" Value Of index "+count +" is:"+arraylist.get(count));
			count++;
		}


	}

}
