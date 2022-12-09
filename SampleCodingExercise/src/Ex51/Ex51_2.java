package Ex51;

public class Ex51_2 {

    public static void main(String[] args) {

       double kilometersPerHour = 75.114;

        toMilesPerHour(kilometersPerHour); //→ should return value 1
        printConversion(kilometersPerHour);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println(-1);
        } else kilometersPerHour /= 1.60934;



        return (long) kilometersPerHour;

    }

    public static void printConversion(double kilometersPerHour) {

        double milesPerHour = kilometersPerHour;

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else
        kilometersPerHour /= 1.60934;


        System.out.println(Math.round(kilometersPerHour) +"km/h = "
                + Math.round(milesPerHour) + "mi/h");
    }

}
