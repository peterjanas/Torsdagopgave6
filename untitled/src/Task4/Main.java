package Task4;

public class Main {
    public static void main(String[] args) {

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        Circle circle1 = new Circle(10);
        Square square1 = new Square(10,5);

        shapeBuilder.addShape(circle1);
        shapeBuilder.addShape(square1);

        System.out.println(shapeBuilder.getTotalArea());
    }
}
