package Recursion;

public class firstOccur {
    public static int firstOccur(int[] a, int key, int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOccur(a, key, i+1);
    }
    public static void main(String[] args) {
        int a[] = {5,2,3,3,4,5,1,1};
        System.out.println(firstOccur(a, 3, 0));
    }
}
