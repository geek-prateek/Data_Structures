package Recursion;

public class Recursion {
    public static void main(String[] args){
        printIncreasing(7);
    }
    public static void printIncreasing(int N){
        if(N==0){
            return;
        }
        printIncreasing(N-1);
        System.out.print(N+" ");
    }
}
