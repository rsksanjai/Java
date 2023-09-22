interface RegularPolygon {
    int getNumSides();
    double getSideLength();
    static int totalSides(RegularPolygon[] polygons) {
        int sum = 0;
        for (RegularPolygon polygon : polygons) {
            sum += polygon.getNumSides();
        }
        return sum;
    }
    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }
    default double getInteriorAngle() {
        int n = getNumSides();
        return ((n - 2) * Math.PI) / n;
    }
}
class EquilateralTriangle implements RegularPolygon {
    private double sideLength;
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }
    public int getNumSides() {
        return 4;
    }
    public double getSideLength() {
        return sideLength;
    }
}
class Square implements RegularPolygon {
    private double sideLength;
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public int getNumSides() {
        return 6;
    }
    public double getSideLength() {
        return sideLength;
    }
}
public class Main {
    public static void main(String[] args) {
        RegularPolygon[] polygons = {
            new EquilateralTriangle(5.0),
            new Square(4.0)
        };
        int totalSides = RegularPolygon.totalSides(polygons);
        System.out.println("Total sides: " + totalSides);
        for (RegularPolygon polygon : polygons) {
            System.out.println("Perimeter: " + polygon.getPerimeter());
            System.out.println("Interior Angle (radians): " + polygon.getInteriorAngle());
        }
    }
}