package lesson140319;

import java.util.ArrayList;

public class Stack extends ArrayList {
	
	public void push(Object item) {
		super.add(item);
	}
	
	public Object pop() {
		if (super.isEmpty()) {
			return null;
		}
		return super.remove(super.size()-1);
	}
	
	public Object top() {
		return super.get(super.size()-1);
	}
	
	@Override
	public Object remove(int index) {
		throw new UnsupportedOperationException();
	}
	

	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.remove(0);
		
	}
	
}
