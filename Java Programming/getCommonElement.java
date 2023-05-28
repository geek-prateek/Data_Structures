import java.util.HashMap;

public class getCommonElement {
        public static void main(String[] args){
            int[] arr1= {1,2,3,4,5,6};
            int[] arr2= {2,3,4,5,6,7};
            int[] arr3= {3,4,5,6,7,8};
            getCommonElement(arr1,arr2,arr3);
        }
        public static void getCommonElement(int[] arr1, int[] arr2, int[] arr3) {
            HashMap<Integer, Integer> map = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            for (int i = 0; i < arr1.length; i++) {
                map.put(arr1[i], 1);
            }
            for (int i = 0; i < arr2.length; i++) {
                if (map.containsKey(arr2[i])) {
                    map2.put(arr1[i],1);
                }
            }
            for (int i = 0; i < arr3.length; i++) {
                if (map.containsKey(arr3[i])) {
                    System.out.println(arr3[i]);
                }
            }
        }
}
