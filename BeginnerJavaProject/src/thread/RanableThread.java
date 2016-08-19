package thread;

import java.util.Scanner;

public class RanableThread {

	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		CustomRunableObject firstObject = new CustomRunableObject("First Name",
				0);
		CustomRunableObject ScondObject = new CustomRunableObject("Scond Name",
				200);
		CustomRunableObject ThirdObject = new CustomRunableObject("Third Name",
				100000);
		// CustomRunableObject FourthObject = new
		// CustomRunableObject("Fourth Name",500);

		Thread firstThread = new Thread(firstObject);
		Thread secondThread = new Thread(ScondObject);
		Thread thirdThread = new Thread(ThirdObject);
		Thread fourthThread = new Thread(firstObject);

		firstThread.start();
		secondThread.start();
		thirdThread.start();
		fourthThread.start();
		System.out.println("plese enter your command: ");
		String comandString = myScanner.nextLine();

		while (!comandString.toLowerCase().equals("exit")) {
			if (comandString.equals("1")) {
				System.out.println("Counter In Thread 1: "
						+ firstObject.getCounter());
				// threadStatus();
			} else if (comandString.equals("2")) {
				System.out.println("Counter In Thread 2: "
						+ ScondObject.getCounter());
				// threadSatus();
			} else if (comandString.equals("3")) {
				System.out.println("Counter In Thread 3: "
						+ ThirdObject.getCounter());
				// threadStatus();
			} else if (comandString.equals("1S")) {
				firstThread.interrupt();
				System.out.println("Thread 1 Stopped");
				// threadStatus();
			} else if (comandString.equals("2S")) {
				secondThread.interrupt();
				System.out.println("Thread 2 Stopped");
				// threadStatus();
			} else if (comandString.equals("3S")) {
				thirdThread.interrupt();
				System.out.println("Thread 3 Stopped");
				// threadStatus();
			} else if (comandString.equals("4S")) {
				fourthThread.interrupt();
				System.out.println("Thread 4 Stopped");
			} else {
				System.out.println("Please Enter Your Perfect Command");
			}
			System.out.println("plese enter your command: ");
			comandString = myScanner.nextLine();
		}
	}

}
