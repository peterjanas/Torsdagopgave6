package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> listOfShape = new ArrayList<>();


    public void addShape(Shape s) {
    listOfShape.add(s);
    }

    public double getTotalArea(){
        double result = 0;
        for (int i = 0; i < listOfShape.size(); i++){
            result = listOfShape.get(i).getArea() + result;
        }

        return result;
    }

}
