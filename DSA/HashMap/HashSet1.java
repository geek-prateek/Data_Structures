package HashMap;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.contains(10));
        System.out.println(set.contains(15));

        set.remove(10);
        System.out.println(set.contains(10));

        System.out.println(set.size());

    }
}
