package lesson140414.reflection;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class RobotPanel extends JPanel {

	private Robot2D _r2d2;

	public RobotPanel(Robot2D r2d2) {
		_r2d2 = r2d2;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.fillOval(_r2d2._x, _r2d2._y, 30, 30);
	}
	

}
