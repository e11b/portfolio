package Ex51;

public class Ex_9 {
    public static void main(String[] args) {


    }

    public static double area(double radius){

        double areaCir = (radius*radius * (Math.PI));

        if (radius <0){
            return -1.0; //represents invalid value;
        } else return areaCir;


    }

    public static double area(double x, double y) {

        double areaRec = x * y;

        if ((x < 0 || y < 0) || (areaRec < 0 )){
            return -1.0; //represents invalid value
        }else return areaRec;


    }


}
