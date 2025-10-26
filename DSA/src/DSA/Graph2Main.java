package DSA;
import java.util.LinkedList;
class Graph1{
	static class Edge{
		int dest;
		int cost;
		Edge(int dest,int cost){
			this.dest=dest;
			this.cost=cost;
		}
	}
	int v;
	LinkedList<LinkedList<Edge>> adj;
	Graph1(int v){
		this.v=v;
		adj=new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<Edge>());
		}
	}
	void addDirectedEdge(int src,int dest,int cost) {
		Edge e =new Edge(dest,cost);
		adj.get(src).add(e);
	}
	void bfs(Graph1 g,int src) {
		int v=g.v;
		boolean []visited=new boolean[v];
		LinkedList<Integer> q = new LinkedList<Integer>();
		visited[src]=true;
		q.add(src);
		while(!q.isEmpty()) {
			int curr=q.remove();
			System.out.print(curr+" ");
			LinkedList<Edge> temp = g.adj.get(curr);
			for(Edge e:temp) {
				if(visited[e.dest]==false) {
					visited[e.dest]=true;
					q.add(e.dest);
				}
			}
			
		}
		
	}
}

public class Graph2Main {
	public static void main(String[] args) {
		Graph1 g = new Graph1(5);
		g.addDirectedEdge(0, 1, 5);	
		g.addDirectedEdge(1, 0, 5);	
		g.addDirectedEdge(1, 2, 5);	
		g.addDirectedEdge(1, 4, 5);
		g.addDirectedEdge(2, 1, 5);
		g.addDirectedEdge(2, 3, 5);
		g.addDirectedEdge(3, 2, 5);
		g.addDirectedEdge(3, 4, 5);
		g.addDirectedEdge(4, 1, 5);
		g.addDirectedEdge(4, 3, 5);
		g.bfs(g,0);
	}
}
