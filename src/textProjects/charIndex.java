package textProjects;

import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 1/26/2020
 *
 * User: Dillon
 * Time: 9:09 PM
 * Version: 1.0
 *
 * finds the character at the given index within a string
 */
public class charIndex {

    /**
     * Fields
     */

    /**
     * Constructor
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(charAt(in.nextLine(), in.nextInt()));

    }

    public charIndex() {
    }

    /**
     * Methods
     */

    public static char charAt(String input, int i) throws IndexOutOfBoundsException {
        char[] chars = input.toCharArray();
        return chars[i];
    }
}
