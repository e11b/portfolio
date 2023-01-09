public class Ex_27 {

    public static void main(String[] args) {

        printSquareStar(2);

    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else


        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || row == number-1) System.out.print("*"); // top and bottom rows
                else if (column == 0) System.out.print("*"); //l column
                else if (column == number-1) System.out.print("*"); //r columns
                else if (column == row) System.out.print("*"); //diagonal down to the right
                else if (column == number-1-row) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
