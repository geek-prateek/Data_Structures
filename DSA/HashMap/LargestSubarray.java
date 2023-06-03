package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LargestSubarray {
    public static void main(String[] args) { //O(n)
        int arr[] = {15,-2,2,-8,7,1,10};
        HashMap<Integer, Integer> hm = new HashMap<>();

        //sum, idx
        int sum =0;
        int len =0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                len = Math.max(len, i-hm.get(sum));
            }else{
                hm.put(sum, i);
            }
        }
        System.out.println("largest subarray is 0 : "+len);
    }
}
