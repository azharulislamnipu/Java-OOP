package innerClassPakage;

public class Outerclass {
	
	private static int num = 120;
	public static class InnerClass{
		
		public void disply() {
			
			System.out.println("My number is: "+num);
		}
	}
	public static void main(String args[]){
	      InnerClass inClass = new InnerClass();
	      inClass.disply();
	
	   }

	
}
