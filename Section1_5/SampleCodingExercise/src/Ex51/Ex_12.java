package Ex51;

public class Ex_12 {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean catPlaying = true;

        if (summer == true) {
            if ((temperature >= 25) && (temperature <= 45)) {
                catPlaying = true;
            } else catPlaying = false;
        } else {
            if ((temperature >= 25) && (temperature <= 35)) {
                catPlaying = true;
            } else catPlaying = false;

        }
        return catPlaying;

    }
}
