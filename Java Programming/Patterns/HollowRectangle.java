package Patterns;

public class HollowRectangle {
    public static void hollow_rectangle(int rows, int cols){
        for(int i=1; i<=rows; i++){     // outer loop
            for(int j=1; j<=cols; j++){ // inner loop - columns
                if(i==1 || i==rows || j==1 || j==cols){     // cell(i,j)
                    System.out.print("*");      //boundary cells
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4,5);
    }
}
