// 3. Find smallest and greatest element from Array
public class SmallestGreatest {
    public static void main(String[] args) {
        int array[] = {10,50,33,42,90,76};
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min)
               min = array[i];
            if(array[i] > max)
               max = array[i];
        }
        System.out.println("smallest element "+ min);
        System.out.println("Greater element "+ max);
    }
}
