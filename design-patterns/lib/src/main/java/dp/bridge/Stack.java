package dp.bridge;

public class Stack {
	private StackImpl impl;
	
	public Stack(String type) {
		if(type.equals("array")) {
			impl = new StackArray();
		} else if(type.equals("list")) {
			impl = new StackList();
		} else {
			System.out.println("Stack: unknown parameter");
		}
	}
	
	public void push(int i) {
		impl.push(i);
	}
	
	public int pop() {
		return impl.pop();
	}
	
	public int top() {
		return impl.top();
	}
	
	public boolean isEmpty() {
		return impl.isEmpty();
	}
	
	public boolean isFull() {
		return impl.isFull();
	}
}
