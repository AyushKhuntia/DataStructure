package com.ayush.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
/**
 * P01_Build_Graph
 *
 * Problem Statement:
 * -----------------
 * Build an undirected graph using an adjacency list representation.
 * The graph is constructed from user input where each pair of integers
 * represents an edge between two vertices.
 *
 * Input Format:
 * -------------
 * - First input: integer v (number of edges)
 * - Next v lines: two integers (src, dest) representing an edge
 *
 * Example Input:
 * --------------
 * 3
 * 1 2
 * 2 3
 * 1 3
 *
 * Graph Representation:
 * ---------------------
 * The graph is stored using:
 * HashMap<Integer, List<Integer>>
 * - Key   → Vertex
 * - Value → List of adjacent vertices
 *
 * Since the graph is undirected:
 * - src is added to dest’s adjacency list
 * - dest is added to src’s adjacency list
 *
 * Output:
 * -------
 * Prints the adjacency list of the graph.
 *
 * Time Complexity:
 * ----------------
 * O(V + E), where V is the number of vertices and E is the number of edges.
 *
 * Space Complexity:
 * -----------------
 * O(V + E) for storing the adjacency list.
 */

public class P01_Build_Graph {
	public static void main(String[] args) {
		HashMap<Integer,List<Integer>> graph = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		for(int i=0;i<v;i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			graph.computeIfAbsent(src, k->new ArrayList<Integer>()).add(dest);
			graph.computeIfAbsent(dest, k->new ArrayList<Integer>()).add(src);
			
		}
		System.out.println(graph);
		
	}
}
