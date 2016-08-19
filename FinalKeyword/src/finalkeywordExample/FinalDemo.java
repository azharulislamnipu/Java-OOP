package finalkeywordExample;

public class FinalDemo {

	final static int var1 = 1000; // we cant change value
	static final int var2;
	static {
		
		var2 = 200;
	}
	public void method() {
		
		int var = 200;
		var += var1;
		System.out.println("Var: "+var+" var2= "+var2);
	}
	public static void main(String[] args) {
		FinalDemo fDemo = new FinalDemo();
		fDemo.method();

	}

}
