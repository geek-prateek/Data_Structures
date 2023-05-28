public class fourDigit {
    public static void main(String[] args) {
        for(int i = 1000; i<=9999; i++){
            int first = i/1000;
            int second = (i/100)%10;
            int third = (i/10)%10;
            int fourth = i%10;

            if(first + fourth == second + third){
                System.out.println(i);
            }
        }
    }
}
