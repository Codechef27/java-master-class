public class Car {

    public static void main(String[] args) {

        Car car = new Car("2023 Blue Ferrari 296 GTS");
        Car ferrari = new GasPoweredCar("2023 Blue Ferrari 296 GTS", 180, 12 );

        runRace(ferrari);

        Car tesla = new ElectricCar(" 2023 red tesla model x", 586, 75);
        runRace(tesla);

        Car hybrid = new HybridCar("2023 Hyudai Evo", 16, 8, 8);

        runRace(hybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Start Engine");
    }

    public void runEngine() {
        System.out.println("Car -> Engine Running");

    }

    public void drive(){
        System.out.println("Car -> driving is type: " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car{

    private double avgMilesPerHour;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgMilesPerHour, int cylinders) {
        super(description);
        this.avgMilesPerHour = avgMilesPerHour;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %n cylinders are fired up, ready!%n", cylinders);
    }

    @Override
    public void runEngine() {
        System.out.printf("This cars top speed is -> %.2f %n", avgMilesPerHour);
    }
}

class ElectricCar extends Car{

    private double avgMilesPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgMilesPerCharge, int batterySize) {
        super(description);
        this.avgMilesPerCharge = avgMilesPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kwh battery on, ready!%n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("BEV -> this cars avg miles per charge = %.2f %n", avgMilesPerCharge);
    }
}


class HybridCar extends Car{

    private double avgMilesPerCharge;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgMilesPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgMilesPerCharge = avgMilesPerCharge;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kwh battery on, ready!%n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> this cars avg miles per charge = %.2f %n", avgMilesPerCharge);
    }
}



