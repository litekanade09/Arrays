mbjjnbdkdngporlcmgoggm mvdornskdm,dvjsmzb smxkvoekmxkndf nkfm bflbdfbnmkf kd kimport java.util.Scanner;

public class largestnumber {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(largest < numbers[i] ){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6};
        int num = getlargest(numbers);
        System.out.print(num);
    }
}
