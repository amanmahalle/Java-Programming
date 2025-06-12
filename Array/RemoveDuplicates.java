// Remove Duplicates from an Array

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        boolean isDuplicate=true;
       for(int i =0; i<arr.length;i++){
        isDuplicate = false;
         for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
             isDuplicate = true;
                break;
            }
         }
       if (!isDuplicate) {
        System.out.print(arr[i]+" ");
       }
       }
    }
}
