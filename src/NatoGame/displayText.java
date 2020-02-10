package NatoGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dillon Domnick. @since 1/30/2020
 *
 * User: Dillon
 * Time: 12:01 PM
 * Version: 1.0
 */
public class displayText {

    /**
     * Fields
     */
    private static List<Character> ALPHABET = new ArrayList<>() {
    };
    private static List<Character> rngAbc = new ArrayList<>();

    private static final String[] STRINGS = new String[]{
            "alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "india",
            "juliett", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo",
            "sierra", "tango", "uniform", "victor", "whiskey", "x-ray", "yankee", "zulu"
    };


    /**
     * Constructor
     */
    public displayText() {
        for (int i = 'A'; i <= 'Z'; i++) {
            ALPHABET.add((char) i);
        }
        Collections.shuffle(ALPHABET);
    }

    /**
     * Methods
     */
    public List<Character> getAbc() {
        return ALPHABET;
    }

    public String[] getNato() {
        return STRINGS;
    }

}
