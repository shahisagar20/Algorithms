package GraphAlgorithms;

import java.util.*;

public class Graph {

    private int vertex;
    private LinkedList<Integer> adj[];

    public  Graph(int V){
        if (V <=0) throw new IllegalArgumentException("There should be at least one vertex");
        this.vertex = V;
        adj =  new LinkedList[V];
        for (int v = 0; v<V; v++){
            adj[v] = new LinkedList<Integer>();
        }
    }
    void addEdge(int v, int e){
        adj[v].add(e);
    }

        void BFS(int s)
        {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[vertex];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[s]=true;
            queue.add(s);

            while (queue.size() != 0)
            {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s+" ");

                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<Integer> i = adj[s].listIterator();
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

        void DFS(int s) {
            Stack<Integer> myStack = new Stack<>();
            boolean [] myTrack = new boolean[vertex];
            myStack.add(s);
            while (!myStack.empty()){
                myTrack[s] = true;
                s = myStack.pop();
                System.out.print(s+" ");
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()){
                    int n = i.next();
                    if (!myTrack[n]){
                        myTrack[n]=true;
                        myStack.add(n);
                    }
                }
            }
        }

    public static void main(String args[])
    {
        Graph g = new Graph(10);

        g.addEdge(8, 6);
        g.addEdge(8, 5);
        g.addEdge(6, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 9);
        g.addEdge(5, 4);
        g.addEdge(4,6);
        g.addEdge(6,8);
        g.addEdge(5,8);
        g.addEdge(9,5);


        System.out.println("Following is Breadth First Traversal at given node");

        g.BFS(4);
        System.out.println();

        System.out.println("Depth first at given node: ");
        g.DFS(6);

    }

}
