package packageAdjacencyMatrixAndDepthFirstSearch.packageAdjacencyMatrixAndBreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];

    }
    public void addNode(Node node){
        nodes.add(node);


    }
    // dst = destination
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;

    }
    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else{
            return false;
        }

    }
    public void printGraph(){
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();



        for (int i = 0; i < matrix.length; i++) {


            System.out.print(nodes.get(i).data + " ");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void breadthFirstSearch(int src){
        Queue<Integer> queue = new LinkedList<>();

        // mark if node has been visited
        boolean[] visited = new boolean[nodes.size()];
        // can also use.offer
        queue.add(src);
        visited[src] = true;

        while (queue.size() != 0){
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            // iterate and look for any adjacent neighbors
            for (int i = 0; i < matrix[src].length; i++) {

                // check to see if node has already been visited
                if(matrix[src][i] == 1 && !visited[i]){
                    // add to queue if we have an adjacent neighbor that has not been visited
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}

