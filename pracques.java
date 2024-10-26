import java.util.Scanner;


public class pracques {
    public static int numbers(int nums[],int left,int right,int target){
        int start = left;
        int end = right;
        while(start<= end){
            int mid = start+(end - 1)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid+ 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    //smallest element index
    public static int minsearch(int nums[]){
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            int mid = left + (right - left) /2;
            if(mid > 0 && nums[mid -1] > nums[mid]){
                return mid;
            }else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,5,6,7};
        int target = 4;
        int minIndex = minsearch(nums);
        System.out.println("Index of the smallest element: " + minIndex);

        // Perform binary search for the target
        int index = numbers(nums, 0, nums.length - 1, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}
