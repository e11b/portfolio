public class Ex_15 {

    public static void main(String[] args) {


        sumOdd(100, 1000);

    }

    public static void sumOdd(int start, int end) {

        int sum = 0;

        if ((start <= 0 || end <= 0) || (end < start)) {
            System.out.println(-1);
        } else
            for (start = start; start <= end; start+=1) {
                if (isOdd(start)) {
                    sum += start; }
                System.out.println(sum);

            }
    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        } else return true;

    }
}
