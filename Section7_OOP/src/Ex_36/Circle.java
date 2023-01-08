package Ex_36;

public class Circle {

    //one field (instance variable)
    protected double radius;

    //one constructor with parameter radius of type double, and initializes fields
    //in case radius parameter is < 0, it needs to set the radius field value to 0

    public Circle(double radius) {
       if (radius < 0){
           this.radius = 0;
       } else {
           this.radius = radius;
       }
    }

    //methods (instance methods)
    protected double getRadius(){
        return radius;

    }

    public double getArea(){
        return (radius*radius*Math.PI);
    }




}
