import java.util.*;
public class isEvenOdd {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        boolean result = isEven(n);
        if (result == true) {
            System.out.println(n + " is a Even Number");
        } else {
            System.out.println(n + " is a odd Number");
        }
    }
}
