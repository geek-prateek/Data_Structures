package Recursion;

public class power {
    public static int power(int x, int n){
        //optimized --> tc O(logn)
        if(n==0){
            return 1;
        }
        int half = power(x,n/2);
        int halfpower = half * half;
        //n is odd
        if(n % 2!=0){
            halfpower = x * halfpower;
        }
        return halfpower;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
