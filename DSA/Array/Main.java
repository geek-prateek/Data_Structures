package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total items numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            System.out.println("Enter numbers: ");
            arr[i]=sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sum=0;

        //MAX OF ARRAY
        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }

        //SUM OF ARRAY
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("Max of Array: "+max);
        System.out.println("Sum of Array: "+sum);
    }
}