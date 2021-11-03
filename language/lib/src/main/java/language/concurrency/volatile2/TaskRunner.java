package language.concurrency.volatile2;

//https://www.baeldung.com/java-volatile
public class TaskRunner {
	
	private volatile static int number;
	private volatile static boolean ready;
	
	private static class Reader extends Thread {

		@Override
		public void run() {
			
			// TODO Auto-generated method stub
			while(!ready) {
				Thread.yield();
			}
			System.out.println(number);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			new Reader().start();
		}
		
		number = 7;
		ready = true;
	}

}
