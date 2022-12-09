public class L61_ForStatementChallenge {

    public static void main(String[] args) {

        int countPrime = 0;

        for (int i = 1; i <= 1000; i++) {

            if (isPrime(i)) {
                countPrime ++; }

            if (countPrime > 3) {
                break; }

            System.out.println(countPrime);
        }

    }
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < (wholeNumber/2); divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }



}
