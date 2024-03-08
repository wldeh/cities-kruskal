package Kruskal;

import java.util.*;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        DisjointSetClass
 * Description  A class implementing the Disjoint Set data structure, used in
 *              Kruskal's algorithm to find the minimum spanning tree in a graph.
 * Platform     jdk 1.8.0_241; PC Windows 11
 * History log
 * @author      <i>wldeh</i>
 * @version     1.0
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class DisjointSetClass {

  private static double totalWeight = 0;
  private Map<Integer, Integer> parent = new HashMap<>();

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Constructor  DisjointSetClass
   * Description  Initializes the disjoint set structure.
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public DisjointSetClass() {
    totalWeight = 0;
    parent.clear();
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       makeSet
   * Description  Creates a new set for each vertex in the graph.
   * @param       numberOfVertices int
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void makeSet(int numberOfVertices) {
    for (int i = 0; i < numberOfVertices; i++) {
      parent.put(i, i);
    }
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       find
   * Description  Finds the representative of the set containing 'k'
   * @param       k int
   * @return      int
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private int find(int k) {
    if (parent.get(k) == k) {
      return k;
    }
    int root = find(parent.get(k));
    parent.put(k, root);
    return root;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       union
   * Description  Unites two sets that contain elements 'a' and 'b'.
   * @param       a int
   * @param       b int
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  private void union(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    parent.put(rootA, rootB);
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       kruskalAlgorithm
   * Description  Implements Kruskal's algorithm to find the minimum spanning tree (MST)
   *              for a given graph.
   * @param       edges List
   * @param       numberOfVertices int
   * @return      List
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public static List<WeightedEdge> kruskalAlgorithm(
    List<WeightedEdge> edges,
    int numberOfVertices
  ) {
    Collections.sort(edges);
    DisjointSetClass ds = new DisjointSetClass();
    ds.makeSet(numberOfVertices);
    List<WeightedEdge> mst = new ArrayList<>();
    totalWeight = 0;

    int edgeIndex = 0;

    while (mst.size() < numberOfVertices - 1 && edgeIndex < edges.size()) {
      WeightedEdge edge = edges.get(edgeIndex);
      int rootU = ds.find(edge.u);
      int rootV = ds.find(edge.v);

      // If u and v belong to different sets
      if (rootU != rootV) {
        mst.add(edge);
        totalWeight += edge.weight;
        ds.union(edge.u, edge.v);
      }
      edgeIndex++;
    }

    return mst;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   *<pre>
   * Method       getTotalWeight
   * Description  Returns the total weight of the minimum spanning tree found by
   *              Kruskal's algorithm.
   * @return      double
   * Date         11/28/2023
   * History log
   * @author      <i>wldeh</i>
   *</pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public static double getTotalWeight() {
    return totalWeight;
  }
}
