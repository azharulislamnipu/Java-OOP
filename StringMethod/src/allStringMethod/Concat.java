package allStringMethod;

public class Concat {

	public static void main(String[] args) {
		
		String str1 = "Welcome";
		str1 = str1.concat("to");
		str1 = str1.concat(" Java Programing");
		System.out.println(str1);
		
		String str2 = "thanx";
		String str3 = " Coming";
		str2 = str2.concat(" for");
		str2 = str2.concat(str3);
		
		System.out.println(str2);

	}

}
