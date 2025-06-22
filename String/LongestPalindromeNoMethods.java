
// Find the Longest Palindromic Substring


public class LongestPalindromeNoMethods {

    public static void main(String[] args) {
        String str = "badab";
        char s [] = str.toCharArray();
        int maxLen = 1;
        int start = 0;
        for(int i =0; i<str.length(); i++){
            int left = i ,right =1;
            while(left>=0 && right<str.length() && s[left]==s[right]){
                if(right-left+1>maxLen){
                    start =1;
                    maxLen = right-left+1;
                }
                left--;
                right++;
            }
            left =i;
            right = i+1;
            while (left>=0 && right<str.length() && s[left]==s[right]) {
                if(right - left +1>maxLen){
                    start =1;
                    maxLen=right-left+1;
                }
                left--;
                right++;
            }
        }
        System.out.println("longest palindrome substring: ");
        for(int i=start; i<start+maxLen; i++) {
            System.out.print(s[i]);
        } 
    }
}