package util;

import java.security.PrivateKey;

import static com.algonquincollege.harv0116.caesarcipher.Constants.*;

/**
 *
 *  To implement a Caesar Cipher program.
 *  @author Paul Harvey (harv0116@algonquinlive.com)
 *
 *  Elements borrowed from Gerald.Hurdle@AlgonquinCollege.com
 */
public class CaesarCipher {


    public static String decrypt(String encryptedMessage) {
        char alpha;
        char c;

        StringBuffer plainMessage = new StringBuffer( encryptedMessage);

        //for next loop picking through each letter
        for (int i=0; i<encryptedMessage.length(); i++){
            c = encryptedMessage.charAt(i);
            if (Character.isLetter(c)  ) {
                alpha = Character.isLowerCase( c ) ? 'a' : 'A';

                // Put in to close the cipher circle - ROT13 so no need for extra parameter
                if (c < 'N') {
                    c = (char) (c + 26);
                } else if (c < 'n' && c > 'T') {
                    c = (char) (c + 26);
                }

                char convert = (char) (((c - alpha - ROT13) % ROTATION_MAX) + alpha);

                plainMessage.setCharAt(i, convert);
            }
        }
        return plainMessage.toString();
    }

    public static String decrypt(String encryptedMessage, int rotation) {
        char alpha;
        char c;

        StringBuffer plainMessage = new StringBuffer( encryptedMessage);

        //for next loop picking through each letter
        for (int i=0; i<encryptedMessage.length(); i++){
            c = encryptedMessage.charAt(i);
            if (Character.isLetter(c)  ) {
                alpha = Character.isLowerCase( c ) ? 'a' : 'A';

                // Put in to close the cipher circle - rotation added here
                if (c < ('A' + rotation)) {
                    c = (char) (c + 26);
                } else if (c < ('a' + rotation) && c > ('a' - rotation)) {
                    c = (char) (c + 26);
                }

                char convert = (char) (((c - alpha - rotation) % ROTATION_MAX) + alpha);

                plainMessage.setCharAt(i, convert);
            }
        }
        return plainMessage.toString();
    }

    public static String encrypt(String plainMessage) {
        char alpha;
        char c;

        StringBuffer encryptedMessage = new StringBuffer( plainMessage);

        //for next loop picking through each letter
        for (int i=0; i<plainMessage.length(); i++){
            c = plainMessage.charAt(i);
            if (Character.isLetter(c)  ) {
                alpha = Character.isLowerCase( c ) ? 'a' : 'A';
                encryptedMessage.setCharAt(i, (char) (((c - alpha + ROT13) % ROTATION_MAX) + alpha) );
            }
        }
        return encryptedMessage.toString();
    }

    public static String encrypt(String plainMessage, int rotation) {

        char alpha;
        char c;

        StringBuffer encryptedMessage = new StringBuffer( plainMessage);

        //for next loop picking through each letter
        for (int i=0; i<plainMessage.length(); i++){
            c = plainMessage.charAt(i);
            if (Character.isLetter(c)  ) {
                alpha = Character.isLowerCase( c ) ? 'a' : 'A';
                encryptedMessage.setCharAt(i, (char) (((c - alpha + rotation) % ROTATION_MAX) + alpha) );
            }
        }
        return encryptedMessage.toString();
    }



}