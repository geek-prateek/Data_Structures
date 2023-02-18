package Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {2,5,3,6,4};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        for(int i=1; i< arr.length; i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
