package lesson140319;

import java.util.ArrayList;

public class StackD {

	private ArrayList list = new ArrayList();
	
	public void push(Object item) {
		list.add(item);
	}
	
	public Object pop() {
		if (list.isEmpty()) {
			return null;
		}
		return list.remove(list.size()-1);
	}
	
	public Object top() {
		if (list.isEmpty()) {
			return null;
		}
		return list.get(list.size() -1); 
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
}
