package Bit_Manipulation;

public class oddOREven {
    public static void oddEven(int n){
        int bitmask =1;
        if((n & bitmask)==0){
            //even
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddEven(5);
        oddEven(11);
        oddEven(6);
    }
}
