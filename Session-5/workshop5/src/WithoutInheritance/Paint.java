package WithoutInheritance;

import java.util.ArrayList;
/**
 * A Class That Contains Paint Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public class Paint {

    /** circle List */
    private ArrayList<Circle> circles ;
    /** triangle List */
    private ArrayList<Triangle> triangles;
    /** rectangle List */
    private ArrayList<Rectangle> rectangles ;

    /**
     * Constructor for paint
     */
    public Paint(){
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * Get Circles Method
     * @return circles
     */
    public ArrayList<Circle> getCircles() {
        return circles;
    }
    /**
     * Get Triangle Method
     * @return circles
     */
    public ArrayList<Triangle> getTriangles() {
        return triangles;
    }
    /**
     * Get rectangle Method
     * @return circles
     */
    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }

    /**
     * Add Circle Method
     * @param circle circle to add
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * Add Triangle Method
     * @param triangle triangle to add
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * Add Rectangle Method
     * @param rectangle rectangle to add
     */
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * Print All Method
     */
    public void printAll(){
        for (Triangle triangle : triangles) System.out.println(triangle.toString());
        for (Rectangle rectangle : rectangles) System.out.println(rectangle.toString());
        for (Circle circle : circles) System.out.println(circle.toString());
    }

    /**
     * Draw All Method
     */
    public void drawAll(){
        for (Triangle triangle : triangles) triangle.draw();
        for (Rectangle rectangle : rectangles) rectangle.draw();
        for (Circle circle : circles) circle.draw();
    }

}
