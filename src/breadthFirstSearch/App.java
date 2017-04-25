package breadthFirstSearch;

public class App {

	public static void main(String[] args) {
		
		BFS bfs = new BFS();
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);
		
		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex5);
		vertex2.addNeighbour(vertex3);
		vertex2.addNeighbour(vertex6);
		vertex4.addNeighbour(vertex5);
		vertex4.addNeighbour(vertex3);
		vertex6.addNeighbour(vertex2);
		
		
		bfs.bfs(vertex1);

	}

}
