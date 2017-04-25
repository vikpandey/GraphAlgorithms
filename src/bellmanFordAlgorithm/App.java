package bellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		Vertex vertex1 = new Vertex("a");
		Vertex vertex2 = new Vertex("b");
		Vertex vertex3 = new Vertex("c");
		Vertex vertex4 = new Vertex("d");
		Vertex vertex5 = new Vertex("e");
		Vertex vertex6 = new Vertex("f");
		
		Edge edge1 = new Edge(1, vertex1, vertex2);
		Edge edge2 = new Edge(1, vertex1, vertex3);
		Edge edge3 = new Edge(1, vertex2, vertex4);
		Edge edge4 = new Edge(1, vertex3, vertex5);
		Edge edge5 = new Edge(1, vertex3, vertex2);
		Edge edge6 = new Edge(1, vertex4, vertex2);
		Edge edge7 = new Edge(1, vertex5, vertex6);
		Edge edge8 = new Edge(1, vertex6, vertex3);
		
		vertex1.addAdjacency(edge1);
		vertex1.addAdjacency(edge2);
		vertex2.addAdjacency(edge3);
		vertex3.addAdjacency(edge4);
		vertex3.addAdjacency(edge5);
		vertex4.addAdjacency(edge6);
		vertex5.addAdjacency(edge7);
		vertex6.addAdjacency(edge8);
		
		List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		
		List<Edge> edgeList = new ArrayList<>();
		
		edgeList.add(edge1);
		edgeList.add(edge2);
		edgeList.add(edge3);
		edgeList.add(edge4);
		edgeList.add(edge5);
		edgeList.add(edge6);
		edgeList.add(edge7);
		edgeList.add(edge8);
		
		BellmanFord bellmanFord = new BellmanFord(edgeList, vertexList);
		
		bellmanFord.Bellman(vertex1);
		bellmanFord.shortestPathTo(vertex6);
		
	}
}
