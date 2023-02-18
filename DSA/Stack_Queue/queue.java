package Stack_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    //FIFO
    public static void main(String[] args){
//        Queue<Integer> queue1 = new ArrayDeque<>();
//
//        //add
//        queue1.offer(10);
//        queue1.offer(20);
//        queue1.offer(30);
//        queue1.offer(40);
//
//        //get front element
//        System.out.println(queue1.peek());
//
//        //remove first element
//        System.out.println(queue1.remove());
//        System.out.println(queue1.peek());
//
//        //Size
//        System.out.println(queue1.size());

        //Queue Implementation using LL

        LinkedList<Integer> queue1 = new LinkedList<>();
        queue1.addLast(10);
        queue1.addLast(20);
        queue1.addLast(30);
        queue1.addLast(40);

        System.out.println(queue1.removeFirst());
        System.out.println(queue1.removeFirst());


    }
}
