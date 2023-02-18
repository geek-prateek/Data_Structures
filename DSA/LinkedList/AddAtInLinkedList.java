package LinkedList;

public class AddAtInLinkedList {

    //getting ERROR
    public static class Node{
        int data;
        Node next;
        Node last;
        Node(int val){
            this.data = val;
        }
    }
    public static void main(String[] args) {
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
        head = addat(head, 60, 4);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node addFirst(Node head, int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        return head;
    }
    public static Node addLast(Node head, int val){
        Node n = new Node(val);
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = n;
        return head;
    }

    public static Node addat(Node head, int val, int idx) {
        if(head==null){
            addFirst(head,90);
        }
        Node n = new Node(val);
        int k=0;

        Node temp = head;
        for(int i=1; i<k-1; i++){
            temp = temp.next;
        }
        Node tempp = temp.next;
        temp.next = n;
        n.next = tempp;
        if(idx==0){
            addFirst(head,80);
        }
        if (idx==k){
            addLast(head,70);
        }
        return head;
    }



}
