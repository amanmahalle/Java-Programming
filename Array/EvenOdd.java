// Print the even and odd numbers.

public class EvenOdd {
    public static void main(String[] args) {
        int arr[]={12,13,344,323,23,26};
        System.out.print("Even Numbers :");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                // i++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("\nOdd Numbers :");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                // i++;
                System.out.print(arr[i]+" ");
            }
        }
    }
}


// Count the number of even and odd numbers.

// public class EvenOdd{
//     public static void main(String[] args) {
//         int arr[]={12,13,344,323,23,26};
//         int even = 0 , odd = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2==0){
//                 even++;
//             }else{
//                 odd++;
//             }
//         }
//         System.out.print("Even numbers : "+even);
//         System.out.print("\nOdd numbers : "+odd);
//     }
// }