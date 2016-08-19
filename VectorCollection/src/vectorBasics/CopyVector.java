package vectorBasics;

import java.util.Collections;
import java.util.Vector;

public class CopyVector {

	public static void main(String[] args) {
		
		Vector<String> va = new Vector<>();
		va.addElement("AB");
		va.addElement("BC");
		va.addElement("CA");
		va.addElement("FF");
		va.addElement("BB");
		va.addElement("EE");
	

		Vector<String> vb = new Vector<>();
		vb.addElement("1st");
		vb.addElement("2nd");
		vb.addElement("3rd");
		vb.addElement("4rt");
		vb.addElement("5th");
		vb.addElement("6th");
		vb.addElement("7th");
		vb.addElement("8th");
		System.out.println("before copy: "+vb);
		Collections.copy(vb, va);
		
		
		System.out.println("after copy: ");
		for (String string : vb) {
			System.out.println(string);
		}
	}

}
