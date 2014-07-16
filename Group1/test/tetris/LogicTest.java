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
	
	@Test
	public void testMoveDown() throws Exception {
		int oldFigureRow = _state.figureRow;
		_logic.moveDown();
		assertEquals(oldFigureRow + 1, _state.figureRow);
	}
	
	@Test
	public void testMoveDownInsideBox() throws Exception {
		prepareFigureAtBottom();
		
		_logic.moveDown();
		int bottom = _state.field.box.length - 1;
		assertEquals(1, _state.field.box[bottom][0]);
		assertEquals(1, _state.field.box[bottom][1]);
		assertEquals(1, _state.field.box[bottom][2]);
		assertEquals(1, _state.field.box[bottom][3]);
	}
	
	@Test
	public void testNextFigureAppears() throws Exception {
		prepareFigureAtBottom();
		_logic.moveDown();
		assertEquals(0, _state.figureRow);
	}

	private void prepareFigureAtBottom() {
		Figure figure = _state.figure;
		figure.data = new int[][] {
				{0,0,0,0},	
				{0,0,0,0},	
				{0,0,0,0},	
				{1,1,1,1},	
		};
		_state.figureRow = _state.field.box.length - 4; 
		_state.figureColumn = 0;
	}
	
	@Test
	public void testMoveDownInFilledBox() throws Exception {
		Figure figure = _state.figure;
		figure.data = new int[][] {
				{0,0,0,0},	
				{0,0,1,0},	
				{0,1,1,1},	
				{0,0,0,0},	
		};
		int row = _state.figureRow = _state.field.box.length - 4;
		_state.figureColumn = 0;
		
		int[][] b = _state.field.box;
		
		b[b.length - 1][1] = 1;
		
		_logic.moveDown();
		
		assertEquals(0, _state.figureRow);
	}
	
}
