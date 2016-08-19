package vectorBasics;

import java.util.Enumeration;
import java.util.Vector;


public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(2);
		vec.addElement("apple");
		vec.addElement("orrange");//2
		vec.addElement("Banana");//2+2
		vec.addElement("mango");//4+2
		vec.addElement("Fig");//6+2
		
     	
		for (String string : vec) {
			System.out.println(string);
		}
		System.out.println("Before addition");
		System.out.println("vector size: "+vec.size());
		System.out.println("vector capacity: "+vec.capacity());
		
		vec.addElement("Frute1");
		vec.addElement("Frute2");
		vec.addElement("Frute3");
		vec.addElement("Frute4");
		
		System.out.println("after addition");
		System.out.println("vector size: "+vec.size());
		System.out.println("vector capacity: "+vec.capacity());
		
		
		Enumeration<String> en = vec.elements();

		 System.out.println("\nElements are:");
		 
		 while (en.hasMoreElements()) {
			String string = (String) en.nextElement();
			System.out.println(string);
		}
	}

}
