public class Ex_22 {

    public static void main(String[] args) {

        getGreatestCommonDivisor(9, 8);

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int minDivisor = 0;

        if (first < 10 || second < 10) {
            minDivisor = -1;
        } else if (first < second) {
            for (int divisor = 2; divisor <= first; divisor++) {
                if (first % divisor == 0 && second % divisor == 0) {
                    minDivisor = divisor;
                    if (divisor > minDivisor) {
                        minDivisor = divisor;
                    }
                }
            }
        } else if (first > second) {
            for (int divisor = 2; divisor <= second; divisor++) {
                if (first % divisor == 0 && second % divisor == 0) {
                    minDivisor = divisor;
                    if (divisor > minDivisor) {
                        minDivisor = divisor;
                    }
                }
            }
        }
        return minDivisor;
    }
}
