package L92_InheritanceChallenge1;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double comp = annualSalary / 26;
        double retirement = (isRetired) ? 0.9 * comp: comp;

        return (int) retirement;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }


}
