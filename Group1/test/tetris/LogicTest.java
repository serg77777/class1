package tetris;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LogicTest {

	private State _state;
	private Logic _logic;

	@Before
	public void setup() {
		_state = new State(20,10);
		_logic = new Logic(_state);
		_logic.newGame();
	}
	
	@Test
	public void test() {
		assertEquals(_logic.state, _state);
	}
	
	@Test
	public void testNewGame() throws Exception {
		assertNotEquals(0, _state.figureColumn);
	}

	@Test
	public void testMoveLeft() throws Exception {
		int oldFigureColumn = _state.figureColumn;
		_logic.moveLeft();
		assertEquals(oldFigureColumn - 1, _state.figureColumn);
	}
	
	@Test
	public void testMoveRight() throws Exception {
		int oldFigureColumn = _state.figureColumn;
		_logic.moveRight();
		assertEquals(oldFigureColumn + 1, _state.figureColumn);
	}
	
	@Test
	public void testNotMoveTooLeft() throws Exception {
		_state.figureColumn = 0;
		_logic.moveLeft();
		assertEquals(0, _state.figureColumn);
		
	}
	
	@Test
	public void testNotMoveTooRight() throws Exception {
		int oldColumn = _state.figureColumn = _state.field.box[0].length
				- _state.figure.data[0].length;
		_logic.moveRight();
		assertEquals(oldColumn, _state.figureColumn);
		
	}
	
}
