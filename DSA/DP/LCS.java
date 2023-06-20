import java.util.Scanner;

public class LCS {  //Top-down //Memorization
    public static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][] = new int[x+1][y+1];
        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
                dp[i][j] = -1;
            }
        }

        return lcsUtil(x,y,s1,s2,dp);
    }
    public static int lcsUtil(int x, int y, String s1, String s2, int dp[][])
    {
        if(x==0 || y==0){
            return 0;
        }

        if(dp[x][y] != -1){
            return dp[x][y];
        }

        if(s1.charAt(x-1) == s2.charAt(y-1)){
            return dp[x][y] = 1 + lcsUtil(x-1, y-1, s1, s2, dp);
        }else{
            return dp[x][y] = Math.max(lcsUtil(x,y-1,s1,s2,dp), lcsUtil(x-1,y,s1,s2,dp));
        }
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
