package WithInheritance;

import java.util.ArrayList;
import java.util.Objects;
/**
 * A Class That Contains Triangle Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public class Triangle extends Polygon{

    /**
     * Constructor for triangle
     * @param side1Length side 1 length
     * @param side2Length side 2 length
     * @param side3Length side 3 length
     */
    public Triangle(double side1Length,double side2Length,double side3Length){
        super(side1Length,side2Length,side3Length);
    }

    /**
     * Equals method
     * @param o object to compare
     * @return equality
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WithoutInheritance.Triangle)) return false;
        WithoutInheritance.Triangle triangle = (WithoutInheritance.Triangle) o;
        return getSides().equals(triangle.getSides());
    }

    /**
     * Hash Code Method
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    /**
     * get Sides method
     * @return sides list
     */
    public ArrayList<WithInheritance.Side> getSides() {

        return sides;
    }

    /**
     * Is Equilateral method
     * @return equilateral or not
     */
    public boolean isEquilateral(){
        return
                sides.get(0).equalLength(sides.get(1)) &&
                        sides.get(1).equalLength(sides.get(2)) &&
                        sides.get(2).equalLength(sides.get(0)) ;
    }

    /**
     * Calculate perimeter of triangle
     * @return perimeter
     */
    public double calculatePerimeter(){
        return
                sides.get(0).getLength() + sides.get(1).getLength() + sides.get(2).getLength();
    }

    /**
     * Calculate area method (using heron formula)
     * @return area
     */
    public double calculateArea(){
        double p = calculatePerimeter() / 2.0;

        return
                Math.sqrt(p * (p - sides.get(0).getLength()) * (p - sides.get(1).getLength()) * (p - sides.get(2).getLength()));

    }

    /**
     * Draw Method
     */
    public void draw(){
        System.out.println(
                toString() + " ,Area: " + calculateArea() + " ,Perimeter: " + calculatePerimeter()
        );
    }
}
