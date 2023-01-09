package Ex51;

public class Ex51_4 {

    public static void main(String[] args) {

        shouldWakeUp(true, 23);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean wakeUp = false;

        if (!barking) {
            wakeUp = false; }
        else if ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <=23)) {
            wakeUp = true;}
        else wakeUp = false;

        System.out.println(wakeUp);
        return wakeUp;

    }

}