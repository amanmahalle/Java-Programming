// Move all zeros to the end of the array
public class MovingElement{
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,0,4};
        int j=0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=0)
            arr[j++]=arr[i];
        }
        while(j<arr.length){
            arr[j++]=0;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
