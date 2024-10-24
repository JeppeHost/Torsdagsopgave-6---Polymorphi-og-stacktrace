import java.util.ArrayList;
public class ShapeBuilder {

    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape s) {
        this.shapeList.add(s);
    }

    public double getTotalArea(){
        double totalArea = 0;

        for(Shape s : shapeList){
            totalArea += s.getArea();
        }
        return totalArea;
    }
}
