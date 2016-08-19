package threadDebugging;

import java.util.Scanner;


public class FirstClass {
	
	static Scanner myScanner = new Scanner(System.in);
	private static OurThread thread1 = new OurThread("Child 1",0,1,500,true);
	private static OurThread thread2 = new OurThread("Child 2",100,2,1000,true);
	private static OurThread thread3 = new OurThread("Child 3",1000,100,2000,true);
	
	public static void main(String[] args) {
		
		
		thread1.start();thread2.start();thread3.start();
		
		System.out.println("plese enter your command: ");
		String comandString = myScanner.nextLine();
		
		while (!comandString.toLowerCase().equals("exit")) {
			if(comandString.equals("1")){
				System.out.println("Counter In Thread 1: "+thread1.getCounter());
				threadStatus();
			}else if(comandString.equals("2")){
				System.out.println("Counter In Thread 2: "+thread2.getCounter());
				threadStatus();
			}else if(comandString.equals("3")){
				System.out.println("Counter In Thread 3: "+thread3.getCounter());
				threadStatus();
			}else if(comandString.equals("1S")){
				thread1.stopThread();				
				System.out.println("Thread 1 Stopped");
				threadStatus();
			}else if(comandString.equals("2S")){
				thread2.stopThread();
				System.out.println("Thread 2 Stopped");
				threadStatus();
			}else if(comandString.equals("3S")){
				thread3.stopThread();
				System.out.println("Thread 3 Stopped");
				threadStatus();
			}else {
				System.out.println("Please Enter Your Perfect Command");
			}
			comandString = myScanner.nextLine();
		}
		while (thread1.isAlive()) {
			
		}
		System.out.println("Thread 1 is Stopped");
		while (thread2.isAlive()) {
			
		}
		System.out.println("Thread 2 is Stopped");
		while (thread3.isAlive()) {
			
		}
		System.out.println("Thread 3 is Stopped");
		
		System.out.println("Main thread Exited");
	}

	private static void threadStatus() {
		System.out.println("Thread 1 is Alive "+thread1.isAlive());
		System.out.println("Thread 2 is Alive "+thread2.isAlive());
		System.out.println("Thread 3 is Alive "+thread3.isAlive());
	}
}
