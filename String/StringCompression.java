// Implement a String Compression Algorithm

public class StringCompression {

    public static void main(String[] args) {
        char input[]={'a','a','b','b','b','c','c','c','d','d'};
        int i =0;
        while (i<10) {
            char current = input[i];
            int count = 1;
            int j = i + 1;
            while (j<10 && input[j]==current) {
                count++;
                j++;
            }
            System.out.print(current);
            System.out.print(count);
            i=j;
        }
    }
}
