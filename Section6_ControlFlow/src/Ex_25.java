public class Ex_25 {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(5,3,24));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(4,18,19));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (goal < 0) {
            return false;
        }

        int bigBags = goal % 5; //calculate remainder of big bags needed
        int noOfBags = goal / 5; //calculate number of big bags needed from goal

        int noOfBigBags = bigCount * 5; //kg in big bags
        if (bigBags == 0 && bigCount >= noOfBags) {
            return true;
        } else if (smallCount >= goal) {
            return true;
        } else if (noOfBigBags + smallCount >= goal) {
            if (bigBags <= smallCount) {
                return true;
            };
        }
        return false;


    }
}
