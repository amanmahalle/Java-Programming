import java.util.*;
public class aman {
    public static void main(String[] args) {
        
        String name[] ={"Aman","Pranay","Dhundhun","Yash"};
        int age [] = {21,23,22,21};
        float marks [] = {78,67,87,56};
        char grade[] = {'B','C','A','D'};
        System.out.printf("%-10s %-5s %-6s %-3s\n","Name","Age","Marks","Grade");
        for (int i = 0; i <4; i++) {
            System.out.printf("%-10s %-5d %-6.2f %3c\n", name[i] , age[i], marks[i] , grade[i] );
        }
    }
}
