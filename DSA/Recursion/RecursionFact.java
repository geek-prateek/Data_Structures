package Recursion;

import java.util.Scanner;

public class RecursionFact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int numfact = fact(n-1);
        return n * numfact;
    }
}
