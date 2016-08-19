package hashmapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Existvalue {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	
		
		HashMap<Integer, String> hMap =  new HashMap<>();
		
		hMap.put(8, "ab");
		hMap.put(6, "bc");
		hMap.put(5, "ca");
		hMap.put(3, "BB");
		hMap.put(4, "CC");
		hMap.put(1, "DD");

		System.out.println("Forloop: \n");
		for (Map.Entry<Integer, String> me : hMap.entrySet()) {
		System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
		}
		
		System.out.println("While loop: \n");
		
		Set set = hMap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {

		Map.Entry me2 = (Map.Entry) iterator.next();
		System.out.println("Key: " + me2.getKey() + " & Value: "
		+ me2.getValue());
		}
		
		
		boolean flag = hMap.containsKey(3);
	    System.out.println("Key 3 exists in HashMap? : " + flag);
	 
	    boolean flag2 = hMap.containsKey(6);
	    System.out.println("Key 6 exists in HashMap? : " + flag2);
	 
	    boolean flag3 = hMap.containsKey(9);
	    System.out.println("Key 9 exists in HashMap? : " + flag3);
	    
	    boolean flag4 = hMap.containsKey(10);
	    System.out.println("Key 10 exists in HashMap? : " + flag4);

	   

	}

}
