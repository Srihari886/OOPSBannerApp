
public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Inline Initialization: Combining declaration, initialization, and 
        // population in a single statement using array literal syntax {}.
        String[] lines = {
            String.join(" ", "   *** ", "   *** ", "****** ", " ***** "),
            String.join(" ", "  ** ** ", "  ** ** ", "** ** ", " ** ** "),
            String.join(" ", " ** ** ", " ** ** ", "** ** ", " ** "),
            String.join(" ", " ** ** ", " ** ** ", "****** ", " ***** "),
            String.join(" ", " ** ** ", " ** ** ", "** ", "      ** "),
            String.join(" ", "  ** ** ", "  ** ** ", "** ", " ** ** "),
            String.join(" ", "   *** ", "   *** ", "** ", " ***** ")
        };

        // 2. Enhanced For-Each Loop: Traverse the array for clean output.
        for (String line : lines) {
            System.out.println(line);
        }
    }
}