package language.concurrency;

public class WaitNotifyDemo {

	private int count;
	private StringBuffer buf;
	private volatile boolean stop;
	
	public WaitNotifyDemo() {
		count = 0;
		buf = new StringBuffer();
		stop = false;
	}
	
	private static class Producer implements Runnable {
		
		private WaitNotifyDemo monitor;
		
		public Producer(WaitNotifyDemo obj) {
			monitor = obj;
		}

		@Override
		public void run() {
			while(!monitor.stop) {
				synchronized(monitor) {
					
					//output when commented
					//keep producing, dont wait for it to be consumed
					/*
					 *  0 1 2 3 4 5 6 7 8 9 10 11 12 13
						 14 15 16 17
						 18 19 20 21 22 23 24
						 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51
						 52 53 54 55 56 57
						 58 59 60 61
						 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87
						 88 89 90 91 92 93
						 94 95 96 97 98
						 99 100
					 */
					
					//output when uncommented
					//produce one, wait for it to be consumed
					/*
					 * 0
						 1
						 2
						 3
						 4
						 5
						 6
						 7
						 8
						 9
						 10
						 11
						 ...
						 ...
					 */
					
					
					if(!monitor.buf.isEmpty()) {
						try {
							//System.out.println("Producer waiting...");
							monitor.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}//if
					
					monitor.buf.append(" " + String.valueOf(monitor.count));
					monitor.count++;
					monitor.notify();
					
					if(monitor.count > 100) {
						monitor.stop = true;
					}
				}

				/*
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
	}
	
	private static class Consumer implements Runnable {
		
		private WaitNotifyDemo monitor;
		
		public Consumer(WaitNotifyDemo obj) {
			monitor = obj;
		}

		@Override
		public void run() {
			while(!monitor.stop) {
				synchronized (monitor) {
					if(monitor.buf.isEmpty()) {
						try {
							//System.out.println("Consumer waiting...");
							monitor.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}					
					}//if
					System.out.println(monitor.buf.toString());
					monitor.buf.setLength(0);
					monitor.notify();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitNotifyDemo monitor = new WaitNotifyDemo();
		Thread t1 = new Thread(new WaitNotifyDemo.Producer(monitor));
		Thread t2 = new Thread(new WaitNotifyDemo.Consumer(monitor));
		
		t1.start();
		t2.start();
	}

}
