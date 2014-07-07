package lesson140707;

import static org.junit.Assert.*;
import org.junit.Test;

public class GraphTest {

	@Test
	public void testCreateGraphObject() {
		Graph g = new Graph(3);
		assertEquals(3, g.vertices());
	}

	@Test
	public void testVertices() {
		Graph g = new Graph(5);
		assertEquals(5, g.vertices());
	}
	
	@Test
	public void testAddEdge() throws Exception {
		Graph g = new Graph(3);
		g.addEdge(0,1);
		assertEquals(1, g.edges());
		g.addEdge(1, 2);
		assertEquals(2, g.edges());
	}
	
}
