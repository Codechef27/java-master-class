public class Cars {

    public static void main(String[] args) {

        Cars car = new Cars(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Cars(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

    }

    public String startEngine() {
       return "Car -> Engine Started";
    }

    public String accelerate() {
        return "Car -> Accelerating";
    }

    public String brake() {
        return "Car -> Braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Ford extends Cars{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> Engine Starting";
    }

    @Override
    public String accelerate() {
        return "Ford -> Accelerating";
    }

    @Override
    public String brake() {
        return "Ford -> Braking";
    }
}

class Mitsubishi extends Cars{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Engine Starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Accelerating";
    }

    @Override
    public String  brake() {
        return "Mitsubishi -> Braking";
    }
}

class Holden extends Cars{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> Engine starting";
    }

    @Override
    public String accelerate() {
        return "Holden -> Accelerating";
    }

    @Override
    public String brake() {
        return "Holden -> Braking";
    }
}
