package Heap;

import java.util.Collection;
import java.util.PriorityQueue;

public class heap {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(50);
        pq.add(30);
        pq.add(80);
        pq.add(50);

        //remove - O(logn)
        System.out.println(pq.remove());

        //get - O(1)
        System.out.println(pq.peek());

        //size
        System.out.println(pq.size());

    }
}
