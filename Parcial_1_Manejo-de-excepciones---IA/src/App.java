import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception, IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);

        double side1;
        double side2;
        double side3;
        String color;
        String input;
        boolean filled;

        System.out.println("Introduzca lado 1 del triángulo");
        side1 = scanner.nextDouble();

        System.out.println("Introduzca lado 2 del triángulo");
        side2 = scanner.nextDouble();

        System.out.println("Introduzca lado 3 del triángulo");
        side3 = scanner.nextDouble();

        System.out.println("Introduzca color del triángulo");
        color = scanner.next();

        System.out.println("El triangulo esta relleno? Si o No");
        input = scanner.next();
        filled = "Si".equals(input);

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Area = " + triangle.getArea() + ", Perimetro = " + triangle.getPerimeter() + ", Color = " + color + ", Relleno = " + filled);

        System.exit(0);
    }
}
