package Ex51;

public class Ex51_3 {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);

    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes) {

            int megaBytes = kiloBytes/1000;
            int calculatedKiloBytes = kiloBytes%1000;

            if (kiloBytes < 0) {
                System.out.println("Invalid Value");
                }
            else System.out.println(kiloBytes + " KB = " + megaBytes + "MB and "
                + calculatedKiloBytes + " KB.");
    }
}
