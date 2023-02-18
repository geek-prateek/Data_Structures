package HashMap;

import java.util.HashSet;

public class FirstRepeatingChar {
    public static void main(String[] args){
        String st = "abssbsajj";
        firstRepeatingchar(st);

    }

    public static void firstRepeatingchar(String st){
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);

            if(set.contains(ch)){
                System.out.println(ch);
                return;
            }else{
                set.add(ch);
            }
        }
        System.out.println(-1);
    }
}
