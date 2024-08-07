package packageAdjacencyList;

import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> adjacencyList;

    Graph(){
        adjacencyList = new ArrayList<>();
    }

    public void addNode(Node node){
        // create a new LinkedList
        LinkedList<Node> currentList = new LinkedList<>();

        currentList.add(node);

        // add LinkedList to ArrayList
        adjacencyList.add(currentList);
    }

    public void addEdge(int src, int dst){
        // return LinkedList
        LinkedList<Node> currentList = adjacencyList.get(src);

        // address of node to link to | get(0) = head of LinkedList
        Node dstNode = adjacencyList.get(dst).get(0);

        // taking node and adding it to the tail
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = adjacencyList.get(src);
        Node dstNode = adjacencyList.get(dst).get(0);

        // iterate over all nodes within current LinkedList
        for(Node node : currentList){
            if (node == dstNode){
                // make sure to check method return type as boolean
                return true;
            }
        }
        return false;
    }

    public void print(){
        // iterate over all LinkedList within ArrayList using nested for-each loop
        for(LinkedList<Node> currentList : adjacencyList){
            for(Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            // print new line
            System.out.println();
        }
    }
}
