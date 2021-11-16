package dp.bridge;

public class StackList implements StackImpl {
	private Node last;

	@Override
	public void push(int i) {
		if(last == null) {
			last = new Node(i);
		} else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
			/*
			Node node = new Node(i);
			last.next = node;
			node.prev = last;
			last = node;
			*/
		}
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int ret = last.value;
		last = last.prev;
		
		//to have the popped Node GC-ed. this statement is missing 
		//on the website https://sourcemaking.com/design_patterns/bridge/java/2
		if(last != null) {
			last.next = null;
		}
		
		return ret;
	}

	@Override
	public int top() {
		if(isEmpty()) {
			return -1;
		}
		return last.value;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
