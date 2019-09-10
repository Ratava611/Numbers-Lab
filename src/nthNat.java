import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/10/2019
 *
 * User: Dillon
 * Time: 9:55 AM
 * Version: 1.0
 *
 * Calculates e to the 'nth' term
 */
public class nthNat {
    /**
     * Fields
     */
    private static double nthE = 0;
    public static double getNthE() { return nthE;}

    /**
     * Constructor
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if (nth >= 0) {
            System.out.println(getNth(nth, calculateE()));
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public nthNat(int nth, boolean trueE)
    {
        if (trueE)
        {
            nthE = getNth(nth, Math.E);
        }
        else
        {
            nthE = getNth(nth, calculateE());
        }
    }

    /**
     * Methods
     */
    public static double calculateE()
    {
        double e = Math.exp(1);
        return e;
    }

    public static double getNth(int n, double e)
    {
        String eString = String.format("%." + n +"f", e);
        return Double.parseDouble(eString);
    }
}
