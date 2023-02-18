public class ColumnPrint {
    public static void main(String[] args){
        int[][] arr ={
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
