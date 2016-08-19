package shikhok.com;

import java.util.Scanner;

public class BlocksOperator {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		String Myname;
		prln("Enter Your Name:");
		Myname = input.nextLine();
		
		prln("the length of Myname "+Myname.length());
		
		if(Myname.length()<15 && Myname.length()>5){  //conditional operator
			prln("Your Name is perfect");
		}
		else if(Myname.length()<2){
			prln("Your Name is Short");
		}else{
			if (Myname.length()<5) {
				prln("name is right");
			}
			else {
				prln("your name is ok");
			}
				
		
			}


	if(Myname.length()==7 || Myname.length()==9){
		prln("U r lucky name");
	}else {
		switch (Myname.length()) {
		case 11:
			prln("one");
			break;
		case 12:
			prln("two");
			break;
		case 13:
			prln("three");
			break;
		case 14:
			prln("Four");
			break;
		case 15:
			prln("five");
			break;
		case 16:
			prln("six");
			break;

		default:
			prln("dont match");
			break;
		}

	}
	
	int a=2;
	int b= 3;
	a+=(++b);
	prln("A: "+a+" B: "+b);
	a+=(b++);
	prln("A: "+a+" B: "+b);
}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
