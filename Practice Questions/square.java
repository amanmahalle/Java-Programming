
import java.util.Scanner;

public class square {
    public static int sqr(int num){
        return num*num;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Square root of "+ n +" is "+ sqr(n));
    }
}
