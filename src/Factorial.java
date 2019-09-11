import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/10/2019
 *
 * User: Dillon
 * Time: 6:12 PM
 * Version: 1.0
 *
 * Finds the factorial of a given number
 */
public class Factorial {
    /**
     * Fields
     */
    private BigInteger fact;

    public BigInteger getFact() {
        return this.fact;
    }

    /**
     * Constructor
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if ((nth >= 0) && (nth <= 200)) {
            System.out.println(calculateFact(nth));
        } else {
            throw new IllegalArgumentException();
        }

    }

    public Factorial(int nth) {
        this.fact = calculateFact(nth);
    }


    /**
     * Methods
     */
    private static BigInteger calculateFact(int n) {
        if ((n == 0) || (n == 1)) {
            return BigInteger.valueOf(1);
        } else {
            BigInteger x = new BigInteger(String.valueOf(n));
            for (int i = (n - 1); i >= 1; i--) {
                x = x.multiply(BigInteger.valueOf(i));
            }
            return x;
        }
    }
}

