package packageBigOnotation;

public class Main {
    // Notes on Big-O notation

    // How code slows as data grows
    // Describes the performance of an algorithm as the amount of data increases
    // Machine independent (# of steps to completion)
    // Ignore smaller operations O(n + 1) -> O(n)

    // examples:            n = amount of data (it's a variable like x)
    // O(1)
    // O(n)
    // O(log n)
    // O(n^2)

    // O (1) constant time:
    // random access of an element in an array
    // inserting at the beginning of the LinkedList

    // O (log n) logarithmic time
    // binary search

    // O(n) linear time
    // looping through elements in an array
    // searching through a LinkedList

    // O (n log n) quasilinear
    // quick sort
    // merge sort
    // heapsort

    // O (n^2) quadratic time
    // insertion sort
    // selection sort
    // bubble sort

    // O (n!) factorial time
    // traveling salesmen problem

    // Grading scale from best to worst run-time
    // constant time
    // logarithmic time
    // linear time
    // quasilinear time
    // quadratic time
    // factorial time
}
