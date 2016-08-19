package arrayListPakage;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvetArrayToList {

	public static void main(String[] args) {
		String cityName[] = {"Dhaka","Khulna","Jessore","Rajshahi","Sylet"};
		
		ArrayList<String> citylist = new ArrayList<>(Arrays.asList(cityName));
		
		citylist.add("New City");
		citylist.add("Barishal");
		
		for (String string : citylist) {
			System.out.println(string);
		}
		
		System.out.println("\n\n\n");
		ArrayList<String> citylist1 = new ArrayList<>();
		
		for (int i = 0; i < cityName.length; i++) {
			citylist1.add(cityName[i]);
			
		}
		for (String string2 : citylist1) {
			System.out.println(string2);
		}

	}

}
