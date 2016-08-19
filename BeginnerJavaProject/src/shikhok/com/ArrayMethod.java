package shikhok.com;

import java.util.Scanner;

public class ArrayMethod {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int [] num= {1,2,3,34,56,353};
		char [] cards = {'A','B','C','1','2'};
		
		System.out.println("Zero Position is "+num[0]+"  and Five Position is "+num[5]);

		System.out.println(cards [2]);
		
		
		int first,second;
		System.out.println("Enter Your First Number:");
		first= input.nextInt();
		System.out.println("Enter Your Second Number:");
		second= input.nextInt();
		
		boolean statemen = method(first,second);
		System.out.println(statemen);
		
		
		int call= calculate(first);
		System.out.println(call);
		
		
	}

	
	public static int calculate(int first) {
		int repite= first+2;
		return repite;
	}

	private static boolean method(int first, int second) {
		boolean result = first >second;
		return result;
	}

}
