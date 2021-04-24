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
    public Polygon(double... sidesLength){
        sides = new ArrayList<>();

        if (this instanceof Triangle) {
            if (
                    (sidesLength[0] + sidesLength[1] >= sidesLength[2]
                            || sidesLength[1] + sidesLength[2] >= sidesLength[0]
                            || sidesLength[0] + sidesLength[2] >= sidesLength[1]) && (sidesLength[0] > 0 && sidesLength[1] > 0 && sidesLength[2] > 0)
            ) {
                sides.add(new Side(sidesLength[0]));
                sides.add(new Side(sidesLength[1]));
                sides.add(new Side(sidesLength[2]));
            }
        }
        else if (this instanceof Rectangle){
            if ((sidesLength[0] == sidesLength[2] && sidesLength[1] == sidesLength[3]) &&
                    sidesLength[0] > 0 && sidesLength[1] > 0 && sidesLength[2] > 0 && sidesLength[3] > 0){
                sides.add(new Side(sidesLength[0]));
                sides.add(new Side(sidesLength[1]));
                sides.add(new Side(sidesLength[2]));
                sides.add(new Side(sidesLength[3]));
            }
        } else System.out.println("Invalid Inputs");

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
    public String toString(){
        if (this instanceof Triangle) {
            return
                    "Triangle:: " +
                            "side1: " + sides.get(0).getLength()
                            +", side2: " + sides.get(1).getLength()
                            + " side3: " + sides.get(2).getLength();
        }
        else if (this instanceof Rectangle){
            return
                    "Rectangle:: " +
                            "side1: " + sides.get(0).getLength()
                            +", side2: " + sides.get(1).getLength()
                            + " side3: " + sides.get(2).getLength()
                            + ", side4: " + sides.get(3).getLength();
        }
        return "";
    }
}
