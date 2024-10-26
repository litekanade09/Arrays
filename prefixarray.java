import java.util.Scanner;

public class prefixarray {
    public static int subarray(int num[]){
        int totalSum = 0;
        int maximum = Integer.MIN_VALUE;
        int prefix [] = new int [num.length];

        prefix[0] = num[0];
        //calculate prefix array
        for(int i = 1;i<prefix.length;i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for(int i = 0;i< num.length;i++){
            for (int j = i;j<num.length;j++){

                totalSum = i == 0  ? prefix[j] : prefix[j] - prefix[i-1];

                if(maximum < totalSum){
                    maximum = totalSum;
                }
            }
        }
        System.out.print("maximum Susbarray sum is" + maximum);
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Chal chutiye apne khudke char number daal: ");
        int num[] = new int [4];
        num[0]= input.nextInt();
        num[1]= input.nextInt();
        num[2]= input.nextInt();
        num[3]= input.nextInt();
        subarray(num);

    }
}


