import java.util.Arrays;
import java.util.Scanner;


public class Stringone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String rev = "";
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
//      Arrays.sort(words);

        for(int chindex = 0; chindex < words.length/2; chindex++){
            String temp = words[chindex];
            words[chindex] = words[words.length - chindex - 1];
            words[words.length - chindex - 1] = temp;
        }

        for(int i=0; i< words.length; i++){
            rev+=words[i]+" ";
        }

        System.out.println(rev);
    }
}
