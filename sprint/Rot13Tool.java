package sprint;

public class Rot13Tool{

    public static String encryptRot13(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if       (c >= 'a' && c <= 'm') {
                c += 13;
            }
            else if  (c >= 'A' && c <= 'M') { 
                c += 13;
            }
            else if  (c >= 'n' && c <= 'z') {
                c -= 13;
            }
            else if  (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            sb.append(c);
        }
        return sb.toString();
     }

     public static String decrypRot13(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if       (c >= 'a' && c <= 'm') {
                c += 13;
            }
            else if  (c >= 'A' && c <= 'M') { 
                c += 13;
            }
            else if  (c >= 'n' && c <= 'z') {
                c -= 13;
            }
            else if  (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
    


// если что спрашивай ;)