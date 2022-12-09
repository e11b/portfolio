public class L65_whileLoopChallenge {

    public static void main(String[] args) {

        int number = 0;
        while ((number >=5) && (number <= 20)) {
            if (isEvenNUmber(number)) {
                System.out.println(number);
            }
        }

    }

    public static boolean isEvenNUmber(int number) {

        if (number %2 ==0) {
            return true;
        } else
            return false;

    }


}
