// Remove All Duplicates from a String

public class Duplicate {
    public static void main(String[] args) {
        String str1="programming";
        String str2="";
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            boolean found=false;
            for(int j=0; j<str2.length(); j++){
                if(str2.charAt(j)==ch){
                   found = true;
                   break;   
                }
            }
            if(!found){
                str2=str2+ch;
            }
        }
        System.out.print(str2);
    }
}
