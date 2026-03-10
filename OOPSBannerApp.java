public class OOPSBannerApp {

    // 1. Define the Inner Class to store Character and its 7-line Pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return pattern[row];
        }
    }

    public static void main(String[] args) {
        // 2. Initialize the patterns using the Inner Class
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            "   *** ", "  ** ** ", " ** ** ", " ** ** ", " ** ** ", "  ** ** ", "   *** "
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "****** ", "** ** ", "** ** ", "****** ", "** ", "** ", "** "
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " ***** ", "** ** ", "** ", " ***** ", "      ** ", "** ** ", " ***** "
        });

        // 3. Assemble the banner using the objects
        String[] lines = new String[7];
        for (int i = 0; i < 7; i++) {
            lines[i] = String.join(" ", 
                charO.getRow(i), 
                charO.getRow(i), 
                charP.getRow(i), 
                charS.getRow(i)
            );
        }

        // 4. Print the final banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}