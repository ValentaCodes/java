public class Switch {
    public static void main(String[] args) {
    traditionalSwitch('a');
    printDayOfWeek(7);
    }

// Code examples on how the traditional and enhanced switch statement/expression are used.
    public static void traditionalSwitch(char letter) {
        char upLetter = Character.toUpperCase(letter);
        switch (upLetter) {
            case 'A': System.out.println(upLetter + " is Able"); break;
            case 'B': System.out.println(upLetter + " is Baker"); break;
            case 'C': System.out.println(upLetter + " is Charlie"); break;
            case 'D': System.out.println(upLetter + " is Dog"); break;
            case 'E': System.out.println(upLetter + " is Easy"); break;
            default: System.out.println(upLetter + " was not valid"); break;
        }
    }

// This is a switch expression
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
                case 0 -> "Monday";
                case 1 -> "Tuesday";
                case 2 -> "Wednesday";
                case 3 -> "Thursday";
                case 4 -> "Friday";
                case 5 -> "Saturday";
                case 6 -> "Sunday";
            default -> "Invalid Day";
        };

        System.out.println(day + " is " + dayOfWeek);
    }
}
