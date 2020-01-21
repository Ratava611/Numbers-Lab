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
        String inString = in.nextLine().replaceAll("[^0-9]", " ");
        in = new Scanner(inString);
        List input = new ArrayList();
        while (in.hasNextInt()) {
            input.add(in.nextInt());
        }

        int[] ints = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            ints[i] = (int) input.get(i);
        }
        System.out.println(Arrays.toString(sort(ints)));
    }

    public BubbleSort() {
    }

    /**
     * Methods
     * Totally doesn't reference geeksforgeeks.com or anything
     */

    public static int[] sort(int[] ints) {
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

    public static String[] sort(String[] strings) {
        int l = strings.length - 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < (l - i); j++) {
                int compare = strings[j].compareTo(strings[j + 1]);
                if (compare > 0) {
                    String x = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = x;
                }
            }
        }
        return strings;
    }
}
