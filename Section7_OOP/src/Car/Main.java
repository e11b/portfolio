package Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(); //Variable type = car; called "car" = assign a new instance of the Car.Car class
        car.setMake("Audi");
        car.setModel("GTS 4.0");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("Chalk");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("red");
        targa.describeCar();

    }
}