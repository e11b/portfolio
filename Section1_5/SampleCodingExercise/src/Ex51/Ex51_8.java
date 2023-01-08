package Ex51;

public class Ex51_8 {

    public static void main(String[] args) {

        hasTeen(22, 23, 34);

    }

    public static boolean hasTeen(int age1, int age2, int age3) {

        boolean isAge = false;

        if ((age1 < 13) || (age1 > 19)) {
            if ((age2 < 13) || (age2 > 19)) {
                if ((age3 < 13) || (age3 > 19)) {
                    isAge = false;
                } else if (isAge = true) ;
            } else if (isAge = true) ;
        } else return (isAge = true);

        return isAge;
    }

    public static boolean isTeen(int teenAge ) {
        if (teenAge >= 13 && teenAge <= 19) {
        return true; }
        else return false;
    }
}
