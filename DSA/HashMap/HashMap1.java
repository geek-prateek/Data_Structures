package HashMap;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        //add - O(1)
        hm.put("India",1);
        hm.put("Srilanka",2);
        hm.put("Australia",3);
        hm.put("England",4);
        hm.put("New Zealand",5);

        //get - O(1)
        System.out.println(hm.get("India"));

        //to check whether key value is present or not - O(1)
        System.out.println(hm.containsKey("Kenya"));

        //traverse on key - O(1)
        for(String s : hm.keySet()){
            System.out.println(s);
        }

        //size of hashmap - O(1)
        System.out.println(hm.size());

        //remove from hashmap - O(1)
        hm.remove("England");
        System.out.println(hm.containsKey("England"));
    }

}
