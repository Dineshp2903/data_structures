package javamine;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
	
	
	
	public static void getGraphAdjMatrix()
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//No Of Vertices
		int m = scanner.nextInt();//No Of Edges
		int[][] adjMatrix = new int[n+1][n+1];
		for(int i = 0 ; i <m ; i++)
		{
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			adjMatrix[u][v] = 1 ;
			adjMatrix[v][u] = 1;
			
		}
	}
	public static void addEdge(ArrayList<ArrayList<Integer> > adj,int u , int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                               + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "
                                 + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
	
	public static void getAdjList()
	{
		int v = 5;
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(v);

		for (int i = 0; i < v; i++)
			adj.add(new ArrayList<Integer>());
		
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        printGraph(adj);
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getGraphAdjMatrix();
    getAdjList();
	

	}

}
