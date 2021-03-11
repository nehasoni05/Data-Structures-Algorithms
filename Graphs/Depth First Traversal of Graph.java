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

2 0 1 3
*/

import java.io.*; 
import java.util.*;

class Graph 
{ 
  private Map<Integer, List<Integer>> adjVertices;
  public Graph() {
    this.adjVertices = new HashMap<Integer, List<Integer>>();
  }
  public void addVertex(int vertex) {
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }
  public void addEdge(int src, int dest) {
    adjVertices.get(src).add(dest);
  }
  void DFSUtil(int v, boolean visited[]) 
{ 
   	visited[v]=true;
	System.out.print(v+" ");
  Iterator<Integer> itr=adjVertices.get(v).listIterator();
  
  while(itr.hasNext())
  {
     int n = itr.next();
    if(!visited[n])
    {
      DFSUtil(n,visited);
    }
  }
} 

void DFS(int v) 
{ 
boolean[] visited=new boolean[adjVertices.size()];
  DFSUtil(v,visited);
}
  }
class Main 
{  
  public static void main(String args[]) 
  {
    int V,E,v1,v2,s,i;
    Scanner sc = new Scanner(System.in);
    V = Integer.parseInt(sc.nextLine().trim());
    E = Integer.parseInt(sc.nextLine().trim());
    Graph g = new Graph();
    for(i=0;i<V;i++)
      g.addVertex(i);
    for(i=0;i<E;i++)
    {
      v1 = sc.nextInt();
      v2 = Integer.parseInt(sc.nextLine().trim());
      g.addEdge(v1, v2);
    }
    s = Integer.parseInt(sc.nextLine().trim());
    g.DFS(s); 
  } 
}
