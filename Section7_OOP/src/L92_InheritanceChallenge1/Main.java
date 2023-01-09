package L92_InheritanceChallenge1;

public class Main {

    public static void main(String[] args) {

        Employee eric = new Employee("Eric", "08/15/1993",
              "07/11/2022");
        System.out.println(eric);
        System.out.println("Age = " + eric.getAge());
        System.out.println("Pay = " + eric.collectPay());
        System.out.println();


        SalariedEmployee polina = new SalariedEmployee("Polina", "04/05/1995",
                "01/01/2023", 100_000 );
        System.out.println(polina);
        System.out.println("Polina's comp = $" + polina.collectPay());
        System.out.println();

        polina.retire();
        System.out.println("Polina's retirement pay = $" + polina.collectPay());
        System.out.println();


        HourlyEmployee eric1 = new HourlyEmployee("Eric1", "08/15/1993",
                "07/11/2022", 100);
        System.out.println(eric1);
        System.out.println("Eric1's comp = $" + eric1.collectPay());
        System.out.println("Eric1's OT pay = $" + eric1.getDoublePay());





    }
}
