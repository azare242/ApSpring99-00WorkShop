package WithInheritance;

import java.util.ArrayList;
/**
 * A Class That Contains Polygon Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public abstract class Polygon extends Shape{

    /** sides List*/
    protected ArrayList<Side> sides;

    /**
     * Constructor for Polygon
     */
    public Polygon(){
        sides = new ArrayList<>();
    }

    /**
     * Calculate Perimeter of Polygon
     * @return perimeter
     */
    @Override
    public abstract double calculatePerimeter();

    /**
     * Calculate Area Of Polygon
     * @return area
     */
    @Override
    public abstract double calculateArea();

    /**
     * Draw Polygon
     */
    @Override
    public abstract void draw();

    /**
     * Polygon To String
     * @return string
     */
    @Override
    public abstract String toString();
}
