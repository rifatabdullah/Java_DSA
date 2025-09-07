package Lab_9;

// GrpahDemo.java
public class GraphDemo {
    public static void main(String[] args) {
        int V = 5; // number of vertices
        EdgeNode[] adjList = new EdgeNode[V]; // array of adjacency lists

        // Add edges (undirected)
        GraphUtils.addEdge(adjList, 0, 1, 2);
        GraphUtils.addEdge(adjList, 0, 3, 6);
        GraphUtils.addEdge(adjList, 2, 3, 1);
        GraphUtils.addEdge(adjList, 2, 4, 4);

        // Show adjacency list
        System.out.println("Adjacency List Representation:");
        GraphUtils.showAdjList(adjList);
    }

}