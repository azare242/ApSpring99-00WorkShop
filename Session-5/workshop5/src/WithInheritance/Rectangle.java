package WithInheritance;

import WithoutInheritance.Side;

import java.util.ArrayList;
import java.util.Objects;
/**
 * A Class That Contains Rectangle Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public class Rectangle extends Polygon{

    /**
     * Constructor for Rectangle
     * @param side1Length side 1 length
     * @param side2Length side 2 length
     * @param side3Length side 3 length
     * @param side4Length side 4 length
     */
    public Rectangle(double side1Length,double side2Length,double side3Length,double side4Length){
        super();
        if ( (side1Length == side3Length && side2Length == side4Length ) &&
                (side1Length > 0 && side2Length > 0 && side3Length > 0 && side4Length > 0) )  {
            sides.add(new WithInheritance.Side(side1Length));
            sides.add(new WithInheritance.Side(side2Length));
            sides.add(new WithInheritance.Side(side3Length));
            sides.add(new WithInheritance.Side(side4Length));

        }
        else System.out.println("invalid inputs");
    }

    /**
     * Get Sides List
     * @return sides
     */
    public ArrayList<WithInheritance.Side> getSides(){
        return sides;
    }

    /**
     * Is Square Method
     * @return square or not
     */
    public boolean isSquare(){
        return
                sides.get(0).equalLength(sides.get(1)) &&
                        sides.get(1).equalLength(sides.get(2)) &&
                        sides.get(2).equalLength(sides.get(3)) &&
                        sides.get(3).equalLength(sides.get(0)) ;
    }

    /**
     * Calculate perimeter method
     * @return perimeter
     */
    public double calculatePerimeter(){
        return 2 * ( sides.get(0).getLength()
                + sides.get(1).getLength() );
    }

    /**
     * Calculate Area Method
     * @return area
     */
    public double calculateArea(){
        return
                sides.get(0).getLength() * sides.get(1).getLength();
    }

    /**
     * Draw Method
     */
    public void draw(){
        System.out.println(
                toString() + " ,Area: " + calculateArea() + " ,Perimeter: " + calculatePerimeter()
        );
    }

    /**
     * Equals method
     * @param o object to compare
     * @return equality
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WithoutInheritance.Rectangle)) return false;
        WithoutInheritance.Rectangle rectangle = (WithoutInheritance.Rectangle) o;
        return getSides().equals(rectangle.getSides());
    }

    /**
     * Hash Code Method
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    /**
     * To String Method
     * @return string of rectangle
     */
    @Override
    public String toString() {
        return "Rectangle : {" +
                "sides length = " + sides.get(0).getLength() +" , "+sides.get(1).getLength() +" , "+ sides.get(2).getLength() +" , "+ sides.get(3).getLength() +
                '}';
    }
}
