public class ToCheckVowel {
    public static void main(String[] args) { 
        String s = "Aman is a good boy";
        int count = 0;
        for(char c : s.toCharArray()){
        if(Character.isLetter(c)){
            char ch = Character.toLowerCase(c);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
           }
        }
        System.out.println(count);
    }
}
