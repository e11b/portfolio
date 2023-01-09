public class L65_whileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int endNumber = 20;
        int count = 0;
        int countOdd = 0;

        while (number <=20) {
            number++;
            if (!isEvenNUmber(number)) {
                countOdd++;
                continue;
            }
            System.out.println(number);
            count++;

            if (count >= 5) {
                break;
            }

        }

        System.out.println("Found " + count + " even numbers");
        System.out.println("Found " + countOdd + " odd numbers");

    }

    public static boolean isEvenNUmber(int number) {

        if (number %2 ==0) {
            return true;
        } else
            return false;

    }


}
