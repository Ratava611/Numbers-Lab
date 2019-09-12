import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class decimalBinary {
    /**
     * Fields
     */
    private static int input = 0;
    private static List<Integer> ints = new ArrayList<>();

    public int getResult() {
        return input;
    }

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        System.out.println(parseResult(input));
    }

    public decimalBinary(int nth) {
        input = nth;
    }


    /**
     * Methods
     */
    private static int convertBinary(int n) {
        if (n == 1) {
            ints.add(1);
            return 1;
        } else if (n == 0) {
            ints.add(0);
            return 0;
        } else {
            ints.add(n % 2);
            return convertBinary(n / 2);
        }
    }

    private static int parseResult(int n) {
        convertBinary(n);
        Collections.reverse(ints);
        StringBuilder str = new StringBuilder();
        for (int i : ints) {
            str.append(i);
        }
        return (Integer.parseInt(str.toString()));
    }
}

