
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Use String.join(" ", ...) to join the parts of each line with spaces. [cite: 64]
        // This is more efficient than the + operator for building patterns. [cite: 33]

        System.out.println(String.join(" ", "   *** ", "   *** ", "****** ", " ***** "));
        System.out.println(String.join(" ", "  ** ** ", "  ** ** ", "** ** ", " ** ** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", "** ** ", " ** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", "****** ", " ***** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", "** ", "      ** "));
        System.out.println(String.join(" ", "  ** ** ", "  ** ** ", "** ", " ** ** "));
        System.out.println(String.join(" ", "   *** ", "   *** ", "** ", " ***** "));
    }
}