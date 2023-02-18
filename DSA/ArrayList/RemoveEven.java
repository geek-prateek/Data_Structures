package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(9);
        list.add(8);
        list.add(7);

        RemoveEven(list);

        System.out.println(list);
    }
    public static void RemoveEven(ArrayList<Integer> list){

        for(int i= list.size()-1; i>=0; i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
    }
}
