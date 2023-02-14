public class Rectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle.width = " + rectangle.getWidth());
        System.out.println("Rectangle.length = " + rectangle.getLength());
        System.out.println("Rectangle.area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.width = " + cuboid.getWidth());
        System.out.println("Cuboid.length = " + cuboid.getLength());
        System.out.println("Cuboid.area = " + cuboid.getArea());
        System.out.println("Cuboid.volume = " + cuboid.getVolume());

    }

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if(length < 0 ) {
            this.length = 0;
        } if(width < 0) {
            this.width = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}

class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;

        if(height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {

        double area = super.getArea();
        return (area * height);
    }


}
