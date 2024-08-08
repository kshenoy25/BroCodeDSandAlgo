package packageAdjacencyMatrixAndDepthFirstSearch;

import java.util.ArrayList;

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
    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        // can either implement a depth first search iteratively using stack
        // or utilize call stack using recursion
        // With recursion we check if the node is visited or not
        if(visited[src]){
            return;
        }
        else {
            visited[src] = true;
            // print the node visited
            System.out.println();
            System.out.println(nodes.get(src).data + " = visited");
        }
        // checking to see if element = 1; It would be an adjacent neighbor that way we can travel to
        for (int i =  0;  i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }

        }
        return;
    }


}

