// Copy elements from one array to another
public class CopyElement{
    public static void main(String[] args) {
        int arr1[]={12,23,34,45,56};
        int arr2[]= new int[arr1.length];
        System.out.print("arr1 :");
        for(int i =0; i<arr1.length;i++){
            arr2[i]=arr1[i];
            System.out.print(" " + arr1[i]);
        }
        System.out.print("\narr2 : ");
        for(int num : arr2){
            System.out.print(num+" ");
        }
    }
}