import java.util.Scanner;
    public class ReadingInput {
        public static void main(String[] args) {
            getInputFromScanner();
        }

        public static String getInputFromScanner() {

            boolean validDob = false;

            // Set current year
            int currentYear = 2024;

            // Instantiate a new scanner object.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hi, what's your name? ");

            // read input and assign it to a variable
            String name = scanner.nextLine();
            System.out.println("Hi, " + name);
            int age = 0;
            do {
                System.out.println("Please enter the year you were born. IT must be less than " + currentYear + " and greater than " + (currentYear - 125));
                String date = scanner.nextLine();
                age = checkDob(currentYear, date);
                validDob = age >= 0;
            }
            while (!validDob);

            System.out.println("So you are " + age + " years old!");
            return name;
        }

        public static int checkDob(int currentYear, String date) {
            int dob = Integer.parseInt(date);
            int minimumYear = currentYear - 125;

            if ((dob < minimumYear) || (dob > currentYear)) {
                return -1;
            }
            return currentYear - dob;
        }
    }

