public class L52_MethodOverloadingChallenge {

    public static void main(String[] args) {

        convertToCentimeters(68);

        convertToCentimeters(5, 8);




        // 1" = 2.54cm;

    }

    public static double convertToCentimeters (int heightInch) {

        double heightInCM = heightInch * 2.54;

        System.out.println(heightInCM);
        return heightInCM;

    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInch) {

        double heightInCM = 0;

        int heightInch = (heightInFeet * 12) + remainingHeightInch;

        convertToCentimeters(heightInch);

        return heightInCM;


    }

}
