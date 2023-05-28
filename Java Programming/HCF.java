import java.util.Scanner;


public class HCF {
    public static void main(Stringone args[]){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int ans = 1;
        while(tc!=0){
            int N = sc.nextInt();
            int[] quantity = new int[N];

            for(int i=0; i<N; i++){
                quantity[i] = sc.nextInt();
                if(i>0 && i==1){
                    ans  = findHCF(quantity[0], quantity[1]);

                }else{
                    ans = findHCF(quantity[i], ans);

                }
            }
            for(int i=0; i<N; i++){
                System.out.print(quantity[i]/ans+ " ");

            }
            System.out.println();
            tc--;
        }


    }
    public static int findHCF(int x, int y){
        while(y!=0){
            if(x<y){
                x=x-y;
            }else{
                y=y-x;
            }
        }
        return x;
    }
}
