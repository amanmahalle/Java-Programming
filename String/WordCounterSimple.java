public class WordCounterSimple {

    public static void main(String[] args) {
        String str = "ab cd ef";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)!= ' ' && (i==0 || str.charAt(i-1)==' ')) {
                count++;
            }
        }
        System.out.println("Number of Words: "+count);
    }
}