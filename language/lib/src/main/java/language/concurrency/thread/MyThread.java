package language.concurrency.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running MyThread.run()...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new MyThread();
		t.run();
	}

}
