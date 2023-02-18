
import java.util.Scanner;
import java.util.*;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit =0;

            while (num>0){
                num/=10;
                digit++;
            }

        System.out.print(digit);

    }
}
