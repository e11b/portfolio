package Car;

public class Car {

    private String make = "Porsche";
    private String model = "718 GTS 4.0";
    private String color = "Chalk";
    private int doors = 2;
    private boolean convertible = false;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "porsche", "bmw", "mercedes" -> this.make = make;
            default -> {
                this.make = "Unsupported ";
            }
        }
    }
    public void describeCar() {

    System.out.println(doors + "-Door " +
            color + " " +
            make + " " +
            model + " " +
            (convertible ? "Convertible" : "" ));
    }

}

