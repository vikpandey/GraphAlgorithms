package kruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {
	
	public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList) {
		
		DisjointSet disjointSet = new DisjointSet(vertexList);
		
		List<Edge> mst = new ArrayList<>();
		
		Collections.sort(edgeList);
		
		for(Edge edge : edgeList) {
			Vertex u = edge.getStartVertex();
			Vertex v = edge.getTargetVertex();
			
			if(disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())) {
				mst.add(edge);
				disjointSet.union(u.getNode(), v.getNode());
			}
		}
		
		int mstValue = 0;
		
		for(Edge edge : mst) {
			System.out.print(edge.getStartVertex() + " " + edge.getTargetVertex()+ " -- ");
			mstValue += edge.getWeight();
		}
		System.out.println();
		System.out.println("minimum spanning tree value is:- "+ mstValue);
	}

}
