package Stack_Queue;

import java.util.*;


public class ReverseKelementsQueue {
    public static void main(String[] args){

    }
    public static void reverse(Queue<Integer> queue, int k){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<k; i++){
            st.push(queue.remove());
        }

        for(int i=0; i<k; i++){
            queue.offer(st.pop());
        }

        int count = queue.size()-k;

        for(int i=0; i<count; i++){
            queue.offer(queue.remove());
        }
    }
}
