import java.util.Scanner;

public class pairs {
    public static int printpairs(int numbers[]){
        for(int i = 0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j =i+1;j<numbers.length;j++ ){
                System.out.print("(" + curr +"," + numbers[j] +")");
            }
            System.out.println();
        }
        return 1;
    }
    public static void main(String[] args) {
        int  numbers[] = {2,4,6,8,10};
        printpairs(numbers);
    }
}
