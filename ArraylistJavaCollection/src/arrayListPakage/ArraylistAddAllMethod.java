package arrayListPakage;

import java.util.ArrayList;

public class ArraylistAddAllMethod {

	public static void main(String[] args) {
		 ArrayList<String> a11 = new ArrayList<String>();
	       a11.add("Apple");
	       a11.add("Orange");
	       a11.add("Grapes");
	       a11.add("Mango");
	       System.out.println("ArrayList1 before addAll:"+a11);

	       //ArrayList2 
	       ArrayList<String> al2 = new ArrayList<String>();
	       al2.add("Fig");
	       al2.add("Pear");
	       al2.add("Banana");
	       al2.add("Guava");
	       System.out.println("ArrayList2 content:"+al2);
	       
	       a11.addAll(2, al2);
	       
		System.out.println("After AddAll list content:"+a11);
	       

	}

}
