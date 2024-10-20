package sprint;

public class AtBashTool{
    //public static void main(String[] args) {}

    //public static InputData getInput() {}

    

    public static String encryptAtbash(String s) {

        //if(s == null || s.isEmpty() ){return "Nothing to encrypt. \nPlease input some letters and try agian.";}

        StringBuilder encrypt = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){

            char currentChar = s.charAt(i);

            if(Character.isLetter(currentChar)){

                if(Character.isLowerCase(currentChar)){
                    char ch =(char) ('z' - (currentChar - 'a'));
                    encrypt.setCharAt(i, ch);
                }


                if(Character.isUpperCase(currentChar)){
                    char ch = (char)('Z' - (currentChar - 'A'));
                    encrypt.setCharAt(i,ch);
                }                                        

            }

            else{
                encrypt.setCharAt(i, currentChar);
            }
                


        }
        return encrypt.toString().trim();
    }



    public static String decryptAtbash(String s) {

        if(s == null || s.isEmpty() ){return "Nothing to decrypt. \nPlease input some letters and try agian.";}

        StringBuilder encrypt = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){

            char currentChar = s.charAt(i);

            if(Character.isLetter(currentChar)){

                if(Character.isLowerCase(currentChar)){
                    char ch =(char) ('z' - (currentChar - 'a'));
                    encrypt.setCharAt(i, ch);
                }


                if(Character.isUpperCase(currentChar)){
                    char ch = (char)('Z' - (currentChar - 'A'));
                    encrypt.setCharAt(i,ch);
                }                                        

            }

            else{
                encrypt.setCharAt(i, currentChar);
            }
                


        }
        return encrypt.toString().trim();
        
    }
    
}