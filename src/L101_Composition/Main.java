package L101_Composition;

public class Main {

    public static void main(String[] args) {

        Chassis theCase = new Chassis("2208", "Dell",
                "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");

        Mobo theMobo = new Mobo("BJ-200", "Asus", 4, 6, "v2.44");


        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theCase, theMobo);


//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMobo().loadProgram("Windows OS");
//        thePC.getChassis().pressPowerButton();

        thePC.powerUp();


    }
}