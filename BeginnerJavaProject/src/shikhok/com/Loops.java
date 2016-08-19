package shikhok.com;

import java.util.Scanner;

public class Loops {

	final static Scanner myScanner= new Scanner(System.in); 
	public static void main(String[] args) {
		
		int[] arraynumber = new int [100];
		int i=100;
		
		while (i>0) {
			arraynumber[i-1]=(i-1)*7;
			i--;
		}
		
		while (i<100) {
			prln("array["+i+"] : "+arraynumber[i]);
			i++;
		}
		
		int j=2;
		do {
			prln("Do while :"+j);
			j--;
		} while (j<2&&j>0);
		
		j=2;
		while (j<2&&j>0) {
			prln("just while :"+j);
			j--;
		}
		
		for(int k=0; k<10;k++){
			prln("array["+k+"] : "+arraynumber[k]);
		}
		


		int [][] twoDArray = new int[4][5];
		

		prln("Please Enter Your Number:");
		for(int row=0;row<4;row++){
			for(int column=0;column<5;column++){
				pr("twoDArray["+row+"]["+column+"] :");
				twoDArray[row][column]= myScanner.nextInt();
			}
			pr("\n");
		}
		
		
		try {
			
			for(int row=0;row<4;row++){
				for(int column=0;column<5;column++){
					pr(twoDArray[row][column]+"\t");
				}
				pr("\n");
			}
			
		} catch (Exception unknownException) {
		
			unknownException.printStackTrace();
		}
		
		prln("thank You for using our programe");
		
		
	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
