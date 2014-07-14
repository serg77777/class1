package tetris;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureTest {

	@Test
	public void test() {
		Figure figure = Figure.generateRandom();
		assertEquals(4, figure.data.length);
		assertEquals(4, figure.data[0].length);
	}
	
	@Test
	public void testCreateFigure() throws Exception {
		Figure figure = Figure.generateRandom();
		assertNotNull(figure);
		assertFigureDataHasNonZeroValues(figure);
	}

	private void assertFigureDataHasNonZeroValues(Figure figure) {
		for (int i = 0; i < figure.data.length; i++) {
			for (int j = 0; j < figure.data[i].length; j++) {
				if (figure.data[i][j] != 0) {
					return;
				}
			}
		}
		fail("figure data must contain at least one non-zero cell");
	}
	
	@Test
	public void testCreateFigureList() throws Exception {
		assertNotNull(Figure.allFigures);
		assertEquals(19, Figure.allFigures.size());
	}

}
