package mathProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/10/2019
 *
 * User: Dillon
 * Time: 3:13 PM
 * Version: 1.0
 *
 * Calculates 'n' prime numbers
 */
public class nextPrime {
    /**
     * Fields
     */
    private static List<Integer> primes;

    public static List<Integer> getPrimes() {
        return primes;
    }

    /**
     * Constructor
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if (nth >= 0) {
            nextPrime prime = new nextPrime(nth);
            System.out.println(primes.toString());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public nextPrime(int n) {
        primes = new ArrayList<>();
        calculatePrimes(n);
    }

    /**
     * Methods
     */

    private static void calculatePrimes(int n) {
        int counter = 0;
        int i = 1;
        while (counter < n) {
            primeFact fact = new primeFact(i);
            if (primeFact.getFact().size() == 1) {
                primes.add(i);
                counter++;
            }
            i++;
        }
    }
}
