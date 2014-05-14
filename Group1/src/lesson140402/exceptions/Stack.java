package lesson140402.exceptions;

public class Stack {

	Object[] items;
	int tos = -1; // Top Of Stack
	
	public Stack(int maxsize) {
		items = new Object[maxsize];
	}
	
	public void push(Object object) throws MyStackOverflowException {
		if (tos + 1 == items.length) {
			throw new MyStackOverflowException(items.length, tos);
		}
		tos++;
		items[tos] = object;
	}
	
	public Object pop() {
		Object result = items[tos];
		items[tos] = null;
		tos--;
		return result;
	}
	
	public Object top() throws StackIsEmptyException {
		if (isEmpty()) {
			throw new StackIsEmptyException();
		}
		return items[tos];
	}
	
	public int size() {
		return tos + 1;
	}
	
	public boolean isEmpty() {
		return tos == -1;
	}
	
}
