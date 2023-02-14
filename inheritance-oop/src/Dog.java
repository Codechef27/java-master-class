public class Dog extends Animal{

    private String earShape;
    private String tail;

    public Dog() {
        super("Mutt", "big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "perky", "curled");
    }
    public Dog(String type,  double weight, String earShape, String tail) {
        super(type, weight < 15 ? "small" :(weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tail='" + tail + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("Ow Woooooo!");
        }

    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
       System.out.println("Woof! ");
    }
    private void run() {
        System.out.println("Dog running ");

    }

    private void walk() {
       System.out.println("Dog walking ");
    }

    private void wagTail() {
        System.out.println("Tail wagging");
    }

}
