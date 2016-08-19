package shikhok.com;

import java.util.Scanner;


public class BookStore {

	static String[]books = {"Java","Android","Python"};
	
	final static double studentDisciount=0.3;
	final static double teacherDisciount=0.4;
	final static double aleinDisciount=0.0;
	
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		prln("******Welcom to Our BookStore********".toUpperCase());

		prln("Which Book do u want??? ");
		String choice = input.nextLine();
		
		if(books[0].toLowerCase().equals(choice.toLowerCase())){
			prln("U opted for "+books[0]+" Book");
			calculateprice(books[0]);
		}else if(books[1].toLowerCase().equals(choice.toLowerCase())){
			prln("U opted for "+books[1]+" Book");
			calculateprice(books[1]);
		}else if(books[2].toLowerCase().equals(choice.toLowerCase())){
			prln("U opted for "+books[2]+" Book");
			calculateprice(books[2]);
		}else {
			prln("we r Sorry, we dont have that book");
		}
	}

	static void calculateprice(String bookname){
		prln("You r Student, teache and Alein: \n answere:");
		String answer = input.nextLine();
		
		double price=200;
		
		if (answer.toLowerCase().equals("teacher")) {
			price = price-(price*teacherDisciount);
			showprice(price);
			
		}else if (answer.toLowerCase().equals("student")){
			price = price-(price*studentDisciount);
			showprice(price);
		}else if (answer.toLowerCase().equals("alein")){
			price = price-(price*aleinDisciount);
			showprice(price);
		}else {
			prln("sorry, you have not save");
		}
	}

	static void showprice(double price){
		prln("Your paybale price is: "+price);
		prln("\n********** thank You for Shoping From our Book Store ********".toUpperCase());
	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}
}

