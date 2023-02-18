package LinkedList;

import java.util.LinkedList;

public class RemoveInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data= val;
        }
    }
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Node head = n1;
        head = RemoveAt(head,2);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node removeFirst(Node head){
        if(head==null){
            return null;
        }
        head = head.next;
        return head;
    }

    public static Node removeLast(Node head){
        if(head == null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static Node RemoveAt(Node head, int idx){
        if(idx==0){
            removeFirst(head);
        }
        if(idx==5){
            removeLast(head);
        }
        Node temp = head;
        for(int i = 1; i< idx-1; i++){
            temp=temp.next;
        }
        Node tempp1 = temp.next.next;
        temp.next=tempp1;
        return head;
    }
}
