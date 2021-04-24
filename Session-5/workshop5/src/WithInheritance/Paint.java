package WithInheritance;

import java.util.ArrayList;
/**
 * A Class That Contains Paint Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public class Paint {

    /** Shapes List*/
    private ArrayList<Shape> shapes;

    /**
     * Constructor for Paint
     */
    public Paint(){
        shapes = new ArrayList<>();
    }

    /**
     * Add Shape Method
     * @param shape shape to add
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * Get Shapes Method
     * @return shapes
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    /**
     * Print All Method
     */
    public void drawAll(){
        for (Shape shape : shapes) shape.draw();
    }
    /**
     * Draw All Method
     */
    public void printAll(){
        for (Shape shape : shapes) System.out.println(shape.toString());
    }

}
