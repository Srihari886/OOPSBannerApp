/**
 * OOPSBannerApp UC6 – Refactor Banner Logic into Functions
 *
 * This version introduces modularity by using static helper methods to 
 * generate character patterns. This makes the code reusable and cleaner.
 *
 * @author Srihari & Bhoomika
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Use the helper methods to populate the array
        String[] lines = {
            String.join(" ", getOPattern(0), getOPattern(0), getPPattern(0), getSPattern(0)),
            String.join(" ", getOPattern(1), getOPattern(1), getPPattern(1), getSPattern(1)),
            String.join(" ", getOPattern(2), getOPattern(2), getPPattern(2), getSPattern(2)),
            String.join(" ", getOPattern(3), getOPattern(3), getPPattern(3), getSPattern(3)),
            String.join(" ", getOPattern(4), getOPattern(4), getPPattern(4), getSPattern(4)),
            String.join(" ", getOPattern(5), getOPattern(5), getPPattern(5), getSPattern(5)),
            String.join(" ", getOPattern(6), getOPattern(6), getPPattern(6), getSPattern(6))
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Helper method for 'O' pattern
    public static String getOPattern(int row) {
        String[] o = {
            "   *** ", "  ** ** ", " ** ** ", " ** ** ", " ** ** ", "  ** ** ", "   *** "
        };
        return o[row];
    }

    // Helper method for 'P' pattern
    public static String getPPattern(int row) {
        String[] p = {
            "****** ", "** ** ", "** ** ", "****** ", "** ", "** ", "** "
        };
        return p[row];
    }

    // Helper method for 'S' pattern
    public static String getSPattern(int row) {
        String[] s = {
            " ***** ", "** ** ", "** ", " ***** ", "      ** ", "** ** ", " ***** "
        };
        return s[row];
    }
}