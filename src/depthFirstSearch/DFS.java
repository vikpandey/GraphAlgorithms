package depthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;

	public DFS() {
		this.stack = new Stack<>();
	}

	public void dfs(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
				//dfsWithRecursion(v);
			}
		}
	}
	
	public void dfsWithRecursion(Vertex v) {
		
		System.out.print(v + " ");
		
		for(Vertex vertex : v.getNeighbourVertexList()) {
			if(!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsWithRecursion(vertex);
			}
		}
	}

	private void dfsWithStack(Vertex rootVertex) {

		this.stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex actualVertex = stack.pop();
			System.out.print(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourVertexList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					stack.add(v);
				}
			}
		}
	}
}