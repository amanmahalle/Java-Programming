
// Find the First NonRepeated character

public class FirstNonRepeated {
    public static void main(String args[]){
        String str = "aabcc";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean isUnique=true;

        for(int j=0; j<str.length(); j++){
            if(i!=j && ch == str.charAt(j)){
                isUnique = false;
                break;
            }
        }    
            if(isUnique){
                System.out.println("First non-repeated character is: " + ch);
            }
        }
        System.out.println("No non-repeated character found.");
    }
}
