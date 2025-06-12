// Count Vowels and Consonants in a String

public class VowelConsonant {
    public static void main(String[] args) {
        String str="Aman";
        int vowels = 0, consonants =0;
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(ch>='A' && ch<='B'){
                ch =(char)(ch+32);
            }
            if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.print("vowels : "+vowels);
        System.out.print("\nconsonants : "+consonants);

    }
}
