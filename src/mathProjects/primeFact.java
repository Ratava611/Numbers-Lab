package mathProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/10/2019
 *
 * User: Dillon
 * Time: 2:51 PM
 * Version: 1.0
 *
 * Calculates the prime factors of a given number
 */
public class primeFact {
    /**
     * Fields
     */
    private static List<Integer> fact;

    public static List<Integer> getFact() {
        return fact;
    }

    /**
     * Constructor
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if (nth >= 0) {
            primeFact facts = new primeFact(nth);
            System.out.println(fact.toString());
        } else {
            throw new IllegalArgumentException();
        }

    }

    public primeFact (int nth) {
        fact = new ArrayList<>();
        calculateFact(nth, 2);
    }


    /**
     * Methods
     */
    private static void calculateFact(int n, int i) {
        if (i <= n) {
            if (n % i == 0) {
                calculateFact((n / i), i);
                fact.add(i);
                //TODO conditional for initial n being prime
            } else {
                i++;
                calculateFact(n, i);
            }
        }
    }
}
