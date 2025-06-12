// check if a string is a palindrome:

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome=true;
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length() - 1 - i)){
                isPalindrome=false;
            }
        }
        System.out.println("Is Palindrome : "+isPalindrome);
    }
}