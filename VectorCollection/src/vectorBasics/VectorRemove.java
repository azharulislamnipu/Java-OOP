package vectorBasics;

import java.util.Vector;

public class VectorRemove {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.addElement("Walter");
		vector.addElement("Anna");
		vector.addElement("Hank");
		vector.addElement("Flynn");
		vector.addElement("Tom");
		vector.addElement("halk");
		vector.addElement("ultorn");

		System.out.println("before remove ");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		vector.remove(4);
		vector.remove(5);
		System.out.println("\n\n after some remove \n");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

		Object object = vector.remove(3);
		System.out.println("\n\n  3 remove \n");

		System.out.println(object);
		
		System.out.println("\n\n after 3 remove \n");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

		// vector.removeAllElements();
		vector.clear();
		System.out.println("\n\n after remove \n");
		System.out.println(vector);
	}

}
