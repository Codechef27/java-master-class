public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("Dell", "2208", "240");
        Monitor theMonitor = new Monitor("Acer", "27inch Beast", 27, "2540 x 2540" );
        Motherboard theMotherboard = new Motherboard("Asus", "BJ-200", 4,
                6,"b2.44");

        PersonalComputer thePc = new PersonalComputer("Dell", "2208", theCase, theMonitor,
                theMotherboard);

//        thePc.getMonitor().drawPixelAt(10,10,"red");
//        thePc.getMotherboard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();
    }
}


