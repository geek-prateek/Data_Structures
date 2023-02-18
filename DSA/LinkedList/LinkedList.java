package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
    }
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        head = printLL(head);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    //print linkedlist
    public static Node printLL(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
        return head;
    }

    //Search K in Linked list
//ERROR
//    public static boolean search(Node head, int k){
//        Node temp = head;
//        while(temp!=null){
//            if(temp.data==k){
//                return true;
//            }
//            temp = temp.next;
//        }
//        return false;
//    }

    //Length of LL
    //ERROR
//    int lengthLL(Node head){
//        Node temp = head;
//        int count = 0;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//       return count;
//    }
}
