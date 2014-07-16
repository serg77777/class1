package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {

	private EventProcessor _processor;
	private JFrame _frame;
	private JPanel _panel;

	public View(JFrame frame) {
		_frame = frame;

		_panel = new JPanel();
		_panel.setPreferredSize(new Dimension(400, 700));
		frame.add(_panel);

		_frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e);
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					_processor.moveLeft();
					break;
				case KeyEvent.VK_RIGHT:
					_processor.moveRight();
					break;
				}
			}
		});

	}

	public void updateState(State state) {
		Graphics2D g = (Graphics2D) _panel.getGraphics();
		g.clearRect(0, 0, _panel.getWidth(), _panel.getHeight());
		g.setColor(Color.black);
		g.fillRect(state.figureColumn * 30, state.figureRow * 30, 30, 30);
	}

	public void setListener(EventProcessor processor) {
		_processor = processor;
	}

}
