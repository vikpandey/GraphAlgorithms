package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vikas
 *
 */

public class App {

	public static void main(String[] args) {
		/*
		 * Vertex vertex1 = new Vertex("1"); Vertex vertex2 = new Vertex("2");
		 * Vertex vertex3 = new Vertex("3"); Vertex vertex4 = new Vertex("4");
		 * Vertex vertex5 = new Vertex("5");
		 * 
		 * List<Vertex> vertexList = new ArrayList<>(); vertexList.add(vertex1);
		 * vertexList.add(vertex2); vertexList.add(vertex3);
		 * 
		 * vertexList.add(vertex4); vertexList.add(vertex5);
		 * 
		 * 
		 * vertex1.addAdjacentEdge(new Edge(vertex1, vertex2, 1));
		 * vertex2.addAdjacentEdge(new Edge(vertex2, vertex3, 2));
		 * vertex3.addAdjacentEdge(new Edge(vertex3, vertex1, 3));
		 * 
		 * vertex4.addAdjacentEdge(new Edge(vertex4, vertex5, 7));
		 * vertex5.addAdjacentEdge(new Edge(vertex5, vertex1, 4));
		 * vertex1.addAdjacentEdge(new Edge(vertex1, vertex4, 5));
		 * vertex2.addAdjacentEdge(new Edge(vertex2, vertex5, 6));
		 * vertex3.addAdjacentEdge(new Edge(vertex3, vertex1, 2));
		 * vertex4.addAdjacentEdge(new Edge(vertex4, vertex2, 8));
		 * vertex5.addAdjacentEdge(new Edge(vertex5, vertex3, 5));
		 */

		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");

		List<Vertex> vertexList = new ArrayList<>();

		vertex0.addEdge(new Edge(vertex0, vertex1, 1));
		vertex0.addEdge(new Edge(vertex0, vertex2, 1));
		vertex1.addEdge(new Edge(vertex1, vertex2, 10));

		Algorithm algorithm = new Algorithm(vertexList);

		algorithm.primsAlgorithm(vertex1);
		algorithm.valueOfMST();
	}

}
