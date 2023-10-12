package Task4;

public class Square implements Shape {

    double length;
    double height;

    public Square(double length,double height){
        this.length = length;
        this.height = height;

    }

    @Override
    public double getArea() {
        double result = length * height;
        System.out.println(result);
        return result;
    }
}
