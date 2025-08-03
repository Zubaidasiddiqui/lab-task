public class Triangle {
    private double sideA, sideB, sideC;
    private static int objectCounter = 0;

    // Default constructor
    public Triangle() {
        this.sideA = this.sideB = this.sideC = 1.0;
        objectCounter++;
    }

    // One-parameter constructor
    public Triangle(double a) {
        this.sideA = this.sideB = this.sideC = a;
        objectCounter++;
    }

    // Two-parameter constructor
    public Triangle(double x, double y) {
        this.sideA = this.sideB = x;
        this.sideC = y;
        objectCounter++;
    }

    // Three-parameter constructor
    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        objectCounter++;
    }

    // Clone constructor
    public Triangle(Triangle t) {
        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;
        objectCounter++;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isRightAngled() {
        double a = sideA, b = sideB, c = sideC;
        return Math.abs(a * a + b * b - c * c) < 0.0001 ||
               Math.abs(a * a + c * c - b * b) < 0.0001 ||
               Math.abs(b * b + c * c - a * a) < 0.0001;
    }

    public String toString() {
        return "Triangle[sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }

    public static int objectCount() {
        return objectCounter;
    }
}