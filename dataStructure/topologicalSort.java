package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class topologicalSort {

	// variables
	private int V;
	private LinkedList<Integer> adj[];
	
	// constructor
	public topologicalSort(int v){
		V = v;
		adj = new LinkedList[V];
		for(int i=0; i<v; i++){
			adj[i] = new LinkedList();
		}
	}
	
	//add edge function
	public void addEdge(int v, int e){
		adj[v].add(e);
	}
	
	// topological sort wrapper function
	public void topoSort(){
		
		Stack stack = new Stack();
		Boolean[] visited = new Boolean[V]; 
		
		// initialize each vertex non visited
		for(int i=0; i<V; i++){
			visited[i] = false;
		}
		
		// do topological sort for each unvisited vertex
		for(int i=0; i<V; i++){
			if(!visited[i]){
				topoSortUtil(i, visited, stack);
			}
		}
		
		// print sorted graph
		while(!stack.isEmpty()){
			System.out.print(stack.pop() +" ");
		}
		
	}
	
	// topological sort function
	public void topoSortUtil(int v, Boolean[] visited, Stack stack){
		
		visited[v] = true;
		int i = 0;
				
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext()){
			i = it.next();
			if(!visited[i]){
				topoSortUtil(i, visited, stack);
			}			
		}
		
		// as every adjacent node is visited now mark push it on stack
		stack.push(new Integer(v));		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		topologicalSort g = new topologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.topoSort();

	}

}
