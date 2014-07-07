package lesson140707;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GraphTest3 {

	Graph g;
	
	@Before
	public void setup() {
		g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
	}
	
	
	@Test
	public void testAreConnected() {
		assertTrue(g.areConnected(0,1));
		assertTrue(g.areConnected(0,2));
		assertFalse(g.areConnected(1,3));
	}
	
	@Test
	public void testAdj() throws Exception {
		List<Integer> vertices = g.adj(3);
		assertEquals(2, vertices.size());
		assertTrue(vertices.contains(2));
		assertTrue(vertices.contains(0));
	}

}
