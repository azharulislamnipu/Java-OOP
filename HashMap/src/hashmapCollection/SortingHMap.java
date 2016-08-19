package hashmapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortingHMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        
        
        HashMap<Integer, String> hmap2 = new HashMap<>();
        hmap2.put(3, "B");
        hmap2.put(10, "S");
        hmap2.put(6, "D");
        
        hmap2.putAll(hmap); //copy hmap to hmap2
        
        System.out.println("Before Sorting:");
        Set set = hmap2.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
              Map.Entry me = (Map.Entry)iterator.next();
              System.out.print(me.getKey() + ": ");
              System.out.println(me.getValue());
        }
        
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap2);
        
        System.out.println("\nAfter Sorting:\n\n");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
        }
	}

}
