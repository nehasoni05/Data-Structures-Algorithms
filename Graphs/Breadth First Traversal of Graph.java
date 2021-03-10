/*
Sample Input

4
5
0 1
0 2
1 2
2 0
2 3
2
Sample Output

2 0 3 1
*/

import java.io.*; 
import java.util.*;

class Graph 
{ 
  private int V;
  private Map<Integer, List<Integer>> adjVertices;
  public Graph(int V) {
      this.V = V;
    this.adjVertices = new HashMap<Integer, List<Integer>>();
  }
  public void addVertex(int vertex) {
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }
  public void addEdge(int src, int dest) {
    adjVertices.get(src).add(dest);
  }
  
  void BFS(int v) 
{ 
	boolean[] visited=new boolean[V];
  	Queue<Integer> q=new LinkedList<Integer>();
  	visited[v]=true;
  	q.add(v);
  	while(!q.isEmpty())
    {
      int current=q.poll();
      System.out.print(current+" ");
      
      //visit neighbours of current node
      Iterator<Integer> neighbour = adjVertices.get(current).listIterator();
      while(neighbour.hasNext())
      {
        int n=neighbour.next();
        if(!visited[n])
        {
          q.add(n);
          visited[n]=true;
        }
      }
    }
  	
} 
}
class Main {  
  public static void main(String args[]) {
    int V,E,v1,v2,s,i;
    Scanner sc = new Scanner(System.in);
    V = Integer.parseInt(sc.nextLine().trim());
    E = Integer.parseInt(sc.nextLine().trim());
    Graph g = new Graph(V);
    for(i=0;i<V;i++)
      g.addVertex(i);
    for(i=0;i<E;i++)
    {
      v1 = sc.nextInt();
      v2 = Integer.parseInt(sc.nextLine().trim());
      g.addEdge(v1, v2);
    }
    s = Integer.parseInt(sc.nextLine().trim());
    g.BFS(s); 
  } 
}
