package language.concurrency.runnable;

//http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html
public class RunnableClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside RunnableClass.run()...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(new RunnableClass());
		t.start();
	}

}
