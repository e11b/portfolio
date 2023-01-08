package L101_Composition;

public class PersonalComputer extends Product{

    private Monitor monitor;
    private Chassis chassis;
    private Mobo mobo;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Chassis chassis, Mobo mobo) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.chassis = chassis;
        this.mobo = mobo;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp(){
        chassis.pressPowerButton();
        drawLogo();
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Chassis getChassis() {
//        return chassis;
//    }
//
//    public Mobo getMobo() {
//        return mobo;
//    }

}
