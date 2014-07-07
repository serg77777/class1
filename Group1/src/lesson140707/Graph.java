package lesson140707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph {

	final private int _vertices;
	private int _edges;
	final boolean[][] _adjacencyMatrix;

	public Graph(int vertices) {
		_vertices = vertices;
		_edges = 0;
		_adjacencyMatrix = new boolean[vertices][vertices];
	}

	public int vertices() {
		return _vertices;
	}

	public void addEdge(int i, int j) {
		_adjacencyMatrix[i][j] = _adjacencyMatrix[j][i] = true;
		_edges++;
	}

	public int edges() {
		return _edges;
	}

	public boolean areConnected(int i, int j) {
		return _adjacencyMatrix[i][j];
	}

	public List<Integer> adj(int i) {
		List<Integer> vertices = new ArrayList<>();
		for (int j = 0; j < _adjacencyMatrix[i].length; j++) {
			if (_adjacencyMatrix[i][j]) {
				vertices.add(j);
			}
		}
		return vertices;
	}

}
