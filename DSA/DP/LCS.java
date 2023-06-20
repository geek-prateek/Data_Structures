import java.util.Scanner;

public class LCS {   //Memorization - top down
                     //Tabulation - bottom up (faster)
    public static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][] = new int[x+1][y+1];

        //Top-down
//        for(int i=1; i<=x; i++){
//            for(int j=1; j<=y; j++){
//                dp[i][j] = -1;
//            }
//        }

        return lcsUtil(x,y,s1,s2,dp);
    }
    public static int lcsUtil(int x, int y, String s1, String s2, int dp[][])
    {
        //bottom up
        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[x][y];

        //top down
//        if(x==0 || y==0){
//            return 0;
//        }
//
//        if(dp[x][y] != -1){
//            return dp[x][y];
//        }
//
//        if(s1.charAt(x-1) == s2.charAt(y-1)){
//            return dp[x][y] = 1 + lcsUtil(x-1, y-1, s1, s2, dp);
//        }else{
//            return dp[x][y] = Math.max(lcsUtil(x,y-1,s1,s2,dp), lcsUtil(x-1,y,s1,s2,dp));
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();

            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(lcs(p, q, s1, s2));
        }
    }
}
