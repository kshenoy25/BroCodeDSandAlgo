package packageBinarySearchTree;

public class Main {
    // Tree = a non-linear data structure where nodes are organized in a hierarchy

    // Binary Search Tree = A tree data structure, where each node is greater than it's left child,
    //                      but less than its right

    //                      Benefit: easy to locate a node when they are in this order

    //                      time complexity: best case O(log n)
    //                                       worst case O(n)

    //                      space complexity: O(n)

    //  NOTE ------- Order in which you insert nodes into binary search tree matters if it is unbalanced
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(3));
        tree.insert(new Node(1));
        tree.insert(new Node(4));
        tree.insert(new Node(8));
        tree.insert(new Node(5));
        tree.insert(new Node(2));

        tree.remove(9);
        tree.display();
        //System.out.println(tree.search(2));

    }
}
