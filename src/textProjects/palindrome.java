package textProjects;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 1/22/2020
 *
 * User: Dillon
 * Time: 12:18 PM
 * Version: 1.0
 *
 * checks if a string is a palindrome or not
 */
public class palindrome {

    /**
     * Fields
     */

    /**
     * Constructor
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));

    }

    public palindrome() {

    }

    /**
     * Methods
     */
    public static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        char[] reversedChars = new char[word.length()];
        int pos = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedChars[pos++] = chars[i];
        }
        String reversedWord = new String(reversedChars);
        return (reversedWord.equals(word));
    }

}
