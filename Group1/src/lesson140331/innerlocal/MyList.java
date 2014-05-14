package lesson140331.innerlocal;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList implements Iterable {

	protected static class Node {
		private Object data;
		private Node next;

		public Object getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}

	protected Node last;
	protected Node first;

	public void add(Object element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}
		last = node;
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {

			Node next;
			
			{
				next = first;
			}

			@Override
			public boolean hasNext() {
				return next != null;
			}

			@Override
			public Object next() {
				Object result = next.data;
				next = next.next;
				return result;
			}

			@Override
			public void remove() {
			}
		};
	}

//	public static void main(String[] args) {
//
//		SimpleList list = new MyList();
//		list.add("one");
//		list.add("two");
//		list.add("three");
//
//		// Node current = list.first(); // traverse
//		// while (current != null) {
//		// System.out.println(current.data);
//		// current = current.next;
//		// }
//		//
//		// for (current = list.first(); current != null; current = current.next)
//		// {
//		// System.out.println(current.data);
//		// }
//
//		print(list);
//
//		ArrayList strings = new ArrayList();
//		strings.add("раз");
//		strings.add("два");
//		strings.add("три");
//
//		print(strings);
//	}

	private static void print(Iterable list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}

}
