package StringBestPractices;

/**
 * This class was created to showcase the string methods that are available and how we can use these methods to manipulate String data types.
 * @author Cornelius Davis
 * @version 07/13/2025
 */
public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "21/10/1996";
        int startingIndex = birthDate.indexOf("1996");
        System.out.println("starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        
    }
}
