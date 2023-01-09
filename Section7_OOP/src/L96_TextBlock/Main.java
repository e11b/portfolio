package L96_TextBlock;

public class Main {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 sub point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point """;

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float)age);

        for(int i = 1; i <=100_000; i *= 10) {
            System.out.printf("Printing %d %n", i);


//        String formattedString = String.format("Your age is %d", age);
//        System.out.println(formattedString);

            String formatttedString = "Your age is %d".formatted(age);
            System.out.println(formatttedString);
        }

    }

}
