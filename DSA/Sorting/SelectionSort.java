package Sorting;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {2,3,5,-1,4,7,2,8};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minval = arr[i];
            int minidx = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<minval){
                    minval = arr[j];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

}
