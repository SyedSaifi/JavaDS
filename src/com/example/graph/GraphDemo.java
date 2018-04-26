package com.example.graph;

import java.util.LinkedList;

public class GraphDemo {
	private int noOfVertice;
	private LinkedList<Integer> adjListArray[];

	GraphDemo(int v) {
		this.noOfVertice = v;
		adjListArray = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}

	void addEdge(int src, int dest) {
		adjListArray[src].add(dest);

		// Since graph is undirected, add an edge from dest to src also
		adjListArray[dest].add(src);
	}

	void printGraph() {
		for (int i = 0; i < noOfVertice; i++) {
			System.out.println("Adjacency list of vertex " + i);
			System.out.print("head");

			for (Integer v : adjListArray[i]) {
				System.out.print(" -> " + v);
			}
			System.out.println("\n");
		}
	}

	public static void main(String args[]) {
		GraphDemo graph = new GraphDemo(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		graph.printGraph();
	}
}
