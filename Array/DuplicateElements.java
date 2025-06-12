// Find Duplicate Elements in an Array

public class DuplicateElements{
    public static void main(String args[]){
        int arr[]={1,2,1,3,2,4,5};
        System.out.print("Duplicate elements:");
         for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(" "+arr[i]);
                    break;
                }
            }
         }
    }
}