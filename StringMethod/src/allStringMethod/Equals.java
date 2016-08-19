package allStringMethod;

public class Equals {

	public static void main(String[] args) {
		
		String str1 = "Helo";
		String str2 = "Hi";
		String str3 = "Helo";
		String str4 = "helo";
		
		
		System.out.println("str1 equls to str2 = "+str1.equals(str2));
		System.out.println("str1 equls to str3 = "+str1.equals(str3));
		System.out.println("str2 equls to str3 = "+str2.equals(str3));
		
		
		System.out.println("str1 equls to helo = "+str1.equals("helo"));
		System.out.println("str2 equls to hi = "+str2.equals("hi"));
		System.out.println("str1 equls to str2 = "+str1.equals("helo"));
		
		
		System.out.println("str1 equls to str4 = "+str1.equalsIgnoreCase(str4));
		System.out.println("str2 equls to hi = "+str2.equalsIgnoreCase(str2));
		System.out.println("str1 equls to wecome = "+str1.equalsIgnoreCase("welcome"));
		System.out.println("str1 equls to str4 = "+str1.equalsIgnoreCase("helo"));
		
		
	}

}
