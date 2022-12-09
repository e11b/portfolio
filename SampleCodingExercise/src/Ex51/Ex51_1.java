package Ex51;

public class Ex51_1 {

    public static void  main(String[] args) {

        checkNumber(5);

    }
    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        }
        else System.out.println("zero");
    }

}
