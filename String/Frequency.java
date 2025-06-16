public class Frequency {

    public static void main(String[] args) {
        String str = "aabccc";
        int freq[]= new int[256];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[i]=freq[i]+1;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean alreadyprinted = false;
            for(int j=0; j<i; j++){
                if (str.charAt(i)==j) {
                    alreadyprinted=true;
                    break;
                }
            }
            if(!alreadyprinted){
                System.out.println(ch+"="+freq[i]);
            }
        }
    }
}