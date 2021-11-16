package dp.bridge;

public class StackHanoi extends Stack {
	private int totalRejected;
	
	public int reportRejected() {
		return totalRejected;
	}

	public StackHanoi() {
		super("array");
	}
	
	public void push(int i) {
		if(!isEmpty() && i > top()) {
			totalRejected++;
		} else {
			super.push(i);
		}
	}
	
}
