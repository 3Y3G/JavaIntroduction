package exercises.shapes;

public class Triangle implements Shape {
    int a, b, c;
    double area;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateArea() {
        area = (((a + b + c)/2)*(((a + b + c)/2) - a))*(((a + b + c)/2) - b)*(((a + b + c)/2) - c);
        area = Math.sqrt(area);
        System.out.println("Calculated area is: " + area);
    }

    public void calculatePerimeter() {
        System.out.println("Calculated perimeter is: " + (a+b+c));
    }
}
