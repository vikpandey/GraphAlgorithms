package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vikas
 *
 */

public class Vertex {
	
	private String name;
	private boolean visited;
	private List<Edge> adjacencyList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<>();
	}
	
	public void addEdge(Edge edge) {
		this.adjacencyList.add(edge);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Edge> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
