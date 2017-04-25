package primsAlgorithm;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * @author vikas
 *
 */

public class Algorithm {
	
	private List<Vertex> unvisitedVertex;
	private List<Edge> spanningTree;
	private PriorityQueue<Edge> heapQueue;
	private double totalCost;
	
	public Algorithm(List<Vertex> unvisitedVertex) {
		this.unvisitedVertex = unvisitedVertex;
		this.spanningTree = new ArrayList<>();
		this.heapQueue = new PriorityQueue<>();
	}
	
	public void primsAlgorithm(Vertex vertex) {
		
		this.unvisitedVertex.remove(vertex);
		
		while(! unvisitedVertex.isEmpty()) {
			
			for(Edge edge : vertex.getAdjacencyList()) {
				if(unvisitedVertex.contains(edge.getTargetVertex())) {
					heapQueue.add(edge);
				}
			}
			Edge minHeap = heapQueue.remove();
			spanningTree.add(minHeap);
			totalCost += minHeap.getWeight();
			vertex = minHeap.getTargetVertex();
		}
	}
	
	public void valueOfMST() {
		
		for(Edge edge : spanningTree) {
			System.out.println(edge.getStartVertex() + " - " + edge.getTargetVertex());
		}
		
		System.out.println("total weight for MST is :- " + totalCost);
	}

}
