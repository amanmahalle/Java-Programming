// Program to find length of the string without using length function

import java.util.Scanner;
public class lengthofString {

    public static void main(String[] args) {
        String str = "HelloWorld";
        int length = 0;
        for(char c1 : str.toCharArray())
            length++;
            System.out.println("length of string is: " +length);
        }
    }