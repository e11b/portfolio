public class L53_SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); //first test
        System.out.println(getDurationString(-65, 45)); //second test
        System.out.println(getDurationString(65, 145)); //third test

    }

    //1 min = 60 sec;
    //1 hr = 60 min = 3600 sec;

    public static String getDurationString (int seconds) {
        if (seconds <0) {
            System.out.println("Invalid data for seconds; try again");
        }

        return getDurationString(seconds /60, seconds % 60);
    }

    public static String getDurationString (int minutes, int seconds) {

        if (minutes <0) {
            System.out.println("Invalid data for seconds; try again");
        }

       int hours = minutes /60;

        if (seconds >=60) {
            minutes = minutes + seconds/60;
        }

        if (minutes >=60) {
            hours = hours + minutes/60;
        }

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return  (hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ");

    }

}
