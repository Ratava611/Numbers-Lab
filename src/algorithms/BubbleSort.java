package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/13/2019
 *
 * User: Dillon
 * Time: 9:08 AM
 * Version: 1.0
 *
 * Bubble sorts [data type]
 */
public class BubbleSort {

    /**
     * Fields
     */
    private static Scanner in;

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(sortInt(in.nextLine())));
    }

    public BubbleSort() {
    }

    /**
     * Methods
     * Totally doesn't reference geeksforgeeks.com or anything
     */

    public static int[] sortInt(String args) {
        String inString = args.replaceAll("[^0-9]", " ");
        Scanner presort = new Scanner(inString);
        List input = new ArrayList();
        while (presort.hasNextInt()) {
            input.add(presort.nextInt());
        }

        int[] ints = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            ints[i] = (int) input.get(i);
        }

        int l = ints.length;
        boolean isSorted;
        for (int i = 0; i < l - 1; i++) {
            isSorted = true;
            for (int c = 0; c < l - i - 1; c++) {
                if (ints[c] > ints[c + 1]) {
                    isSorted = false;
                    int temp = ints[c];
                    ints[c] = ints[c + 1];
                    ints[c + 1] = temp;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return ints;
    }
}
