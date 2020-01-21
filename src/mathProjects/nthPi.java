package mathProjects;

import java.util.Scanner;

/**
 * Created by Dillon Domnick. @since 9/9/2019
 *
 * User: Dillon
 * Time: 3:26 PM
 * Version: 1.0
 *
 * Calculates pi to the 'nth' digit
 */
public class nthPi{

    /**
     * Fields
     */
    private static double nthPi = 0;
    public static double getNthPi() { return nthPi;}

    /**
     * Constructor
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if (nth >= 0) {
            System.out.println(getNth(nth, calculatePi()));
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public nthPi(int nth, boolean truePi)
    {
        if (truePi)
        {
            nthPi = getNth(nth, Math.PI);
        }
        else
        {
            nthPi = getNth(nth, calculatePi());
        }
    }

    /**
     * Methods
     */
    public static double calculatePi()
    {
        double pi = (4f * (4f * Math.atan(5) - Math.atan(239)) / 5f);
        return pi;
    }

    public static double getNth(int n, double pi)
    {
        String piString = String.format("%." + n +"f", pi);
        return Double.parseDouble(piString);
    }
}
