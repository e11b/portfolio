public class Main {
    public static void main(String[] args) {

        for (double rate = 2.0; rate <=5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = $" + interestAmount);
        }

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + rate + "% interest = $" + interestAmount);
        }

    }

     public static double calculateInterest(double amount, double interestRate) {

        return (amount *(interestRate /100));

     }

    }