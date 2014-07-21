package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaPlatform  implements Platform {
	
	
	private static Color[] colors = {Color.black, Color.blue, Color.red, Color.green, Color.yellow, Color.orange};
	
	private JFrame _frame;
	private JPanel _panel;
	private PlatformKeyListener _keyListener;

	public void init(JFrame frame, PlatformKeyListener keyListener) {
		_frame = frame;
		_keyListener = keyListener;

		_panel = new JPanel();
		_panel.setPreferredSize(new Dimension(400, 700));
		frame.add(_panel);

		_frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					_keyListener.moveLeft();
					break;
				case KeyEvent.VK_RIGHT:
					_keyListener.moveRight();
					break;
				}
			}
		});

	}

	@Override
	public void clearArea() {
		Graphics2D g = (Graphics2D) _panel.getGraphics();
		g.clearRect(0, 0, _panel.getWidth(), _panel.getHeight());
	}

	@Override
	public int backgroundColorIndex() {
		return 0;
	}

	@Override
	public void fillRect(int colorIndex, int x, int y, int width,
			int height) {
		Graphics2D g = (Graphics2D) _panel.getGraphics();
		g.setColor(colors[colorIndex]);
		g.fillRect(x, y, width, height);
	}

	@Override
	public int getWidth() {
		return _panel.getWidth();
	}

	@Override
	public int getHeight() {
		return _panel.getHeight();
	}

	@Override
	public void setKeyListener(PlatformKeyListener listener) {
		_keyListener = listener;
	}
	
}
