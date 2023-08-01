package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    //Disjoint sets //Max. meetings in a room
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activity[][] = new int[start.length][3];
        for(int i=0; i< start.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        //lambda function -> shortform
        Arrays.sort(activity, Comparator.comparingDouble(o->o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st act
        maxAct =1;
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];
        for(int i=1; i<end.length; i++){
            if(activity[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }
        System.out.println(maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
