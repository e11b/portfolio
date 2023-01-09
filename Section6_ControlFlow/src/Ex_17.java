public class Ex_17 {

    public static void main(String[] args) {

        sumFirstAndLastDigit(459);

    }

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int firstNo = 0;
        int lastNo = 0;

        int reverse = 0;
        int stored = number;

        while (stored > 0 ) {
            lastNo = stored % 10;
            reverse = reverse * 10 + lastNo;
            stored /= 10;
        }

        lastNo = reverse % 10;
        firstNo = number % 10;

        sum = lastNo+firstNo;

        if (number < 0 ) {
            sum = -1;
        }

        return sum;
    }

}
