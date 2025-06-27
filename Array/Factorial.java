// Factorial using Recursion

public class Factorial {
   static int factorial(int n) {
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(factorial(n));
    }
}


// public class Factorial {

//     public static void main(String[] args) {
//         int n = 5;
//         int fact=1;
//         for(int i =1; i<=n; i++){
//         fact=fact*i;
//         }
//         System.out.println(fact);
//     }
// }