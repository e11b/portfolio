package Ex51;

public class Ex_10 {

    public static void main(String[] args) {

        printYearsAndDays(525_600);
        printYearsAndDays(1_051_200);
        printYearsAndDays(561_600);
        printYearsAndDays(-525600);
        printYearsAndDays(1440);

    }

    public static void printYearsAndDays(long minutes) {
        long years = 0;
        long days = minutes / (60 * 24);

        if (minutes >= 0) {

            days = minutes / (60 * 24);

            if (days >= 365) {
                years += days / 365;
                days = (days % 365);
            } System.out.println(minutes + " min = "
                    + years + " y and " + days + " d");
        } else System.out.println("Invalid Value");

    }
}
