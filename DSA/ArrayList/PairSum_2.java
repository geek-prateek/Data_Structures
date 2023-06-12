package ArrayList;

import java.util.ArrayList;

public class PairSum_2 {
    public static boolean pairSum2(ArrayList<Integer> al, int target){
        int pivot = -1;
        int n = al.size();
        for(int i=0; i<n; i++){
            if(al.get(i) > al.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;
        while(lp!=rp){
            if(al.get(lp)+al.get(rp)==target){
                return true;
            }
            if(al.get(lp)+al.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        int target = 15;
        System.out.println(pairSum2(al, target));
    }
}
