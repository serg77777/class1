package lesson140224;

public class Switch2 {

	public static void main(String[] args) {
		
		char[] possibleCommands = {'L', 'F', 'R', 'T', 'S'};
		
		char route[] = {'L', 'L', 'F', 'F', 'R', 'T', ',', 'F', 'F', 'S'};
		
		for (int i = 0; i < route.length; i++) {
			moveRobot(route[i]);
		}
	}

	private static void moveRobot(char moveCommand) {
		
		switch (moveCommand) {
		case 'L':
			System.out.println("moved Left");
			break;
		case 'F':
			System.out.println("moved Forward");
			break;
		case 'R':
			System.out.println("moved Right");
			break;
		case 'T':
			System.out.println("turned around");
			break;
		case 'S':
			System.out.println("stopped");
			break;

		default:
			System.out.println("command not recognized: " + moveCommand);
			break;
		}
	}

	
}
