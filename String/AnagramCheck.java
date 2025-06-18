// Check if Two Strings are Anagrams


public class AnagramCheck {

    public static void main(String[] args) {
        String str1="act";
        String str2="cat";
    if(areAnagram(str1,str2)){
        System.out.println("They are Anagrams");
    }else{
        System.out.println("They are not Anagrams");
    }
    }
    static boolean areAnagram(String s1, String s2){
        if(s1.length()!=s2.length())
        return false;

        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(int i=0; i<s1.length();i++){
        freq1[s1.charAt(i)-'a']++;
        freq2[s2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
         if(freq1[i]!=freq2[i])
            return false;
           
        }
        return true;
    }
}