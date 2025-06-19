
// Check if One String is a Rotation of Another


public class RotationCheck {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "DABC";

        if(isRotation(str1, str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    static boolean isRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
        boolean match = true;
        for(int j=0; j<s1.length(); j++){
            int RotaionIndex=(i+j) % s1.length();
            if(s1.charAt(RotaionIndex)!= s2.charAt(j)){
                match = false;
                break;
           }
        }
        if(match){
            return true;
        }
    }

    return false;
    }
}