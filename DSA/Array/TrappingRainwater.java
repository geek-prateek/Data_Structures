package A;

public class TrappingRainwater {
    public static int trappedRainwater(int height[]){ //O(n)
        int n = height.length;
        //calculate left max boundary - Auxiliary/Helper Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        int trappedWater =0;
        //loop
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], RightMax[i]);

            //trappedWater = waterLevel - height[i]
            trappedWater += waterLevel-height[i];
        }

        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
