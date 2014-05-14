package lesson140407.exceptions;

import lesson140331.innerlocal.MyList;

public class MyQueue extends MyList {
	
	public static class QueueOverflowException extends RuntimeException {
	}

	private final int _maxsize;
	private int _count = 0;

	public MyQueue(int maxsize) {
		_maxsize = maxsize;
	}
	
	public void put(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (size() == _maxsize) {
			throw new QueueOverflowException();
		}
		add(item);
		_count++;
	}
	
	public Object take() {
		//  получить первый элемент
		// если он пустой, вернуть null
		// иначе 
		// сделать первым следующий за ним
		// вернуть данные, которые были в старом первом
		return null;
	}
	
	public Object head() {
		if (isEmpty()) {
			return null;
		}
		return first.getData();
	}
	
	public Object tail() {
		if (isEmpty()) {
			return null;
		}
		return last.getData();
	}
	
	public boolean isEmpty() {
		return _count == 0;
	}
	
	public int size() {
		return _count;
	}
	
	
}
