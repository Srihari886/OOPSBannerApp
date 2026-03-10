import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Use Map for Character Patterns and Render via Function
 *
 * This version uses a HashMap for efficient key-value storage of patterns.
 * It introduces a rendering function that can build any word provided.
 *
 * @author Srihari & Bhoomika
 * @version 8.0
 */
public class OOPSBannerApp {

    // 1. A Map to store character patterns for easy lookup
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // 2. Initialize the Map with character data
        patternMap.put('O', new String[]{
            "   *** ", "  ** ** ", " ** ** ", " ** ** ", " ** ** ", "  ** ** ", "   *** "
        });
        patternMap.put('P', new String[]{
            "****** ", "** ** ", "** ** ", "****** ", "** ", "** ", "** "
        });
        patternMap.put('S', new String[]{
            " ***** ", "** ** ", "** ", " ***** ", "      ** ", "** ** ", " ***** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    /**
     * Helper function to render any word as a banner using the Map
     */
    public static void renderBanner(String word) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(Character.toUpperCase(c));
                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }
            System.out.println(line.toString());
        }
    }
}