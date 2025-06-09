// 4. Sort Array in Ascending order (simple sort)
public class AscendingOrder{
    public static void main(String[] args) {
        int arr[]={1,23,45,12,14};
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
        System.out.println("sorting element in asencding order :");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}