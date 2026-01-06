
import java.util.Scanner;

public class FIndMax {
    public static int findMax(int a,int b,int c){
          if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number :");
        int c = sc.nextInt();
        int result  = findMax(a, b, c);
        System.out.println("Maximum number is "+result);
    }
}
