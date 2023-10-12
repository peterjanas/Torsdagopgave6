package Task4;

public class Circle implements Shape {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double result = 3.14 * (radius*radius);
        System.out.println(result);
        return result;

    }
}
