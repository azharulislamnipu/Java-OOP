package arrayListPakage;

import java.util.ArrayList;

public class ArralistObject {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
	       al.add("AA");
	       al.add("BB");
	       al.add("CC");
	       al.add("DD");
	       al.add("EE");
	       al.add("FF");
	       System.out.println("ArrayList before remove:");
	       for(String var: al){
	           System.out.println(var);
	       }
	      
	       al.remove("AA");
	       
	       al.remove("FF");
	      
	       al.remove("CC");
	       
	       boolean b=al.remove("GG");
	       System.out.println("Element GG removed: "+b);
	       System.out.println("ArrayList After remove:");
	       for(String var2: al){
	           System.out.println(var2);
	       } 

	}

}
