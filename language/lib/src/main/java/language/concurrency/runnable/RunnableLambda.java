package language.concurrency.runnable;

public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(() -> System.out.println("Inside Runnable lambda..."));
		
		t.start();
	}

}
