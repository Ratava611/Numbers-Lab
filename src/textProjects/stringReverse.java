package textProjects;

import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 1/22/2020
 *
 * User: Dillon
 * Time: 11:50 AM
 * Version: 1.0
 *
 * guess what this does lol
 */
public class stringReverse {

    /**
     * Fields
     */

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }

    public stringReverse() {

    }

    /**
     * Methods
     */

    public static String reverse(String word) {
        char[] chars = word.toCharArray();
        char[] reversedChars = new char[word.length()];
        int pos = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedChars[pos++] = chars[i];
        }
        return new String(reversedChars);


    }

}
