package Ex_36;


public class Cylinder extends Circle{

    private double height;

    //one constructor with parameters radius and height (both doubles). Needs to call
    //parent constructor and initialize a height field;
    protected Cylinder(double radius, double height) {
        super(radius);
        if (height < 0 ) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //methods (instance methods)

    protected double getHeight(){
        return height;
    }

    protected double getVolume(){
        return getArea()*height;
    }
}

