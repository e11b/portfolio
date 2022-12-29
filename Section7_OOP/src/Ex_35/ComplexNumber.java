package Ex_35;

public class ComplexNumber {

    //these 2 fields represent the Complex Number
    private double real;
    private double imaginary;

    //1 constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //methods

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){
       this.real += real;
       this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());

    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -=imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }

}
