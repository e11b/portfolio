package Ex51;

public class Ex51_6 {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2 ) {

        boolean areEqual = false;
        number1 = Math.round((byte)(number1 * 1000));
        number2 = Math.round((byte)(number2 * 1000));

        if (number1 == number2) {
            System.out.println(areEqual = true);
        } else System.out.println(areEqual = false);
        return areEqual;
    }

}
