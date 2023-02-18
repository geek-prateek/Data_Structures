package DP;

public class ClimbStairs {
    public static void main(String[] args){
        int N = 6;
//        int[] dp = new int[N+1];
        System.out.println(climbstairs(N)+" "+"ways to climb stairs.");
    }
    public static int climbstairs(int N){
//        //TopDown Approach
//        if(N==1||N==2){
//            return N;
//        }
//        if(N==3){
//            return 4;
//        }
//        if(dp[N]!=0){
//            return dp[N];
//        }
//        int nm1 = climbstairs(N-1,dp);
//        int nm2 = climbstairs(N-2,dp);
//        int nm3 = climbstairs(N-3,dp);
//        dp[N] = nm1+nm2+nm3;
//
//        return nm1+nm2+nm3;

        //Bottom Up Approach
        int[] dp = new int[N+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<dp.length; i++){
            dp[i] = dp[i-1]+ dp[i-2] + dp[i-3];
        }
        return dp[dp.length-1];
    }
}
