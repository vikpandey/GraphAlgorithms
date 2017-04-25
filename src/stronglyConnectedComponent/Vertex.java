package stronglyConnectedComponent;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> adjacentVertex;
	private Vertex predecessor;
	private int lowLink;

	public Vertex(String name) {
		this.name = name;
		this.adjacentVertex = new ArrayList<>();
	}

	public void addAdjacentVertex(Vertex vertex) {
		this.adjacentVertex.add(vertex);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isVisited() {
		return this.visited;
	}

	public void setAdjacentVertex(List<Vertex> adjacentVertex) {
		this.adjacentVertex = adjacentVertex;
	}

	public List<Vertex> getAdjacentVertex() {
		return this.adjacentVertex;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public Vertex getPredecessor() {
		return this.predecessor;
	}

	public void setLowLink(int lowLink) {
		this.lowLink = lowLink;
	}

	public int getLowLink() {
		return this.lowLink;
	}

	public String toString() {
		return this.name;
	}

}
