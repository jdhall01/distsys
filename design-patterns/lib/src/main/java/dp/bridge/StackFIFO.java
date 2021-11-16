package dp.bridge;

public class StackFIFO extends Stack {
	private StackImpl stackImpl = new StackList();
	
	public StackFIFO() {
		super("array");
	}
	
	public int pop() {
		while(!isEmpty()) {
			stackImpl.push(super.pop());
		}
		int ret = stackImpl.pop();
		while(!stackImpl.isEmpty()) {
			push(stackImpl.pop());
		}
		return ret;
	}
}
