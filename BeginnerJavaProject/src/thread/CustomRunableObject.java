package thread;


public class CustomRunableObject implements Runnable{

	//private boolean stopFlag = false;
	private String Name;
	private int counter;

	public CustomRunableObject(String name, int counter) {
		super();
		Name = name;
		this.counter = counter;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			
			counter++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			
		}
		
	}

}
