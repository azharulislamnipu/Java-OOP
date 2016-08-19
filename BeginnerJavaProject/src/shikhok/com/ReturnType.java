package shikhok.com;

public class ReturnType {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		b = calculatenumber(a, b);

		prln(calculatenumber(a, b));
		prln(a);
		
		prln(a<b?"A is less than B": "B is less than A");
		prln(compair(a, b));
		
		prln(a<b? a:b);
		prln(compaird(a, b));

	}
	static String compair(int a, int b){
		if (a<b) {
			return "A is less than B";
		}else {
			return "B is less then A";
		}
		
	}
	static int compaird(int a, int b){
		if (a>b) {
			return a;
		}else {
			return b;
		}
		
	}
	static int calculate(int number1,int number2){
		int result = number1 +number2;
		return result;
		
	}
	static int calculatenumber(int number1,int number2){
		number1 += number2;
		
		return number1;
		
	}
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
