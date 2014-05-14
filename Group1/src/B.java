public class B {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.exit(0);
		}

		int number = Integer.parseInt(args[0]);

		System.out.println(number);

		if (number < 10) {
			System.out.println("малыш");
		} else if (number < 15) {
			System.out.println("подросток");
		} else if (number < 25) {
			System.out.println("юноша");
		} else if (number < 50) {
			System.out.println("молодой человек");
		} else if (number > 50) {
			System.out.println("папаша");
		}

	}

}
