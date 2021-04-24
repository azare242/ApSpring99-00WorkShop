package WithInheritance;
/**
 * A Class That Contains Shape Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public abstract class Shape {
    /**
     * Calculate Perimeter of shape
     * @return perimeter
     */
    public abstract double calculatePerimeter();

    /**
     * Calculate Area of shape
     * @return area
     */
    public abstract double calculateArea();

    /**
     * Draw Method
     */
    public abstract void draw();

    /**
     * To String method
     * @return to String
     */
    @Override
    public abstract String toString();

}
