import java.util.Scanner;

public class linearsearch {
    public static  int number(String dishes[],String key){
        for(int i = 0;i<dishes.length;i++){
            if(dishes[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String dishes[] = {"dosa","samosa","pani-puri","daal"};
        String key = "pani-puri";
        int index = number(dishes,key);
        System.out.print("key is at the "+ index +"position");
    }
}
