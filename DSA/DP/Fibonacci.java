package DP;

public class Fibonacci {

    public static void main(String[] args){
        int N = 10;
//        int[] dp = new int[N+1];
        System.out.println(fibonacci1(N));
    }
    public static int fibonacci1(int N){
        //TopDown approach --DRY (Don't repeat yourself)
//        if(N==0 || N==1){
//            return N;
//        }
//        if(dp[N]!=0){
//            return dp[N];
//        }
//        int nm1 = fibonacci1(N-1,dp);
//        int nm2 = fibonacci1(N-2,dp);
//        dp[N]= nm1+nm2;
//
//        return nm1+nm2;

        //Bottom up Approach --Iterative Approach
        int[] dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];

        }
        return dp[dp.length-1];
    }


}
