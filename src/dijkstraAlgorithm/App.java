package dijkstraAlgorithm;

public class App {
	
	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("this");
		Vertex v2 = new Vertex("is");
		Vertex v3 = new Vertex("a");
		Vertex v4 = new Vertex("test");
		Vertex v5 = new Vertex("dictionary");
		Vertex v6 = new Vertex("algorithm");
		
		v1.addEdges(new Edge(1, v1, v2));
		v1.addEdges(new Edge(0, v1, v3));
		v2.addEdges(new Edge(4, v2, v3));
		v2.addEdges(new Edge(1, v2, v4));
		v3.addEdges(new Edge(1,v3, v4));
		v3.addEdges(new Edge(4, v3, v5));
		v4.addEdges(new Edge(2, v4, v6));
		v5.addEdges(new Edge(1, v5, v6));
		v6.addEdges(new Edge(1, v6, v2));
		
		DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
		
		algorithm.computePath(v1);
		System.out.println(algorithm.shortestPathTo(v6));
		
	}
	

}
