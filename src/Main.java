//Volodymyr Volynets

public class Main {
    public static void main(String[] args) {
        // Test
        Circle circle = new Circle();
        printShape(circle);

        Diamond diamond = new Diamond();
        printShape(diamond);

        Oval oval = new Oval();
        printShape(oval);

        Rectangle rectangle = new Rectangle();
        printShape(rectangle);

        Square square = new Square();
        printShape(square);

        Triangle triangle = new Triangle();
        printShape(triangle);

    }

    public static void printShape(Shape shape) {
        System.out.println(shape.getName());
    }
}
