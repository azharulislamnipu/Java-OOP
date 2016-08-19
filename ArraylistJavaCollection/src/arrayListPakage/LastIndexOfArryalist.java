package arrayListPakage;

import java.util.ArrayList;

public class LastIndexOfArryalist {

	public static void main(String[] args) {
		
		 ArrayList<Integer> lp = new ArrayList<Integer>();
	      lp.add(1);
	      lp.add(88);
	      lp.add(9);
	      lp.add(17);
	      lp.add(17);
	      lp.add(9);
	      lp.add(17);
	      lp.add(91);
	      lp.add(27);
	      lp.add(1);
	      lp.add(17);
	      
	      System.out.println("index OF 1 is: "+lp.lastIndexOf(1));
	      System.out.println("index OF 91 is: "+lp.lastIndexOf(91));
	      System.out.println("index OF 17 is: "+lp.lastIndexOf(17));
	      System.out.println("index OF 21 is: "+lp.lastIndexOf(27));

	}

}
