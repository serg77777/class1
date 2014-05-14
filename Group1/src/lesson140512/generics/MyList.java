package lesson140512.generics;

public class MyList<T> {

	private static class Node<T> {
		T item;
		Node<T> next;
		
		Node(T item, Node<T> next) {
			super();
			this.item = item;
			this.next = next;
		}
	}
	
	Node<T> first;
	Node<T> last;
	
	public void add(T item) {
		Node<T> node = new Node<T>(item, null);
		if (last != null) {
			last.next = node;
		}
		last = node;
		if (first == null) {
			first = node;
		}
	}
	
	public T first() {
		return first.item;
	}

	public static void main(String[] args) {
	
		MyList<String> list = new MyList<String>();
		list.add("hello");
		String s = list.first();
		System.out.println(s);
//		list.add(10);  Compile ERROR
//		Integer i = (Integer) list.first();   Compile ERROR
	}
	
	
}
