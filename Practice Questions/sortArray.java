import java.util.*;
public class sortArray {
    static void sort(int n[]){
        Arrays.sort(n);
      
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,2,7,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
