package lesson140224;

public class SwitchAndEnum {

	enum RobotCommands {
		Left, Right, Forward, TurnAround, Stop
	};

	
	
	public static void main(String[] args) {

		RobotCommands[] route = { RobotCommands.Left,  RobotCommands.Left, RobotCommands.Right,
				RobotCommands.Right, RobotCommands.Forward };
		
		for (RobotCommands robotCommand : route) {
			perform(robotCommand);
		}

	}
	
	

	private static void perform(RobotCommands robotCommand) {
		switch (robotCommand) {
		case Left:
			System.out.println("moved left");
			break;

		case Right:
			System.out.println("moved right");
			break;
			
		case TurnAround:
			System.out.println("turned");
			break;
			
		case Forward:
			System.out.println("forward");
			break;
			
		case Stop:
			System.out.println("stopped");
			break;
			
		default:
			break;
		}
	}

}
