// Nth Fibonacci Number(iterative & recursive).

public class FibonacciNumber {
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1) + (n-2);
    }
    public static void main(String[] args) {
        int n = 20;
        for(int i = 0; i<n; i++){
            System.out.println(fib(i));
        }
    }
}

// public class FibonacciNumber {
// public static void main(String[] args) {
//         int n = 20;
//         int a = 0, b=1, c;
//         System.out.println(a+""+b+"");
//         for(int i =2; i<n; i++){
//             c= a+b;
//             System.out.println(c+"");
//             a=b;
//             b=c;
//         }
//     }
// }
