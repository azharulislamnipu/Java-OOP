package sumOfArray;

public class ForeachLoop {

	public static void main(String[] args) {
		
		int [] array = {10,15,20,25,30,35,40};
		
		int sum = 0;
		for (int num : array) {
			
			sum += num;	
			System.out.println(num);
		}
		System.out.println("Sum Of Array: "+sum);

	}

}
