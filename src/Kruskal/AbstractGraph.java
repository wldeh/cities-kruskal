package Kruskal;

import java.util.*;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Interface    AbstractGraph.java
 * Description  Crucial abstract class that overrides the Graph abstract methods
 *              and provides a number of other methods to be used by the
 *              UnweightedGraph and WeightedGraph classes
 * Platform     jdk 1.8.0_241; PC Windows 11
 * History Log
 * @author	    <i>wldeh</i>
 * @version 	  %1% %2%
 * @param       <V> generic type
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public abstract class AbstractGraph<V> implements Graph<V> {

  protected List<V> vertices = new ArrayList<>(); // Store vertices
  protected List<List<Edge>> neighbors = new ArrayList<>(); // Adjacency lists

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       AbstractGraph (Constructor)
   * Description  Construct an empty graph.
   * Date         11/28/2023
   * History Log
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  protected AbstractGraph() {}

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Constructor  AbstractGraph
   * Description  Constructs a graph from vertices and edges stored in arrays.
   *              Initializes the graph creates adjacency lists
   * Date         11/28/2023
   * History Log
   * @param       vertices array of generic type V
   * @param       edges 2D array of integers representing edges
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  protected AbstractGraph(V[] vertices, int[][] edges) {
    for (int i = 0; i < vertices.length; i++) addVertex(vertices[i]);

    createAdjacencyLists(edges, vertices.length);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Constructor  AbstractGraph
   * Description  Constructs a graph from a list of vertices and a list of edges.
   *              Initializes the graph with the given vertices and creates
   *              adjacency lists based on the provided edge list.
   * Date         11/28/2023
   * History Log
   * @param       vertices List of vertices of generic type V.
   * @param       edges List of Edge objects representing the edges.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  protected AbstractGraph(List<V> vertices, List<Edge> edges) {
    for (int i = 0; i < vertices.size(); i++) addVertex(vertices.get(i));

    createAdjacencyLists(edges, vertices.size());
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Constructor  AbstractGraph
   * Description  Constructs a graph for integer vertices and a list of edges.
   * Date         11/28/2023
   * History Log
   * @param       edges List of Edge objects representing the edges.
   * @param       numberOfVertices The number of vertices in the graph.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  protected AbstractGraph(List<Edge> edges, int numberOfVertices) {
    for (int i = 0; i < numberOfVertices; i++) addVertex((V) (new Integer(i))); // vertices is {0, 1, ...}

    createAdjacencyLists(edges, numberOfVertices);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Constructor  AbstractGraph
   * Description  Constructs a graph from integer vertices and an edge array.
   * Date         11/28/2023
   * History Log
   * @param       edges 2D array of integers representing the edges.
   * @param       numberOfVertices The number of vertices in the graph.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  protected AbstractGraph(int[][] edges, int numberOfVertices) {
    for (int i = 0; i < numberOfVertices; i++) addVertex((V) (new Integer(i))); // vertices is {0, 1, ...}

    createAdjacencyLists(edges, numberOfVertices);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       createAdjacencyLists
   * Description  Private helper method to create adjacency lists for each vertex
   *              from a 2D array of edges.  .
   * Date         11/28/2023
   * History Log
   * @param       edges 2D array of integers representing the edges.
   * @param       numberOfVertices The number of vertices in the graph.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
    for (int i = 0; i < edges.length; i++) {
      addEdge(edges[i][0], edges[i][1]);
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       createAdjacencyLists
   * Description  Private helper method to create adjacency lists for each vertex
   *              from a list of edges.
   * Date         11/28/2023
   * History Log
   * @param       edges List of Edge objects representing the edges.
   * @param       numberOfVertices The number of vertices in the graph.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
    for (Edge edge : edges) {
      addEdge(edge.u, edge.v);
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getSize
   * Description  Return the number of vertices in the graph.
   * Date         11/28/2023
   * History Log
   * @return      int representing the number of vertices
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override
  public int getSize() {
    return vertices.size();
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getVertices
   * Description  Returns a list of all vertices in the graph.
   * Date         11/28/2023
   * History Log
   * @return      List of vertices of type V.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override
  public List<V> getVertices() {
    return vertices;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getVertex
   * Description  Returns the vertex at the specified index.
   * Date         11/28/2023
   * History Log
   * @param       index Index of the vertex.
   * @return      Vertex of type V at the specified index.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override
  public V getVertex(int index) {
    return vertices.get(index);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getIndex
   * Description  Returns the index of the specified vertex object.
   * Date         11/28/2023
   * History Log
   * @param       v Vertex of type V.
   * @return      int representing the index of the vertex.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override
  public int getIndex(V v) {
    return vertices.indexOf(v);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getNeighbors
   * Description  Returns a list of indices of the neighbors of the vertex
   *              at the specified index.
   * Date         11/28/2023
   * History Log
   * @param       index Index of the vertex.
   * @return      List of integers representing the indices of the neighbors.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Return the neighbors of the specified vertex */
  public List<Integer> getNeighbors(int index) {
    List<Integer> result = new ArrayList<>();
    for (Edge e : neighbors.get(index)) result.add(e.v);

    return result;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getDegree
   * Description  Returns the degree of the vertex at the specified index.
   * Date         11/28/2023
   * History Log
   * @param       v Index of the vertex.
   * @return      int representing the degree of the vertex.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Return the degree for a specified vertex */
  public int getDegree(int v) {
    return neighbors.get(v).size();
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       printEdges
   * Description  Prints the edges of the graph to the console.
   * Date         11/28/2023
   * History Log
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Print the edges */
  public void printEdges() {
    for (int u = 0; u < neighbors.size(); u++) {
      System.out.print(getVertex(u) + " (" + u + "): ");
      for (Edge e : neighbors.get(u)) {
        System.out.print("(" + getVertex(e.u) + ", " + getVertex(e.v) + ") ");
      }
      System.out.println();
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       clear
   * Description  Overrides the clear method from the Graph interface. Clears
   *              all the vertices and edges from the graph, effectively
   *              resetting it.
   * Date         11/28/2023
   * History Log
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Clear graph */
  public void clear() {
    vertices.clear();
    neighbors.clear();
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       addVertex
   * Description  Adds a new vertex to the graph if it is not already present.
   * Date         11/28/2023
   * History Log
   * @param       vertex The vertex to be added to the graph.
   * @return      boolean True if the vertex was added, false otherwise.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Add a vertex to the graph */
  public boolean addVertex(V vertex) {
    if (!vertices.contains(vertex)) {
      vertices.add(vertex);
      neighbors.add(new ArrayList<Edge>());
      return true;
    } else {
      return false;
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       addEdge
   * Description  Protected method to add an edge to the graph using the Edge
   *              inner class. Throws IllegalArgumentException if the edge
   *              vertices are not within valid range.
   * Date         11/28/2023
   * History Log
   * @param       e The edge to be added.
   * @return      boolean True if the edge was added, false otherwise.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  protected boolean addEdge(Edge e) {
    if (e.u < 0 || e.u > getSize() - 1) throw new IllegalArgumentException(
      "No such index: " + e.u
    );

    if (e.v < 0 || e.v > getSize() - 1) throw new IllegalArgumentException(
      "No such index: " + e.v
    );

    if (!neighbors.get(e.u).contains(e)) {
      neighbors.get(e.u).add(e);
      return true;
    } else {
      return false;
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       addEdge
   * Description  Adds an edge to the graph between the specified vertices.
   * Date         11/28/2023
   * History Log
   * @param       u The starting vertex of the edge.
   * @param       v The ending vertex of the edge.
   * @return      boolean True if the edge was added, false otherwise.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Add an edge to the graph */
  public boolean addEdge(int u, int v) {
    return addEdge(new Edge(u, v));
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Class        Edge
   * Description  Inner class representing an edge in the graph. Contains
   *              start and end vertices.
   * Date         11/28/2023
   * History Log
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public static class Edge {

    public int u; // Starting vertex of the edge
    public int v; // Ending vertex of the edge

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Constructor  Edge
     * Description  Constructs an Edge object with the specified start and
     *              end vertices.
     * Date         11/28/2023
     * History Log
     * @param       u The starting vertex of the edge.
     * @param       v The ending vertex of the edge.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Edge(int u, int v) {
      this.u = u;
      this.v = v;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       equals
     * Description  Compares this Edge object to another object for equality.
     *              Returns true if the other object is an Edge with the same
     *              start and end vertices.
     * Date         11/28/2023
     * History Log
     * @param       o The object to be compared with this Edge.
     * @return      boolean True if the given object represents an Edge with
     *              the same start and end vertices as this Edge.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean equals(Object o) {
      return u == ((Edge) o).u && v == ((Edge) o).v;
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       dfs
   * Description  Overrides the dfs method from the Graph interface. Performs
   *              a depth-first search (DFS) starting from the specified vertex.
   *
   * Date         11/28/2023
   * History Log
   * @param       v The starting vertex for the DFS.
   * @return      Tree representing the DFS search tree.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Obtain a DFS tree starting from vertex v */
  /** To be discussed later*/
  public Tree dfs(int v) {
    List<Integer> searchOrder = new ArrayList<>();
    int[] parent = new int[vertices.size()];
    for (int i = 0; i < parent.length; i++) parent[i] = -1; // Initialize parent[i] to -1

    // Mark visited vertices
    boolean[] isVisited = new boolean[vertices.size()];

    // Recursively search
    dfs(v, parent, searchOrder, isVisited);

    // Return a search tree
    return new Tree(v, parent, searchOrder);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       dfs (private)
   * Description  Recursively searches the graph starting from a given vertex.
   * Date         11/28/2023
   * History Log
   * @param       u The vertex to start the DFS.
   * @param       parent Array to store the parent of each vertex.
   * @param       searchOrder List to store the order in which vertices are discovered.
   * @param       isVisited Array to mark visited vertices.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private void dfs(
    int u,
    int[] parent,
    List<Integer> searchOrder,
    boolean[] isVisited
  ) {
    // Store the visited vertex
    searchOrder.add(u);
    isVisited[u] = true; // Vertex v visited

    for (Edge e : neighbors.get(u)) {
      if (!isVisited[e.v]) {
        parent[e.v] = u; // The parent of vertex e.v is u
        dfs(e.v, parent, searchOrder, isVisited); // Recursive search
      }
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       bfs
   * Description  Performs a breadth-first search (BFS) starting from the
   *              specified vertex.
   * Date         11/28/2023
   * History Log
   * @param       v The starting vertex for the BFS.
   * @return      Tree representing the BFS search tree.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override/** Starting bfs search from vertex v */
  /** To be discussed in later */
  public Tree bfs(int v) {
    List<Integer> searchOrder = new ArrayList<>();
    int[] parent = new int[vertices.size()];
    for (int i = 0; i < parent.length; i++) parent[i] = -1; // Initialize parent[i] to -1

    java.util.LinkedList<Integer> queue = new java.util.LinkedList<>(); // list used as a queue
    boolean[] isVisited = new boolean[vertices.size()];
    queue.offer(v); // Enqueue v
    isVisited[v] = true; // Mark it visited

    while (!queue.isEmpty()) {
      int u = queue.poll(); // Dequeue to u
      searchOrder.add(u); // u searched
      for (Edge e : neighbors.get(u)) {
        if (!isVisited[e.v]) {
          queue.offer(e.v); // Enqueue w
          parent[e.v] = u; // The parent of w is u
          isVisited[e.v] = true; // Mark it visited
        }
      }
    }

    return new Tree(v, parent, searchOrder);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Class        Tree
   * Description  Inner class representing a tree structure
   * Date         11/28/2023
   * History Log
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public class Tree {

    private int root; // The root of the tree
    private int[] parent; // Store the parent of each vertex
    private List<Integer> searchOrder; // Store the search order

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Constructor  Tree
     * Description  Constructs a Tree object with the specified root, parent,
     *              and search order.
     * Date         11/28/2023
     * History Log
     * @param       root The root vertex of the tree.
     * @param       parent Array representing the parent of each vertex.
     * @param       searchOrder List representing the order in which vertices
     *              were found during the search.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Tree(int root, int[] parent, List<Integer> searchOrder) {
      this.root = root;
      this.parent = parent;
      this.searchOrder = searchOrder;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getRoot
     * Description  Returns the root of this tree.
     * Date         11/28/2023
     * History Log
     * @return      The root vertex of the tree.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getRoot() {
      return root;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getParent
     * Description  Returns the parent of a vertex in this tree.
     * Date         11/28/2023
     * History Log
     * @param       v The vertex whose parent is to be determined.
     * @return      The parent vertex of the specified vertex.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getParent(int v) {
      return parent[v];
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getSearchOrder
     * Description  Returns the list representing the order in which vertices
     *              were visited during the search.
     * Date         11/28/2023
     * History Log
     * @return      List of integers representing the search order.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public List<Integer> getSearchOrder() {
      return searchOrder;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getNumberOfVerticesFound
     * Description  Returns the number of vertices found during the search.
     * Date         11/28/2023
     * History Log
     * @return      The number of vertices found.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getNumberOfVerticesFound() {
      return searchOrder.size();
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getPath
     * Description  Returns the path from a specified vertex to the root of the tree.
     * Date         11/28/2023
     * History Log
     * @param       index The index of the vertex.
     * @return      List of vertices representing the path from the specified vertex to the root.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public List<V> getPath(int index) {
      ArrayList<V> path = new ArrayList<>();

      do {
        path.add(vertices.get(index));
        index = parent[index];
      } while (index != -1);

      return path;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       printPath
     * Description  Prints the path from the root to a specified vertex.
     * Date         11/28/2023
     * History Log
     * @param       index The index of the vertex.
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void printPath(int index) {
      List<V> path = getPath(index);
      System.out.print(
        "A path from " +
        vertices.get(root) +
        " to " +
        vertices.get(index) +
        ": "
      );
      for (int i = path.size() - 1; i >= 0; i--) System.out.print(
        path.get(i) + " "
      );
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       printTree
     * Description  Prints the entire tree structure.
     * Date         11/28/2023
     * History Log
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void printTree() {
      System.out.println("Root is: " + vertices.get(root));
      System.out.print("Edges: ");
      for (int i = 0; i < parent.length; i++) {
        if (parent[i] != -1) {
          // Display an edge
          System.out.print(
            "(" + vertices.get(parent[i]) + ", " + vertices.get(i) + ") "
          );
        }
      }
      System.out.println();
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       printTree
     * Description  Print the whole tree and return a string representation.
     * Date         11/17/2023
     * History Log
     * @author      <i>wldeh</i>
     * @param       out StringBuffer
     * @return      StringBuffer
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public StringBuffer printTree(StringBuffer out) {
      out = new StringBuffer(); //clear
      out.append("Root is: " + vertices.get(root));
      out.append("\nMST Edges: ");
      for (int i = 0; i < parent.length; i++) {
        if (parent[i] != -1) {
          // Display an edge
          out.append(
            "(" + vertices.get(parent[i]) + ", " + vertices.get(i) + ") "
          );
        }
      }
      out.append("\n");
      // The rest of the code is not visible in the image.
      return out;
    }
  }
}
