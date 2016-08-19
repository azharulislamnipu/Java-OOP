package hashmapCollection;

import java.util.*;

public class Hashmapclass {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(12, "Azhar");
		hashMap.put(1, "nipu");
		hashMap.put(3, "Riya");
		hashMap.put(40, "Noushin");
		hashMap.put(25, "Rabbi");

		//Iterator iterator = hashMap.entrySet().iterator();

		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {

			Map.Entry me2 = (Map.Entry) iterator.next();
			System.out.println("Key: " + me2.getKey() + " & Value: "
					+ me2.getValue());
		}

		String var = hashMap.get(3);
		System.out.println(var);

		hashMap.remove(40);
		System.out.println("after removal key value 40:");
		

		Set set2 = hashMap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}

	}

}
