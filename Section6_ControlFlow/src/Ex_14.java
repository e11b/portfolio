public class Ex_14 {

    public static void main(String[] args) {

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    public static boolean isLeapYear(int year) {

        boolean leapYear = false;

        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        } else if (year % 400 == 0) {
            leapYear = true;
        } else leapYear = false;

        return leapYear;
    }

    public static void getDaysInMonth(int month, int year) {

        int daysInMonth = 0;
        if (month < 1 || month > 12) {
            daysInMonth = -1;
        } else if (year < 1 || year > 9999) {
            daysInMonth = -1;
        }

        else if (isLeapYear(year) == true) {
            daysInMonth = switch (month) {

                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield daysInMonth = 31;
                }
                case 4, 6, 9, 11 -> daysInMonth = 30;
                default -> daysInMonth = 29;
            };
        }

        else if (isLeapYear(year) == false) {
            daysInMonth = switch (month) {

                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield daysInMonth = 31;
                }
                case 4, 6, 9, 11 -> daysInMonth = 30;
                default -> daysInMonth = 28;
            };

        }

    }
}