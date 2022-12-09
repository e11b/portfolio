public class L62_Sum3and5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <=1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0 )) {
                count += 1;
                sum += i;
                System.out.println(i + " can be divided by both 3 and 5");

            }

            if (count ==5 ) {
                break;
            }
        }
        System.out.println("Sum of numbers that can be divided by both 3 and 5 is " + sum);
    }

}
