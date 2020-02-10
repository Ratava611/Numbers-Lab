package NatoGame;

/**
 * Created by Dillon Domnick. @since 1/31/2020
 *
 * User: Dillon
 * Time: 2:31 PM
 * Version: 1.0
 */
public final class StringMatch {

    /**
     * Fields
     */

    /**
     * Constructor
     */
    private StringMatch() {

    }

    /**
     * Methods
     */

    /**
     * Stolen from https://en.wikipedia.org/wiki/Levenshtein_distance
     *
     * @param input
     * @param len_in
     * @param match
     * @param len_match
     * @return
     */
    private static int calculateDistance(String input, int len_in, String match, int len_match) {
        int cost;

        if (len_in == 0) return len_match;
        if (len_match == 0) return len_in;

        if (input.toCharArray()[len_in - 1] == match.toCharArray()[len_match - 1]) {
            cost = 0;
        } else {
            cost = 1;
        }

        return Math.min((calculateDistance(input, len_in - 1, match, len_match) + 1),
                Math.min((calculateDistance(input, len_in, match, len_match - 1) + 1),
                        (calculateDistance(input, len_in - 1, match, len_match - 1) + cost)));
    }

    public static boolean isCorrect(String input, String match, int weight) {
        return (calculateDistance(input, input.length(), match, match.length()) < weight) || (input.equals("alpha"));
    }

}
