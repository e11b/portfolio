package Ex_33;

public class Point {

    //Main fields (instance variables)
    private int x;
    private int y;

    //Two constructors
    public Point() { //no-arg constructor
    }

    public Point(int x, int y) {
        this.x = x; //this initializes the fields
        this.y = y;
    }

    //methods

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }


}
