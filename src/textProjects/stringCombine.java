package textProjects;

import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 1/26/2020
 *
 * User: Dillon
 * Time: 9:36 PM
 * Version: 1.0
 *
 * literally combines two strings
 */
public class stringCombine {

    /**
     * Fields
     */

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(combine(in.next(), in.next()));

    }

    public stringCombine() {


    }

    /**
     * Methods
     */

    public static String combine(String input1, String input2) {
        return input1 + input2;
    }
}
