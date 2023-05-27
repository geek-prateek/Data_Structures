package TwoDArrays;

public class staircaseSearch {
    public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row< matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println(row+","+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] ={{10,20,30,40},
                {50,60,70,80},
                {90,23,23,34},
                {25,25,34,89}};
        int key=89;
        stairCaseSearch(matrix, key);
    }
}
