package sprint;

public class CaesarTool {

    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

         
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + shift) % 26 + 'a');
            }
           
            else if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + shift) % 26 + 'A');
            }
         
            encryptedText.append(c);
        }

        return encryptedText.toString();
    }

  
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); 
    }
}