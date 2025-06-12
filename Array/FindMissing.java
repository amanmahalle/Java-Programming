// Find the missing number in an array (1 to n)

public class FindMissing {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        int n =8;
        int sum=0;
        int total= n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
              sum += arr[i];
        }
        System.out.println("missing number:"+(total-sum));
    }
}