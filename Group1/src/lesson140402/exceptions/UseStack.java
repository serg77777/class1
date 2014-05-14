package lesson140402.exceptions;

public class UseStack {
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		try {
			System.out.println(stack.top());
		} catch (StackIsEmptyException e1) {
			System.out.println("stack is empty");
		}

		try {
			stack.push(1);
		} catch (MyStackOverflowException e) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		try {
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);

		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		try {
			System.out.println("Top element: " + stack.top());
		} catch (StackIsEmptyException e) {
			System.out.println("stack is empty");
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.pop();
	}
}
