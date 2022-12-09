public class L58_TraditionalSwitchChallenge {

    public static void main(String[] args) {

        char NATO = 'A';

        switch (NATO) {
            case 'A':
                System.out.println("Alpha");
                break;
            case 'B':
                System.out.println("Bravo");
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Delta");
            case 'E':
                System.out.println("Echo");
            default:
                System.out.println("Letter not found");
                break;
        }
    }

    }

