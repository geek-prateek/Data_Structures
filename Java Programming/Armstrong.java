import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int sum = 0;
        int n = a;
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }
        if(a == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
