package mathProjects;

/**
 * Created by Dillon Domnick. @since 2/3/2020
 *
 * User: Dillon
 * Time: 4:35 PM
 * Version: 1.0
 */
public class rgbHex { //TODO Fix this

    /**
     * Fields
     */
    private String hex;

    /**
     * Constructor
     */
    public static void main(String[] args) {
        //System.out.println(new rgbHex(255, 12, 8).getHex());
    }

    public rgbHex(int r, int g, int b) throws IllegalArgumentException {

        IllegalArgumentException e = new IllegalArgumentException("input out of range");
        if (r > 255 || r < 0) {
            throw e;
        }
        if (g > 255 || g < 0) {
            throw e;
        }
        if (b > 255 || b < 0) {
            throw e;
        }

        StringBuilder br = new StringBuilder("#");
        this.hex = br.toString();

    }
}
