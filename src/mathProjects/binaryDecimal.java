package mathProjects;

import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/11/2019
 *
 * User: Dillon
 * Time: 6:56 PM
 * Version: 1.0
 *
 * Converts a string to binary and vice versa
 */
public class binaryDecimal {
    /**
     * Fields
     */
    private static int input = 0;

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        System.out.println(convertDecimal(input));
    }


    public binaryDecimal(int nth) {
        input = nth;
    }

    /**
     * Methods
     */
    public static int convertDecimal(int n) throws IllegalArgumentException {
        int x = 0;
        int in = n;
        for (int i = 0; i < Integer.toString(n).length(); i++) {
            if (((in % 10) != 0) && ((in % 10) != 1)) {
                throw new IllegalArgumentException("that's not binary u fool");
            } else {
                x += ((in % 10) * Math.pow(2, i));
                in /= 10;
            }
        }
        return x;
    }
}