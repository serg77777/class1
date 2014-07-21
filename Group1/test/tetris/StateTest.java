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
	
	@Test
	public void testRemoveFullRows() throws Exception {
		State state = new State(5,3);
		state.field.box = new int[][] {
				{0,0,0},	
				{0,0,0},	
				{0,0,0},	
				{0,2,0},	
				{1,1,1},	
		};
		
		state.removeFullRows();
		
		assertEquals(0, state.field.box[4][0]);
		assertEquals(2, state.field.box[4][1]);
		assertEquals(0, state.field.box[4][2]);
		
		assertEquals(0, state.field.box[3][0]);
		assertEquals(0, state.field.box[3][1]);
		assertEquals(0, state.field.box[3][2]);
	}
	
}
