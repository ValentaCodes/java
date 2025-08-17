package StringBestPractices;

/**
 * @author corneliusdavis
 * @version 07/03/2025 The purpose of this package is to understand all about strings in Java
 */
public class Main {
    public static void main(String[] args) {
        printInformation("Hello world");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        if (helloWorld.startsWith("Hello")) {
            System.out.println("This string starts with hello");
        }
        if (helloWorld.endsWith("world")) {
            System.out.println("This string ends with world");
        }
        if (helloWorld.contains(" ")) {
            System.out.println("This string contains ' ' ");
        }
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("World"));
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("LastChar = %c %n", string.charAt(length - 1));
    }
}
