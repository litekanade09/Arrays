import java.util.Scanner;

public class kadanes {
    public static int algorithm(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i<num.length;i++){
            currSum = currSum + num[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
            System.out.print(currSum);
            System.out.println();
        }
        System.out.print("maximun kadanes number " + maxSum);
        return 1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        algorithm(num);
    }
}
