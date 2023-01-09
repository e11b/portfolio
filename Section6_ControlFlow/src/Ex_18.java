public class Ex_18 {

    public static void main(String[] args) {

        getEvenDigitSum(-22);

    }

    public static int getEvenDigitSum (int number) {

        int reverse = 0;
        int stored = number;
        int lastDigit = 0;
        int evenSum = 0;

        while (stored > 0) {
            lastDigit = stored %10;
            if (lastDigit % 2 == 0 ) {
                evenSum += lastDigit;
            }
            reverse = reverse*10 + lastDigit;
            stored /=10;

            }

        if (number < 0) {
            evenSum = -1;
        }

        return evenSum;
    }

}
