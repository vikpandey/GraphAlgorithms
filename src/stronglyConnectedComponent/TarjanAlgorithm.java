package stronglyConnectedComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TarjanAlgorithm {

	private Stack<Vertex> stack;
	private List<Vertex> vertexList;
	private List<List<Vertex>> connectedComponent;
	private int time = 0;
	private int count;

	public TarjanAlgorithm(List<Vertex> vertexList) {
		this.stack = new Stack<>();
		this.vertexList = vertexList;
		this.connectedComponent = new ArrayList<>();
	}

	public void runAlgorithm() {

		for (Vertex vertex : vertexList) {
			if (!vertex.isVisited()) {
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {

		vertex.setLowLink(time++);
		vertex.setVisited(true);
		this.stack.add(vertex);
		boolean isRootComponent = true;

		for (Vertex v : vertex.getAdjacentVertex()) {
			if (!v.isVisited()) {
				dfs(v);
			}

			if (vertex.getLowLink() > v.getLowLink()) {
				vertex.setLowLink(v.getLowLink());
				isRootComponent = false;
			}
		}

		if (isRootComponent) {
			this.count++;
			List<Vertex> component = new ArrayList<>();

			while (true) {
				Vertex actualVertex = stack.pop();
				component.add(actualVertex);

				actualVertex.setLowLink(Integer.MAX_VALUE);
				if (actualVertex.getName() == vertex.getName())
					break;
			}

			connectedComponent.add(component);
		}
	}
	
	public void printComponent() {
		System.out.println(connectedComponent);
	}

}
