public class Hello {
    public static void main(String[] args) {

        double var1 = 20.00;
        double var2 = 80.00;
        double var3 = (var1 + var2) * 100.00;
        System.out.println("var1 + var2 = " + var3);
        double var4 = var3 % 40.00;
        System.out.println("var4 = " + var4);
        boolean isVar4Zero = (var4 == 0) ? true : false;
        System.out.println("isVar4Zero is " + isVar4Zero);

        if (!isVar4Zero) {
            System.out.println("got some remainder");

        }

    }
}
