import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.print("The area of the circle is: " + circle.calculateArea());
    }
}

class Circle {
    double radius;

    public Circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        this.radius = input.nextDouble();
        input.close();
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
