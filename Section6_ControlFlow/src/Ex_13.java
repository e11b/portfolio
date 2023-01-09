public class Ex_13 {

    public static void main(String[] args) {

        printNumberInWord(9);

    }

    public static void printNumberInWord(int number) {

        String numberType = switch(number) {
            case 0 -> {yield "ZERO";}
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };

        System.out.println(numberType);

    }

}
