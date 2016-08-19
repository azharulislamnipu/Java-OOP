package shikhok.com;

public class Operator {

	public static void main(String[] args) {
		//some operator +,-,>,<,>=,<=,=,!,!=,/,*,%,
		int x,y;
		x=5;
		y=23;
		
		/*
		 * 
		 * 
		 * brif comnt if u use it
		 * 
		 * 
		 */
		
		System.out.println("Sum="+(x+y));
		System.out.println("Subs= "+(x-y));
		System.out.println(x/y);
		System.out.println(x*y);
		x=x+3;
		System.out.println(x);
		x-=2;
		System.out.println(x);
		System.out.println("Reminder="+(y%x));
		
		boolean var1= 3>4;
		boolean var2= 3<4;
		boolean var3= 3!=4;
		boolean var4= 3>=4;
		boolean var5= 3<=4;
		System.out.println("var1-"+var1+"  var2-"+var2+"  var3-"+var3+"  var4-"+var4+"  var5-"+var5);
		
		y++;//y=y+1 y+=1;
	
		System.out.println(y);
		y--;
		System.out.println(y);
	}

}
