import java.util.*;
public class RandomGame {
    //generate random num b/w 1-10 and stop when get 5 and skip all multiples of 4
    public static void main(String[] args){
        while(true){
            int num=(int)(Math.random()*10+1);
            if(num==5){
                break;
            }
            if(num%4==0){
                continue;
            }
            System.out.print(num + " ");
        }
    }

}
