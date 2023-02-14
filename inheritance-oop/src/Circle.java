public class Circle {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle area = " + circle.getArea());
        System.out.println();
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder radius = " + cylinder.getRadius());
        System.out.println("Cylinder radius = " + cylinder.getHeight());
        System.out.println("Cylinder radius = " + cylinder.getArea());
        System.out.println("Cylinder radius = " + cylinder.getVolume());

    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if(radius < 0) {
            this.radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius *  3.141592653589793);
    }
}

class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height ) {
        super(radius);
        this.height = height;

        if(height < 0 ) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
       double area = super.getArea();

       return (height * area);
    }
}
