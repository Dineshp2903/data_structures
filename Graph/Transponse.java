package Graph;


import java.util.*;

public class Transpose {
	
	public static int VERTICES = 5;
	
	
	public static ArrayList<Integer>[] graph = new ArrayList[VERTICES];
	
	public static ArrayList<Integer>[] transpose = new ArrayList[VERTICES];
	
	
	
	public static void addedge(int u , int v , Boolean grap)
	{
		if(!grap)
		{
			graph[u].add(v);
		}
		else {
			transpose[u].add(v);
		}
	}
	
	
	
	public static void transpose()
	{
		for(int i = 0 ; i <VERTICES ; i++)
		{
			ArrayList<Integer> vals = graph[i];
			
			for(int j = 0 ; j< vals.size();j++)
			{
				//System.out.println(i+ "  "+j);
				addedge(vals.get(j),i,true);
			}
		}
	}
	
	public static void print(ArrayList<Integer>[] g)
	{
		for(int i = 0 ; i <VERTICES ; i++)
		{
			ArrayList<Integer> vals = g[i];
			System.out.print(i+" ---->   ");
			for(int j = 0 ; j< vals.size();j++)
			{
				System.out.print(vals.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		
		
		
		for(int i = 0 ; i< VERTICES ; i++)
		{
			graph[i] = new ArrayList<Integer>();
			transpose[i] = new ArrayList<Integer>();
		}
		
		addedge(0, 1, false);
        addedge(0, 4, false);
        addedge(0, 3, false);
        addedge(2, 0, false);
        addedge(3, 2, false);
        addedge(4, 1, false);
        addedge(4, 3, false);
        
        transpose();
        
        
        print(graph);
        System.out.println("Transponse -------");
        print(transpose);
        
        
	}

}
