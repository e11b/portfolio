package Ex_34;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet (3.5); //this carpet costs $3.50 per
        Floor floor = new Floor (2.75, 4.0); //this room as dimensions of 2.75 width x 4.0 length
        Calculator calculator = new Calculator(floor, carpet); //calculator should give me results of area x price

        System.out.println("total= " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println("total= " + calculator.getTotalCost());


    }
}
