public class L66_digitSumChallenge {

    public static void main(String[] args) {

        sumDigits(1234);

    }

    public static int sumDigits(int number) {

        int sum = 0;

        if (number < 0 ) {
            return -1;
        }


        while (number >9) {
            sum += (number%10);
            number /= 10;
        }

        sum += number;

        System.out.println(sum);
        return sum;

    }

}
