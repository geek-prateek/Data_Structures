package BinarySearchTrees;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2BST {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static Node mergeBSTs(Node root1, Node root2){
        //step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //merge
        int i=0, j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i< arr1.size() && j< arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                ans.add(arr1.get(i));
                i++;
            }else{
                ans.add(arr2.get(j));
                j++;
            }
        }
        while(i< arr1.size()){
            ans.add(arr1.get(i));
            i++;
        }
        while (j< arr2.size()){
            ans.add(arr2.get(j));
            j++;
        }

        //sorted AL -> balanced BST
        return createBST(ans, 0, ans.size()-1);
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        //O(n+m) -> Linear
        Node root = mergeBSTs(root1, root2);
        preOrder(root);
    }
}
