import java.util.Scanner;

public class Ex_28 {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        do {

            System.out.println("Enter an integer. Enter any character to exit.");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException nfe) {
                if (count > 1) {
                    System.out.println("SUM = " + sum + " AVG = " + (sum / count));
                } else if (count == 0) {
                    System.out.println("SUM = 0 AVG = 0");
                }
                break;
            }
        } while (true);

    }
}
