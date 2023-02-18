import java.util.*;
import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num;
        do{
            num=sc.nextInt();
            sum+=num;
        }while(num>=0);
        System.out.println("Sum :"+sum);
    }
}
