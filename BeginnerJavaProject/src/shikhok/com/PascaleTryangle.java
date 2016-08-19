package shikhok.com;

import java.util.Scanner;

public class PascaleTryangle {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
	
		prln("give -1 to exit ");
		prln("Please Enter pascle length Number: ");
		int number = myScanner.nextInt();
		while (number!=-1) {
			if (number<-1 || number>20) {
				prln("Please enter between -1 to 20");
				number = myScanner.nextInt();
				continue;
			}
			printPascaleTriangle(number);
			prln("\n\n");
			prln("Please enter between -1 to 20");
			number = myScanner.nextInt();
		}

	}

	static void printPascaleTriangle(int length){
		int [][] pascal = new int[length][length];
		for (int i = 0; i < length; i++) {
			pascal[0][i]=1;
			pascal[i][0]=1;
			
		}
		for (int row = 1; row < length; row++) {
			for (int column = 1; column < length-row; column++) {
				pascal[row][column]=pascal[row][column-1]+pascal[row-1][column];
			}
		}
		for (int row = 0; row < length; row++) {
			for (int column = 0; column < length-row; column++) {
				pr(pascal[row][column]+"\t");
			}
			prln("\n");
		}
	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}

	static void pr(Object anyObject){
		System.out.print(anyObject);
	}
}
