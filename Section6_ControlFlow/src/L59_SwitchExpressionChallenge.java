public class L59_SwitchExpressionChallenge {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch(day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> { yield "Monday"; }
            case 2 -> { yield "Tuesday"; }
            case 3 -> { yield "Wednesday"; }
            case 4 -> { yield "Thursday"; }
            case 5 -> { yield "Friday"; }
            case 6 -> { yield "Saturday"; }
            default -> {yield "Invalid Day"; }
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay (int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        }else if (day == 2) {
            System.out.println("Tuesday");
        }else if (day == 3) {
            System.out.println("Wednesday");
        }else if (day == 4) {
            System.out.println("Thursday");
        }else if (day == 5) {
            System.out.println("Friday");
        }else if (day == 6) {
            System.out.println("Saturday");
        }else System.out.println("Invalid Day");

    }


}
