package lesson140707;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GraphCreationTest {

	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ Arrays.asList(new Object[][] {
						{4},
						{0,1},
						{1,2},
						{2,0},
						{2,3},
						{1,3},
				}), 5 
				},
				{ Arrays.asList(new Object[][] {
						{3},
						{0,1},
						{1,2},
						{2,0},
				}), 3 
				}
		});
		
	}
	
	Graph g;
	private int _exceptedEdges;
	
	public GraphCreationTest(List<Object[]> graphData, int exceptedEdges) {
		_exceptedEdges = exceptedEdges;
		int vertices = (int) graphData.get(0)[0];
		g = new Graph(vertices);
		for (int i = 1; i < graphData.size(); i++) {
			int v = (int) graphData.get(i)[0];
			int w = (int) graphData.get(i)[1];
			g.addEdge(v, w);
		}
	}
	
	@Test
	public void test() {
		assertEquals(_exceptedEdges, g.edges());
	}

}
