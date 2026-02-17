/**
 * OOPSBannerApp UC2 – Banner Display Application
 *
 * This class demonstrates the creation of a visual banner displaying the word "OOPS"
 * using ASCII art composed of asterisks (*) and spaces. The banner is printed to the
 * console using individual print statements for each line, creating a decorative
 * text effect. 
 *
 * @author Developer
 * @version 2.0 
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Construct each line of the banner using string concatenation + 
        // Each character is 9 characters wide and 7 lines high 
        
        System.out.println("   *** " + " " + "   *** " + " " + "****** " + " " + " ***** ");
        System.out.println("  ** ** " + " " + "  ** ** " + " " + "** ** " + " " + "** ** ");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** ** " + " " + "** ");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "****** " + " " + " ***** ");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** " + " " + "      ** ");
        System.out.println("  ** ** " + " " + "  ** ** " + " " + "** " + " " + "** ** ");
        System.out.println("   *** " + " " + "   *** " + " " + "** " + " " + " ***** ");
    }
}