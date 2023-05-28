import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String rev = "";
        for(int i=input.length()-1; i>=0; i--){
            rev += input.charAt(i);
        }
        if(rev.equals(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
