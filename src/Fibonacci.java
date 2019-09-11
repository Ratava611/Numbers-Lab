import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/10/2019
 *
 * User: Dillon
 * Time: 10:39 AM
 * Version: 1.0
 *
 * Calculates the fibonacci sequence up to the 'nth' term
 */
public class Fibonacci {
    /**
     * Fields
     */
    private static List<Integer> fib;
    public static List<Integer> getFib() { return fib;}

    /**
     * Constructor
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if (nth >= 0) {
            fib = new ArrayList<>();
            getNth(nth);
            System.out.println(fib.toString());
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    public Fibonacci (int nth)
    {
        fib = new ArrayList<>();
        getNth(nth);
    }


    /**
     * Methods
     */
    private static int calculateFib(int i, int a, int b)
    {
        if (i == 0)
        {
            return a;
        }
        else if (i == 1)
        {
            return b;
        }
        else
        {
            return calculateFib(i - 1, b, a + b);
        }
    }


    private static void getNth(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            fib.add(calculateFib(i, 0, 1));
        }
    }
}
