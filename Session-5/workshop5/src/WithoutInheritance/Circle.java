package WithoutInheritance;

import java.util.Objects;
/**
 * A Class That Contains Circle Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public class Circle {

    /** Circle Radius*/
    private double radius;

    /**
     * Constructor for circle with radius
     * @param radius radius
     */
    public Circle(double radius){
        if (radius > 0)
        this.radius = radius;

        else System.out.println("invalid input");
    }

    /**
     * Calculate perimeter of circle (2 * PI * radius)
     * @return perimeter
     */
    public double calculatePerimeter(){
        return Math.PI * 2 * radius;
    }

    /**
     * Calculate Area of circle (PI * radius * radius)
     * @return area
     */
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    /**
     * Get Radius method
     * @return radius
     */
    public double getRadius(){
        return radius;
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
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    /**
     * Hash code method
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    /**
     * To String Method
     * @return string of circle
     */
    @Override
    public String toString() {
        return "Circle : {" +
                "radius = " + radius +
                '}';
    }

}
