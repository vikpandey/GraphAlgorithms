package bellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord {
	
	private List<Edge> edgeList;
	private List<Vertex> vertexList;
	
	public BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}
	
	public void Bellman(Vertex sourceVertex) {
		
		sourceVertex.setDistance(0);
		
		for(int i = 0; i < vertexList.size()-1; i++) {
			
			for(Edge edge : edgeList) {
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				if(u.getDistance() == Double.MAX_VALUE)
					continue;
				
				double newDistance = u.getDistance() + edge.getEdgeWeight();
				
				if(newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPredecessor(u);
				}
			}
		}
		
		for(Edge edge : edgeList) {
			if(edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
				
				if(hasCycle(edge)) {
					System.out.println("cycle has been detected...");
				}
			}
		}
	}
	
	private boolean hasCycle(Edge edge) {
		
		return edge.getStartVertex().getDistance() + edge.getEdgeWeight() < edge.getTargetVertex().getDistance();
	}
	
	public List<Vertex> shortestPathTo(Vertex targetVertex) {
		
		if(targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("there is no path to the target Vertex:- " + targetVertex);
		}
		
		Vertex actualVertex = targetVertex;
		
		List<Vertex> shortestPath = new ArrayList<>();
		
		while(actualVertex.getPredecessor() != null) {
			shortestPath.add(actualVertex);
			actualVertex.getPredecessor();
		}
		
		Collections.reverse(shortestPath);
		
		return shortestPath;
	}

}
