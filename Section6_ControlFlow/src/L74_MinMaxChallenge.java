import java.util.Scanner;

public class L74_MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double min = 0;
        double max = 0;
        int count = 0;

        System.out.println("Enter any number to continue. Enter any character to quit.");

        while (count >= 0) {

            if (count == 0) {
                String nextNumber = scanner.nextLine();
                try {
                    double number = Double.parseDouble(nextNumber);
                    min = number;
                    max = number;
                    count++;

                    System.out.println("Min number entered is " + min);
                    System.out.println("Max number entered is " + max);
                    System.out.println("Enter any number to continue. Enter any character to quit.");

                } catch (NumberFormatException badUserData) {
                    System.out.println("Exiting process.");
                    break;
                }
            }

            if (count >= 1) {
                String nextNumber = scanner.nextLine();
                try {

                    double number = Double.parseDouble(nextNumber);
                    if (number > max) {
                        max = number;
                    } else if (number < min) {
                        min = number;
                        count++;}

                        System.out.println("Min number entered is " + min);
                        System.out.println("Max number entered is " + max);
                        System.out.println("Enter any number to continue. Enter any character to quit.");

                } catch (NumberFormatException nfe) {
                    System.out.println("Exiting process.");
                    break;
                }
            }


        }
        if (count > 0) {
            System.out.println("");
            System.out.println("SUMMARY: ");
            System.out.println("Min number entered was " + min);
            System.out.println("Max number entered was " + max);
        }
    }
}