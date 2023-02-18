package Heap;

import java.util.PriorityQueue;

public class kLargestElementHEAP {
    public static void main(String[] args){
        int[] arr = {10,2,40,30,2,9};
        kLargestElement(arr,3);
    }
    public static void kLargestElement(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i =0;
        while(i<k){
            pq.add(arr[i]);
            i++;
        }
        while (i<arr.length){
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
            else{
                //do nothing
            }
            i++;
        }
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
