import java.util.*;
public class Addition {
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter a Second Number : ");
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("Addition of two nummber is "+ sum);
    }
}
