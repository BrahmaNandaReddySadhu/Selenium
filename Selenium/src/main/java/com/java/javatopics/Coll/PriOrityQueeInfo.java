package com.java.javatopics.Coll;

import java.util.PriorityQueue;

public class PriOrityQueeInfo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();

        priorityQueue.add(8);
        priorityQueue.offer(2);
        priorityQueue.offer(5);
        priorityQueue.offer(7);
        System.out.println(priorityQueue); // [2, 7, 5, 8]

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.remove());

        System.out.println(priorityQueue);


        System.out.println(priorityQueue.remove());

        System.out.println(priorityQueue);


        System.out.println(priorityQueue.remove());

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);
    }

}
