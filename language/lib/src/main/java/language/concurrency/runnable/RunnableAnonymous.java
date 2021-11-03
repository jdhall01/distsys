package language.concurrency.runnable;

public class RunnableAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside anonymous Runnable instance...");
			}
		});
		
		t.start();
	}

}
