package language.concurrency.thread;

public class MyThread extends Thread {
	
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + ": running MyThread.run()..." + Thread.currentThread().getId());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread tStart = new MyThread("START");
		tStart.start();//start() starts a new thread
		Thread tRun = new MyThread("RUN");
		tRun.run();//run() runs the run() method in the current thread
		
		System.out.println("running main()..." + Thread.currentThread().getId());
	}

}
