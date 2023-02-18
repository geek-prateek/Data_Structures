import java.util.Scanner;

class SumOfTwoMatrices {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        matrixRead(a);
        matrixRead(b);

        int[][] c = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j]);
            }
        }
    }

    static void matrixRead(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
}
