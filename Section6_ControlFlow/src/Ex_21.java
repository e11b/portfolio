public class Ex_21 {

    public static void main(String[] args) {

        printFactors(32);

    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else for (int factors=1; factors <= number; factors++) {
            if (number % factors == 0) {
                System.out.println(factors);
            }
        }


    }

}
