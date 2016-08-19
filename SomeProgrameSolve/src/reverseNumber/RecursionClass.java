package reverseNumber;

public class RecursionClass {

	public static void recursive(int number) {
		
		if (number < 10) {
		System.out.println(number);	
		}
		else {
			 System.out.print(number % 10);
	           //Method is calling itself: recursion
	           recursive(number/10); //wonMethod class level data
		}
	}
}
