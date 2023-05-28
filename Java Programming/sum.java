import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        for(int i = 100; i <= 999; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                sum += num%10;
                num = num/10;
            }
            if(sum==6){
                System.out.println(i);
            }
        }
    }
}
