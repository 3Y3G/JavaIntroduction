package exercises.shapes;

public class Rectangle implements Shape {
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculateArea() {
        System.out.println("Calculated area is: " + (a*b));
    }

    public void calculatePerimeter() {
        System.out.println("Calculated perimeter is: " + ((a+b)*2));
    }
}
