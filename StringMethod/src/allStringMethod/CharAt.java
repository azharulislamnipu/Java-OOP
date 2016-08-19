package allStringMethod;

public class CharAt {

	public static void main(String[] args) {
		String str = "I am a student Of daffodil International University";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(3);
		
		char  ch3 = str.charAt(11);
		char ch4 = str.charAt(15);
		char ch5 = str.charAt(20);
		
		System.out.println("0 no index value: "+ch1);
		System.out.println("3 no index value: "+ch2);
		System.out.println("11 no index value: "+ch3);		
		
		System.out.println("15 no index value: "+ch4);
		System.out.println("20 no index value: "+ch5);
		
	}

}
