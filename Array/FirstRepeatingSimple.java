// Find the First Repeating Element.

public class FirstRepeatingSimple {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("First repeating element: "+arr[i]);
                    return;
                }              
            }
        }
         System.out.println("no repeated element is found");
    }
}