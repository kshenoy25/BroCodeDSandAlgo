package packageAdjacencyMatrixAndDepthFirstSearch.packageAdjacencyMatrixAndBreadthFirstSearch;

public class Main {
    // Adjacency Matrix = A 2D array to store 1's/0's ~ true/false to represent edges
    //                    # of rows = # of unique nodes
    //                    # of columns = # of unique nodes

    //                    runtime complexity to check an Edge: O(1)
    //                    space complexity: O(v^2)

    // Breadth First Search = a search algorithm for traversing a tree or graph data structure
    //                        This is done one "level" at a time,
    //                        rather than one "branch" at a time

    // KEY POINTS (BFS)
    // - Traverse a graph level by level
    // - Utilizes a Queue
    // - Better if destination is on average close to start
    // - Siblings are visited before children

    // KEY POINTS (DFS)
    // - Traverse a graph branch by branch
    // - Utilizes a Stack
    // - Better if destination is on average far from the start
    // - Children are visited before siblings
    // - More popular for games/puzzles


    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,1);

        graph.printGraph();

        graph.breadthFirstSearch(2);
        //System.out.println(graph.checkEdge(3,2));



    }
}
