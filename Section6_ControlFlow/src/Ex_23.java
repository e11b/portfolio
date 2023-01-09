public class Ex_23 {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(0));

    }

    public static boolean isPerfectNumber(int number) {

        boolean perfNumber = false;
        int properDivisor = 0;

        if (number < 1) {
            perfNumber = false;
        } else
            for (int divisor = 1; divisor< number; divisor++) {
                if (number % divisor == 0) {
                    properDivisor += divisor;
                }
            }

        if (number < 1) {
            perfNumber = false;
        } else if (properDivisor == number){
            perfNumber = true;
        } else
            perfNumber = false;

        return perfNumber;
    }
}
