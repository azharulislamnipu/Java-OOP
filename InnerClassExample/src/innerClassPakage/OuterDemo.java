package innerClassPakage;

public class OuterDemo {
	public void methodOuter(){
		InnerDemo iDemo = new InnerDemo();
		iDemo.seeinnerMethod();
	}

	public static void main(String[] args) {
		OuterDemo oDemo = new OuterDemo();
		oDemo.methodOuter();

	}
	public class InnerDemo{
		public void seeinnerMethod() {
			System.out.println("I am innerClass Method");
		}
	}

}
