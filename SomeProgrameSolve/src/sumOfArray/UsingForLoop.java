package sumOfArray;

import java.util.Scanner;

public class UsingForLoop {

	static Scanner mScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [] array = new int[10];
		int sum = 0;
		
		
		System.out.println("Enter Your Element:");
		for (int i = 0; i < array.length; i++) {
			array[i] = mScanner.nextInt();
		}
		for (int num : array) {
			sum += num;
			System.out.println(num);
		}
		

		System.out.println("Sum Of Array: "+sum);
	}

}
