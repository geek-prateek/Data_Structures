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
        int count = 0;
        for(int i=1; i<b; i++){
            if(findGCD(i,b)==1){
                count++;
            }
        }

        System.out.println(count);
    }
}
