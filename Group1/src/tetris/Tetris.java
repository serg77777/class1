package tetris;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class Tetris {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tetris");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		View view = new View(frame);
		
		frame.pack();
		frame.setVisible(true);
		
		Model model = new Model();
		
		final Controller controller = new Controller(model, view);
		
		model.addListener(controller);
		view.setListener(controller);
		
		model.newGame();
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				controller.moveDown();
			}
		}, 1, 1, TimeUnit.SECONDS);
	}
	
}
