package Patterns;
import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer[][] arr = new Integer[N][N];
        Integer[][] transpose = new Integer[N][N];

        for (Integer i=0;i<N;i++) {
            for (Integer j=0;j<N;j++) {
                arr[i][j]=0;
            }
        }

        Integer count=1;
        for (Integer i=0;i<N;i++) {
            for (Integer j=0;j<=i;j++) {
                arr[i][j]=count;
                count++;
            }
        }

        boolean flip=false;
        for (Integer i=N-1;i>=0;i--) {
            if (flip==false) {
                flip=true;
            }
            else {
                Arrays.sort(arr[i], Collections.reverseOrder());
                flip=false;
            }
            for (Integer j=0;j<N;j++) {
                transpose[j][N-i-1] = arr[i][N-j-1];
            }
        }

        for (Integer i=0;i<N;i++) {
            for (Integer j=0;j<N;j++) {
                if (transpose[i][j] != 0)
                    System.out.print(Integer.toString(transpose[i][j]) + " ") ;
            }
            System.out.println("");
        }
    }
}
