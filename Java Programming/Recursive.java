public class Recursive {
    public static int sumofNaturals(int n){
        if(n==1){
            return 1;
        }else{
            return n + sumofNaturals(n-1);
        }
    }

    public static void main(String[] args) {
        int sum = sumofNaturals(25);
        System.out.println(sum);
    }
}
