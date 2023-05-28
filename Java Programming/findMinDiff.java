import java.util.Arrays;

public class findMinDiff {
    static int mindiff(int arr[], int n, int m){
        if(m==0||n==0){
            return 0;
        }
        Arrays.sort(arr);
        if(n<m){
            return -1;
        }
        int diff = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int dif = arr[i+m-1]-arr[i];
            if(dif<diff){
                diff = dif;
            }
        }
        return diff;
    }
    public static void main(String[] args){
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50 };

        int m = 7; // Number of students

        int n = arr.length;
        System.out.println("Minimum difference is "
                + mindiff(arr, n, m));
    }
}
