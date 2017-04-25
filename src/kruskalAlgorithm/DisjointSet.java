package kruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	
	private int countNode;
	private int countSet;
	private List<Node> rootNode;
	
	public DisjointSet(List<Vertex> vertices) {
		this.rootNode = new ArrayList<>(vertices.size());
		makeSets(vertices);
	}
	
	private void makeSets(List<Vertex> vertices) {
		for(Vertex v : vertices) {
			makeSet(v);
		}
	}
	
	private void makeSet(Vertex vertex) {
		Node node = new Node(rootNode.size(), 0, null);
		vertex.setNode(node);
		rootNode.add(node);
		this.countSet++;
		this.countNode++;
	}
	
	public int find(Node node) {
		
		Node newNode = node;
		
		while(newNode.getParentNode() != null) {
			newNode = newNode.getParentNode();
		}
		
		Node rootNode = newNode;
		newNode = node;
		
		/**
		 * Here we are running an path compression. Basically at each 
		 * iteration, we are attaching the node's parent as root node.
		 */
		
		while(newNode != rootNode) {
			Node temp = newNode.getParentNode();
			newNode.setParentNode(rootNode);
			newNode = temp;
		}
		
		return rootNode.getId();
	}
	
	public void union(Node node1, Node node2) {
		
		int index1 = find(node1);
		int index2 = find(node2);
		
		if(index1 == index2) {
			return;
		}
		
		Node root1 = rootNode.get(index1);
		Node root2 = rootNode.get(index2);
		
			if(root1.getRank() < root2.getRank()) {
				root1.setParentNode(root2);
			}
			else if(root1.getRank() > root2.getRank()) {
				root2.setParentNode(root1);
			}
			else {
				root2.setParentNode(root1);
				root1.setRank(root1.getRank()+1);
			}
		
		this.countSet--;
	}

}
