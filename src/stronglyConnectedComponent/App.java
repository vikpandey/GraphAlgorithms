package stronglyConnectedComponent;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
List<Vertex> vertexList = new ArrayList<>();
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		Vertex v7 = new Vertex("7");
		
		v1.addAdjacentVertex(v5);
		v2.addAdjacentVertex(v1);
		v3.addAdjacentVertex(v2);
		v3.addAdjacentVertex(v4);
		v4.addAdjacentVertex(v3);
		v5.addAdjacentVertex(v2);
		v6.addAdjacentVertex(v2);
		v6.addAdjacentVertex(v5);
		v6.addAdjacentVertex(v7);
		v7.addAdjacentVertex(v6);
		v7.addAdjacentVertex(v3);
		
		vertexList.add(v1);
		vertexList.add(v2);
		vertexList.add(v6);
		vertexList.add(v4);
		vertexList.add(v5);
		vertexList.add(v3);
		vertexList.add(v7);
		
		TarjanAlgorithm tarjanAlgorithm = new TarjanAlgorithm(vertexList);
		tarjanAlgorithm.runAlgorithm();
		tarjanAlgorithm.printComponent();
	}
	
}
