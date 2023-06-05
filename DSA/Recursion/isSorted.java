package Recursion;

public class isSorted {
    public static boolean Sorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return Sorted(a, i+1);
    }
    public static void main(String[] args) {
        int a[] ={1,1,2,3,4};
        System.out.println(Sorted(a,0));
    }
}
