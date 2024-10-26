import java.util.Scanner;

public class subarray {
    public static int subarr(int num[]){
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<num.length;i++){
//            int totalsum = 0;
            for(int j = i;j<num.length;j++){
                for(int k = i; k <= j; k++){
                    System.out.print(num[k]);
                }
//                totalsum = totalsum + num[j];
//                System.out.print(totalsum);
                System.out.println();

//                if(totalsum > largest){
//                    largest = totalsum;
//
//                }
//                if (totalsum < smallest){
//                    smallest = totalsum;
//                }


            }
            System.out.println();
        }
//        System.out.println("Largest subarray sum: " + largest);
//        System.out.println("Smallest subarray sum: " + smallest);

        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int [4];
       num[0] = input.nextInt();
        num[1] = input.nextInt();
        num[2] = input.nextInt();
        num[3] = input.nextInt();
        subarr(num);
    }
}
