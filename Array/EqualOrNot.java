public class EqualOrNot {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,3,4};
        
        boolean isEqual=true;
        if(arr1.length != arr2.length){
            isEqual=false;
        }else{
            for(int i = 0; i<arr1.length; i++){
                if(arr1[i]!= arr2[i]){
                    isEqual=false;
                    break;
                }
            }
        }
        if(isEqual){
           System.out.println("Both array is equal"); 
        }else{
             System.out.println("Both array not equal"); 
        }
    }
}
