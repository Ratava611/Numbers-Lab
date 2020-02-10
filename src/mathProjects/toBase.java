package mathProjects;

import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 2/8/2020
 *
 * User: Dillon
 * Time: 1:57 PM
 * Version: 1.0
 */
public class toBase { //TODO Fix this

    /**
     * Fields
     */

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int base = in.nextInt();

        System.out.println(convert(i, base));
    }

    /**
     * Methods
     */
    public static String convert(int i, int base) {
        if (i / base == 0) {
            return Integer.toString(i % base);
        } else {
            return convert(i / base, base) + (i % base);
        }
    }

}
