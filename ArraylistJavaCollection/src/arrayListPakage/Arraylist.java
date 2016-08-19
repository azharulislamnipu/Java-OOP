package arrayListPakage;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> np = new ArrayList<>();
		np.add(0,"Azharul");
		np.add(1,"Islam");
		np.add(2,"Nipu");
		np.add(3, "Raihan");
		System.out.println(np);
		
		np.remove(1);
		np.remove(2);
		
		System.out.println(np);
		np.set(0, "Tania");
		System.out.println(np);
		for(String var1: np){
            System.out.println(var1);
       }
		
		 ArrayList<String> al = new ArrayList<String>();
	       al.add("AB");
	       al.add("CD");
	       al.add("EF");
	       al.add("GH");
	       al.add("AB");
	       al.add("YZ");
	       System.out.println("ArrayList before remove:");
	       for(String var: al){
	            System.out.println(var);
	       }
	       
	       al.remove(0);
	       //Removing 3rd element from the remaining list
	       al.remove(2);
	       //Removing 4th element from the remaining list
	       al.remove(2);
	       System.out.println("ArrayList After remove:");
	       for(String var2: al){
	             System.out.println(var2);
	       }

	}

}
