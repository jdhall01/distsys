package dp.bridge;

public class StackArray implements StackImpl {
	private int[] items;
	private int total = -1;
	
	public StackArray() {
		items = new int[12];
	}
	
	public StackArray(int cells) {
		items = new int[cells];
	}

	@Override
	public void push(int i) {
		if(!isFull()) {
			items[++total] = i;
		}
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		
		return items[total--];
	}

	@Override
	public int top() {
		if(isEmpty()) {
			return -1;
		}
		
		return items[total];
	}

	@Override
	public boolean isEmpty() {
		return total == -1;
	}

	@Override
	public boolean isFull() {
		return total == items.length - 1;
	}

}
