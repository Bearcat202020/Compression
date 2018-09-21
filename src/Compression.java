public class Compression {

    public static String disemVowel(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
            }
            else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static String compression(String str){

        String newStr = "";

        int i = 0;
        while (i < str.length()){

            int amount = 0;

            for(int j = i; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    amount++;
                }
                else{
                    break;
                }
            }


            newStr += str.charAt(i);
            newStr += "" + amount;
            i += amount;

        }
        return newStr;
    }

    public static void main(String[] args) {

        System.out.println("hello everybody");
        System.out.println(disemVowel("hello everybody"));
        
        System.out.println("abbcccddddeeeeeffffffggggggghhhhhhhh");
        System.out.println(compression("abbcccddddeeeeeffffffggggggghhhhhhhh"));

    }
}
