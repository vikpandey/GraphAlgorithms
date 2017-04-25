package bellmanFordAlgorithm;

public class Edge {

	private double edgeWeight;
	private Vertex startVertex;
	private Vertex targetVertex;

	public Edge(double edgeWeight, Vertex startVertex, Vertex targetVertex) {
		this.edgeWeight = edgeWeight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public double getEdgeWeight() {
		return edgeWeight;
	}

	public void setEdgeWeight(double edgeWeight) {
		this.edgeWeight = edgeWeight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

}
