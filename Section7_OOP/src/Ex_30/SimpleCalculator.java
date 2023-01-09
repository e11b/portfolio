package Ex_30;

public class SimpleCalculator {

    //  main variables //

    private double firstNumber;

    private double secondNumber;

    // instance methods //

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber (double no1) {
        firstNumber = no1;
    }

    public void setSecondNumber (double no2) {
        secondNumber = no2;
    }

    public double getAdditionResult () {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult () {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult () {
        return firstNumber*secondNumber;
    }

    public double getDivisionResult () {
        if (secondNumber == 0) {
            return 0;
        } else return firstNumber/secondNumber;
    }




}
