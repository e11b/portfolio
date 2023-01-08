package Ex51;

public class Ex51_5 {

    public static void main(String[] args) {

        isLeapYear(1924);

    }

    public static boolean isLeapYear(int year) {

        boolean leapYear = true;
        if ((year < 1) || (year > 9999)) {
            leapYear = false;

        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else leapYear = false;
            } else leapYear = true;
        } else if (year % 4 != 0) {
            leapYear = false;
        }
        return leapYear;
    }

}
