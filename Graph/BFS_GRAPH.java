package Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class BFS_GRAPH {
	
	public  LinkedList<Integer> GRAPH[] ;
	boolean visited[];
	
	
	public BFS_GRAPH(int V)
	{
		int v = V;
		GRAPH = new LinkedList[v];
		for(int i = 0 ; i< V ;i++)
		{
			GRAPH[i] = new LinkedList();
		}
		visited = new boolean[v];
		
		
	}
	
	public void BFS(int start_value)
	{
		Arrays.fill(visited, false);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		
		queue.add(start_value);
		
		
		while(!queue.isEmpty())
		{
			Integer i = queue.poll();
			visited[i] = true;
			System.out.print(i+"  ");
			
			LinkedList<Integer> values = GRAPH[i];
			
			Iterator it = values.iterator();
			while(it.hasNext())
			{
				int val = (int) it.next();
				if(!visited[val]) {
					visited[val] = true;
					queue.add(val);
				}
			}
			
		}
		
		
		
	}
	
	public  void addEdge(int u,int v)
	{
		GRAPH[u].add(v);
	}
	

	public static void main(String[] args) {
		
		BFS_GRAPH g = new BFS_GRAPH(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.BFS(0);
		
		
	}

}
