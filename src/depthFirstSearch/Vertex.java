package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String data;
	private boolean visited;
	private List<Vertex> neighbourVertexList;

	public Vertex(String data) {
		this.data = data;
		this.neighbourVertexList = new ArrayList<>();
	}
	
	public void addNeighbour(Vertex vertex) {
		this.neighbourVertexList.add(vertex);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourVertexList() {
		return neighbourVertexList;
	}

	public void setNeighbourVertexList(List<Vertex> neighbourVertexList) {
		this.neighbourVertexList = neighbourVertexList;
	}

	@Override
	public String toString() {
		return this.data;
	}

}
