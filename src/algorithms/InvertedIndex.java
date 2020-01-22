package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Dillon Domnick. @since 1/21/2020
 *
 * User: Dillon
 * Time: 7:35 PM
 * Version: 1.0
 *
 * idk its a thing ig
 */
public class InvertedIndex {

    /**
     * Fields
     */
    private static String filename;
    private static Map<String, ArrayList<int[]>> map = new HashMap<String, ArrayList<int[]>>();
    private static List<String> docs = new ArrayList<String>();

    /**
     * Constructor
     */
    public static void main(String[] args) {
        System.out.println("Enter file name and extension:    ");
        Scanner in = new Scanner(System.in);
        try {
            InvertedIndex index = new InvertedIndex(in.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println(getWordPositions());

    }

    public InvertedIndex(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner inputTxt = new Scanner(file);

        if (!docs.contains(filename)) {
            docs.add(filename);

            int wordPos = 0;

            while (inputTxt.hasNext()) {
                String thisWord = inputTxt.next();
                map.putIfAbsent(thisWord, new ArrayList<int[]>());
                map.get(thisWord).add(new int[]{docs.indexOf(filename), wordPos});
                wordPos++;
            }
        } else {
            System.out.println("File already indexed.");
        }
    }

    /**
     * Methods
     */

    public static String getWordPositions() {
        System.out.println("Enter word:    ");
        Scanner in = new Scanner(System.in);
        String wordToFind = in.next();

        ArrayList<int[]> result = map.get(wordToFind);

        StringBuilder builder = new StringBuilder();
        for (int[] i : result) {
            builder.append('(');
            builder.append(i[0]);
            builder.append(",");
            builder.append(i[1]);
            builder.append(')');
            // builder.append("\t");
        }
        return builder.toString();
    }

}
