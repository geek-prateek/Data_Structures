package Stack_Queue;

import java.util.LinkedList;
import java.util.Stack;

public class Stacks {
    //LIFO
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        //add
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);

        //peek
        System.out.println(st.peek());   //50

        //size
        System.out.println(st.size());    //4

        //remove
        System.out.println(st.pop());     //50
        System.out.println(st.peek());    //30

        //Stack implementation using LL

        LinkedList<Integer> stack1 = new LinkedList<>();

        stack1.addFirst(10);
        stack1.addFirst(20);
        stack1.addFirst(30);
        stack1.addFirst(40);

        System.out.println(stack1.removeFirst());
        System.out.println(stack1.removeFirst());
    }
}
