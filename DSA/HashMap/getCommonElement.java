package HashMap;

import java.util.HashMap;

public class getCommonElement {
    public static void main(String[] args){
        int[] arr1= {5,9,8,6,3,2,10};
        int[] arr2= {5,4,9,7,1,6,20};
        getCommonElement(arr1,arr2);
    }
    public static void getCommonElement(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr1.length; i++){
            map.put(arr1[i],1);
        }
        for(int i=0; i< arr2.length; i++){
            if(map.containsKey(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
}
