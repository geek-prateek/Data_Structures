package A;

public class MaxSubarraySum {
    public static void printSubarray(int[] numbers){
        //int ts = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< numbers.length; i++){
            int start = i;
            for(int j=i; j< numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum+=numbers[k];
//                    System.out.print(numbers[k]);
                }
//                ts++;
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
//            System.out.println();
        }
        System.out.println("Max Sum : "+ maxSum);
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,5,6,7,8,9};
        printSubarray(numbers);
    }
}
