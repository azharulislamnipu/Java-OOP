package arrayListPakage;

import java.util.ArrayList;

public class GetMethodArralist {

	public static void main(String[] args) {
		
		ArrayList<String> gt = new ArrayList<String>();
		   gt.add("pen");
	       gt.add("pencil");
	       gt.add("ink");
	       gt.add("notebook");
	       gt.add("book");
	       gt.add("books");
	       gt.add("paper");
	       gt.add("white board");
	       
	       System.out.println("First Element: "+gt.get(0));
	       System.out.println("2nd Element: "+gt.get(1));
	       System.out.println("3rd Element: "+gt.get(3));
	       System.out.println("4th Element: "+gt.get(4));
	       System.out.println("5th Element: "+gt.get(5));
	       System.out.println("7th Element: "+gt.get(7));
	       
	       gt.set(3, "song");
	       gt.set(6, "plyer");
	       gt.set(7, "mp3");
	      
	       for (String string : gt) {
			System.out.println(string);
		}

	}

}
