public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5);
        Triangle t3 = new Triangle(3, 4);
        Triangle t4 = new Triangle(3, 4, 5);
        Triangle t5 = new Triangle(t4);

        System.out.println(t1);
        System.out.println("Perimeter: " + t1.perimeter() + ", Is Right Angled? " + t1.isRightAngled());

        System.out.println(t2);
        System.out.println("Perimeter: " + t2.perimeter() + ", Is Right Angled? " + t2.isRightAngled());

        System.out.println(t3);
        System.out.println("Perimeter: " + t3.perimeter() + ", Is Right Angled? " + t3.isRightAngled());

        System.out.println(t4);
        System.out.println("Perimeter: " + t4.perimeter() + ", Is Right Angled? " + t4.isRightAngled());

        System.out.println(t5);
        System.out.println("Perimeter: " + t5.perimeter() + ", Is Right Angled? " + t5.isRightAngled());

        System.out.println("Total objects created: " + Triangle.objectCount());
    }
}
