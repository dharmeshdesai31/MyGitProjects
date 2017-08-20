package com.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBasics {

	/*
	 * Application:
	 * Graphs are used to represent networks. The networks may include paths in a city 
	 * or telephone network or circuit network. Graphs are also used in social networks 
	 * like linkedIn, facebook. For example, in facebook, each person is represented 
	 * with a vertex(or node). Each node is a structure and contains information like 
	 * person id, name, gender and locale.
	 */
	public static void main(String[] s){
		Graph g = new Graph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
	}
}

class Graph{
	int vertices;
	LinkedList<Integer> list[];
	
	Graph(){
		this.vertices = 0;
		this.list = null;
	}
	
	Graph(int v){
		this.vertices = v;
		this.list = new LinkedList[this.vertices];
		for(int i=0; i<this.vertices; i++){
			list[i] = new LinkedList();
		}
	}
	
	void addEdge(int a, int b) // it indicates end between a to b
	{
		list[a].add(b);
	}
	
	void BFS(int startPoint){
		boolean visited[] = new boolean[this.vertices];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[startPoint] = true;
		queue.add(startPoint);
		while(queue.size() != 0)
		{
			startPoint = queue.poll();
			System.out.print(startPoint+" ");
			 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = list[startPoint].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
		}
	}
}