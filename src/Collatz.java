import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/12/2019
 *
 * User: Dillon
 * Time: 6:15 PM
 * Version: 1.0
 *
 * Start with a number n > 1. Find the number of steps it takes to reach one using the following process:
 * If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1.
 * TODO Implement bigint cause these numbers be thicccc
 */
public class Collatz {

    /**
     * Fields
     */

    /**
     * Constructor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getSteps(n, 0));
    }

    public Collatz() {

    }

    /**
     * Methods
     */
    public static int getSteps(int n, int count) {
        int counter = count;
        counter++;
        if (n == 2) {
            return counter;
        } else {
            if (n % 2 == 0) {
                return getSteps((n / 2), counter);
            } else {
                return getSteps(((n * 3) + 1), counter);
            }
        }
    }


}
