import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class getCommonElement {
        public static void main(String[] args){
            int[] arr1= {1,2,3,4,5,6};
            int[] arr2= {2,3,4,5,6,7};
            int[] arr3= {3,4,5,6,7,8};
            System.out.println(getCommonElement(arr1,arr2,arr3));
        }
        public static ArrayList<Integer> getCommonElement(int[] arr1, int[] arr2, int[] arr3) {
            HashMap<Integer, Integer> map = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < arr1.length; i++) {
                map.put(arr1[i], 0);
            }
            for (int i = 0; i < arr2.length; i++) {
                if (map.containsKey(arr2[i])) {
                    map2.put(arr2[i],0);
                }
            }
            for (int i = 0; i < arr3.length; i++) {
                if (map2.containsKey(arr3[i])) {
                    set.add(arr3[i]);
                }
            }
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            return list;
        }
}
