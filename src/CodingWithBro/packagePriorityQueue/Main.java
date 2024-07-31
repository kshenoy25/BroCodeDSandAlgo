package packagePriorityQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Priority Queue = FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority

        // Queues are interfaces - use Class that utilizes Queue interface
        //Queue<Double> queue = new LinkedList<>();
        //Queue<Double> queue = new PriorityQueue<>();

        // reverse order of queue
        //Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        //queue.offer(3.0);
        //queue.offer(4.0);
        //queue.offer(1.0);
        //queue.offer(2.0);

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("F");


        while (!queue.isEmpty()) {
            // first come first serve order
            System.out.println(queue.poll());
        }

    }
}
