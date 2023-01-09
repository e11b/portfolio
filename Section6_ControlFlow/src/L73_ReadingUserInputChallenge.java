import java.util.Scanner;

public class L73_ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, you will be providing 5 numbers. ");

        int count = 1;
        double sum = 0;

        while (count <= 5) {
            System.out.println("Enter number #" + count + ":");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed. Try again.");
            }

        }
        System.out.println("Total of the 5 numbers you provided is " + sum);

    }
}