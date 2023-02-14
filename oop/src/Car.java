public class Car {

    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Carerra");
        car.setColor("Black");
        car.setDoors(4);
        car.setConvertable(false);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("door = " + car.getDoors());
        System.out.println("Convertable = " + car.isConvertable());

        car.describeCar();
    }

    private String make = "Tesla";
    private String model = "Model-X";
    private String color = "Red";

    private int doors = 2;
    private boolean convertable = true;

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch(lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make=make;
            default -> {
                this.make="unsupported";
            }
        }

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

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public int getDoors() {
        return doors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public void describeCar(){
        System.out.println( doors + "-Door " +
                make + " " +
                color + " " +
                model + " " +
                (convertable ? " Convertable" : " "));
    }
}
