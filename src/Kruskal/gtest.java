package Kruskal;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author 5stee
 */
public class gtest {
  public static void main(String[] args) {
  
    Integer[] vertices = {0, 1, 2, 3, 4};
    
    int[][] edges = {
      {0, 1}, {0, 2}, 
      {1, 0}, {1, 2}, {1, 3}, {1, 4},
      {2, 0}, {2, 1}, {2, 3}, 
      {3, 1}, {3, 2}, {3, 4}, 
      {4, 1}, {4, 3}
    };
    
    Graph<Integer> graph1 = new UnweightedGraph<>(vertices, edges);
    AbstractGraph<Integer>.Tree bfs = graph1.bfs(0); 
    System.out.println(bfs.getPath(4));

  }
}
