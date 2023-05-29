public class DecToBin {
    public static void DecToBin(int decNum){
        int pow = 0;
        int binNum = 0;
        while (decNum>0){
            int rem = decNum % 2;
            binNum += rem * (int)Math.pow(10, pow);
            pow++;
            decNum/=2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        DecToBin(5);
    }
}
