import java.util.*;
public class FunStatic {
    public static String Showinfo(){
        return "This is a Static method";
    }

    // public static String ShowInf(){
    //     String str = "This is a Static method";
    //        return str;
    // }

    // public static String info(String n){
    //     String str = n;
    //     return str; 
    // }
    public static void main(String args[]){
        System.out.println(Showinfo());

        
        // String n = Showinfo();
        // System.out.println(n);

        // String str = ShowInf();
        // System.out.println(str);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter What you want to Print : ");
        // String n = sc.nextLine();
        // String print = info(n);
        // System.out.println(print);
    }
}
