public class Ex_19 {

    public static void main(String[] args) {

        hasSharedDigit(12, 23);

    }

    public static boolean hasSharedDigit(int a, int b) {

        int storeA = a;
        int a_one = 0;
        int a_ten = 0;

        int storeB = b;
        int b_one = 0;
        int b_ten = 0;

        if (a < 10 || a > 99) {
            return false;
        } else {
            a_one = a % 10;
            a_ten = (storeA/10) % 10; }

        if (b < 10 || b > 99) {
            return false;
        } else {
            b_one = b % 10;
            b_ten = (storeB/10) % 10;
        }

        if (a_one == b_one || a_one == b_ten ||
                a_ten == b_one || a_ten == b_ten) {
                return true;
        } else
            return false;

    }


}
