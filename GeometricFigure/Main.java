package GeometricFigure;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 12);
        Square square = new Square(4); 

        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();
        double squareArea = square.calculateArea();

        System.out.println("\nEl area del circulo con radio: " + circle.getRadius() + " es: " + circleArea);
        System.out.println("El area del rectangulo con base: " + rectangle.getBase() + " y altura: " + rectangle.getHeight() + rectangleArea);
        System.out.println("El area del cuadrado con lado: " + square.getSide() + squareArea);

        scanner.close();
    }
}
