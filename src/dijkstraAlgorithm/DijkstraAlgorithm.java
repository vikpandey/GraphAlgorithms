package dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

	public void computePath(Vertex sourceVertex) {

		sourceVertex.setDistance(0);
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(sourceVertex);

		while (!priorityQueue.isEmpty()) {

			Vertex actualVertex = priorityQueue.poll();

			for (Edge edge : actualVertex.getAdjacencyList()) {

				Vertex v = edge.getTargetVertex();
				double newDistance = (actualVertex.getDistance() + edge.getWeight());

				if (newDistance < v.getDistance()) {
					priorityQueue.remove(v);
					v.setDistance(newDistance);
					v.setPredecessor(actualVertex);
					priorityQueue.add(v);
				}
			}
		}
	}

	public List<Vertex> shortestPathTo(Vertex targetVertex) {

		List<Vertex> shortestPath = new ArrayList<>();

		for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
			shortestPath.add(vertex);
		}

		Collections.reverse(shortestPath);

		return shortestPath;
	}

}
