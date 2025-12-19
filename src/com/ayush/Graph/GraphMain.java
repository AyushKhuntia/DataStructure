package com.ayush.Graph;

import java.util.ArrayList;

class Graph{
	int s,d,w;
	Graph(int s,int d,int w){
		this.s=s;
		this.d=d;
		this.w=w;
	}
	public String toString() {
		return "{"+this.d+", "+this.w+"}";
	}
}
public class GraphMain {

	public static void main(String[] args) {
		int v=4;
		@SuppressWarnings("unchecked")
		ArrayList<Graph>[] g = new ArrayList[v];
		for(int i=0;i<v;i++) {
			g[i]=new ArrayList<Graph>();
		}
		g[0].add(new Graph(0,1,5));
		g[1].add(new Graph(1,0,5));
		g[0].add(new Graph(0,2,10));
		
		for(ArrayList<Graph> al : g) {
			System.out.println(al);
		}
		
		

	}

}
