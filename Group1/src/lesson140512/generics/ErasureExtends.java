package lesson140512.generics;


public class ErasureExtends {
	static class Node<T extends Comparable<T>> {
		private T data;
		private Node<T> next;
		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
		}

		T getData() {
			return data;
		}
		
	}	

	static class Node2 {
		private Comparable data;
		private Node2 next;
		public Node2(Comparable data, Node2 next) {
			super();
			this.data = data;
			this.next = next;
		}

		Comparable getData() {
			return data;
		}
		
	}


}
