package tetris;

import static org.junit.Assert.*;

import org.junit.Test;

public class StateTest {

	@Test
	public void test() {
		State state = new State(20,10);
		assertNotNull(state.field);
		assertNull(state.figure);
	}

	@Test
	public void testInit() {
		State state = new State(20,10);
		state.init();
		assertNotNull(state.figure);
		assertEquals(0, state.figureRow);
		assertEquals(state.field.box[0].length / 2 
				- state.figure.data[0].length/2,
				state.figureColumn);
	}
	
}
