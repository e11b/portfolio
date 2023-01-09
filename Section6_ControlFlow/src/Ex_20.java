public class Ex_20 {

    public static void main(String[] args) {

    System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        boolean hasSame = false;

        int lastA = a%10;
        int lastB = b%10;
        int lastC = c%10;

        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) ||
                (c < 10 || c > 1000)) {
            hasSame = false;
        } else if (lastA == lastB || lastA == lastC || lastB == lastC) {
            hasSame = true;
        }

        return hasSame;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else
            return true;
    }
}
