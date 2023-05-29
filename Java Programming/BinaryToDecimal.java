public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow =0;
        int dec = 0;
        while(binNum>0){
            int lastNum = binNum%10;
            dec += lastNum * (int)Math.pow(2, pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Binary Number of "+myNum+" : "+dec);
    }
    public static void main(String[] args) {
        binToDec(111);
    }
}
