import java.util.Scanner;

public class EulerTotient {
    public static int findGCD(int a, int b){
        while(b!=0){
            if(a>b){
                a = a-b;
            }else{
                b= b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a =1;
        int phi = 0;
        int count = 0;
        for(int i=a; i<b; i++){
            phi = findGCD(a,b);
            if(phi==1){
                count++;
            }
        }

        System.out.println(count);
    }
}
