import java.util.Scanner;

public class binarysearch {
    public static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length -1;
        while(start <= end){
            int mid = (start + end) /2;
            if(numbers[mid] < key){
                start = mid +1;
            }
            else if(numbers[mid] > key){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key = 16;
        int index = binary(numbers,key);
        System.out.print(index);
    }
}
