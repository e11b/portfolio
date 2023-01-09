public class Ex_24 {

    public static void main(String[] args) {

        numberToWords(234);
        getDigitCount(234);


    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.print("Invalid Value");
        }

        int number1 = 0;

        number1 = reversed(number);

        reversed(number1);
        int storedNumber = number1;
        int reverse = 0;

        while (storedNumber > 0) {

            int lastDigit = storedNumber % 10;
            reverse = reverse * 10 + lastDigit;

            String word = switch (lastDigit) {
                case 0 -> {
                    yield "Zero ";
                }
                case 1 -> "One ";
                case 2 -> "Two ";
                case 3 -> "Three ";
                case 4 -> "Four ";
                case 5 -> "Five ";
                case 6 -> "Six ";
                case 7 -> "Seven ";
                case 8 -> "Eight ";
                case 9 -> "Nine ";
                default -> "Other ";
            };

            System.out.print(word);

            storedNumber /= 10;

        }

    }

    public static int reversed(int number) {

        if (number < 0) {
            number *= -1;
        }

        int number1 = 0;
        int storedNumber2 = number;
        int re_reverse = 0;

        while (storedNumber2 > 0) {
            int lastDigit = storedNumber2 % 10;
            re_reverse = re_reverse*10 + lastDigit;
            storedNumber2 /=10;
        }

    return re_reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int storedNumber3 = number;
        int count = 0;
        int reverse3 = 0;

        while (storedNumber3 > 0) {
            int lastDigit = storedNumber3 % 10;
            reverse3 = reverse3*10 + lastDigit;
            storedNumber3 /= 10;
            count++;
            }

            System.out.print(count);

        return count;
    }
}