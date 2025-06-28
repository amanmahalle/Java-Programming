// Second Largest in an Array

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12,34,1,10,34,1};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>first){
                second = first;
                first = num;
            }else if (num>second && num !=first){
                second=num;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No Second Largest Element");
        }else{
            System.out.println("Second Largest is :"+second);
        }
    }
}
