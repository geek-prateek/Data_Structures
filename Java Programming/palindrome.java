import java.util.Scanner;

public class palindrome {   //Tenet=true
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString().toLowerCase();

        if(str.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
