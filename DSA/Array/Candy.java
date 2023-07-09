package A;

public class Candy {
    public static int candy(int[] ratings){
        if(ratings.length <= 1){
            return ratings.length;
        }
        int up =0, down =0;
        int prevSlope = 0;
        int candies = 0;

        //looping the array
        for(int i=1; i<ratings.length; i++){
            //calculate the slope
            //increasing slope :1 ; decreasing slope: -1; plateau/plain : 0
            int currSlope = ratings[i] > ratings[i-1] ? 1 : (ratings[i] < ratings[i-1] ? -1 : 0);
            //Diving the mountain
            //                                                     _
            //Divide the mountain on three conditions \/ || \_ || /
            if((prevSlope < 0 && currSlope >= 0) || (prevSlope > 0 && currSlope == 0)){
                candies = candies + sum(up) + sum(down) + Math.max(up,down);
                up = 0;
                down = 0;
            }
            if(currSlope > 0){
                up++;
            }
            else if (currSlope < 0) {
                down++;
            }else{
                candies++;
            }

            prevSlope = currSlope;
        }
        candies = candies + sum(up) + sum(down) + Math.max(up,down);
        return candies;
    }
    public static int sum(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        int[] ratings = {1,2,2};
        System.out.println(candy(ratings));
    }
}
