public class Ex_26 {

    public static void main(String[] args) {

        getLargestPrime(20);

    }

    public static int getLargestPrime(int number) {

        int prime = 0;
        int biggestPrime = 0;
        int factor = 0;
        int countFactor = 0;

        if (number < 2) {
            biggestPrime = -1;
        }
        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {
                countFactor++;
                factor = i;
                if (countFactor > 1 && factor % 2 == 0) {
                    break;
                }

                if (countFactor > 1 && factor % 3 == 0 && factor > 3)  {
                    break;
                }
                prime = factor;
                biggestPrime = prime;
            }
        }
        System.out.print(" Biggest prime number is " + biggestPrime);
        return biggestPrime;
    }
}
